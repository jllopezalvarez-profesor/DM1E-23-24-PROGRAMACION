package es.jllopezalvarez.programacion.tetris;

import es.jllopezalvarez.programacion.tetris.tiles.JTile;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    private int x = 0;
    private int y = 0;

    //region Atributos para control del hilo para el bucle del juego
    private Thread gameLoopThread;
    private boolean endGameLoopRequested = false;
    //endregion

    //region Control y marcador de FPS
    long fpsCount = 0;
    long lastCheckFps = System.nanoTime();
    private long currentFps = 0;
    //endregion


    JTile tile = new JTile();


    public GamePanel() {


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Convertimos el objeto a Graphics2D para tener más métodos a nuestra disposición
        Graphics2D g2d = (Graphics2D) g;

        // El anialiasing suaviza los bordes de figuras curvas y diagonales,
        // como por ejemplo las letras y números del contador FPS
        if (Settings.USE_ANTIALIASING) {
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }


        g2d.setColor(Color.yellow);
        g2d.drawRect(x, y, 50, 50);

        tile.paint(g2d);

        if (Settings.SHOW_FPS) {
            paintFps(g2d);
        }
    }

    private void paintFps(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        // Como la fuente por defecto es algo pequeña, obtenemos
        // una fuente el doble de grande que la actual
        Font currentFont = g2d.getFont();
        Font fpsFont = currentFont.deriveFont(currentFont.getSize() * 2f);
        g2d.setFont(fpsFont);
        // Dibujamos la fuente
        g2d.drawString(String.format("%d FPS", this.currentFps), 10, getHeight() - 20);
    }


    @Override
    public void run() {

        while (!endGameLoopRequested) {
            try {
                // Mostramos FPS si está activo el setting
                if (Settings.SHOW_FPS) {
                    countAndShowFps();
                }

                // Limitamos los FPS para no consumir más recursos de los necesarios
                limitFps();

                // De momento movemos el cuadrado por pantalla. Ya haremos cosas con piezas y tablero.
                x++;
                if (x > this.getWidth()) {
                    this.x = 0;
                }
                y++;
                if (y > this.getHeight()) {
                    this.y = 0;
                }

                // Llamamos a repaint() del componente. Este método se encargará de llamar de
                // forma adecuada al método paintComponent, que usamos para "pintar" el juego.
                this.repaint();

                // Siempre que se trabaja en hilos, en un bucle, hay que hacer esta comprobación.
                // Cuando alguien llama al método interrupt() del hilo, si este no está parado en
                // un sleep, wait u otro método de sincronización, no se lanza InterruptedException,
                // sino que se pone un flag "interrupted" para que se evalúe
                if (Thread.interrupted()) {
                    // Si se ha activado el flag, lanzamos la excepción para interrumpir el hilo
                    // Alternativamente, se podría poner "endGameLoopRequested" a true, pero este
                    // patrón de lanzar excepción es habitual, porque se suele centralizar la
                    // liberación de recursos en el catch de esta excepción.
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                // Esta excepción puede saltar en dos situaciones:
                // - Cuando la lanzamos nosotros dentro del bucle
                // - Mientras estamos en el sleep que limita las FPS
                // En ambos casos, tenemos que terminar el bucle de juego
                // y salir del método "run", lo que finaliza el hilo de ejecución
                System.out.println("Saliendo del bucle de juego");
                this.endGameLoopRequested = true;
            }
        }

    }

    private static void limitFps() throws InterruptedException {
        // Esto no es completamente correcto.
        // El número de frames por segundo no depende solo del cálculo hecho con constantes
        // en Settings, también depende de la carga de los procesos del juego, pero de momento
        // lo dejamos así. Habría que hacer algo parecido al sistema para contar FPS, en el que
        // mediríamos el tiempo invertido y dormiríamos el hilo el tiempo restante hasta
        // la duración de un frame
        Thread.sleep(Settings.FRAME_DURATION_MS);
    }

    private void countAndShowFps() {
        // En cada ciclo del bucle de juego se incrementa el contador de FPS
        this.fpsCount++;
        // Calculamos cuanto tiempo pasó desde la última vez que comprobamos FPS
        long elapsed = System.nanoTime() - this.lastCheckFps;
        // Si ha pasado un segundo, nos guardamos las FPS contadas en ese último segundo
        // También iniciamos una nueva cuenta para el siguiente segundo.
        if (elapsed > Settings.NANOS_IN_ONE_SECOND) {
            this.currentFps = fpsCount;
            this.fpsCount = 0;
            this.lastCheckFps = System.nanoTime();
        }
    }

    public void startGameLoop() {
        // Creamos un hilo para el bucle del juego.
        // Este hilo es el que se encargará de actualizar
        // los elementos de juego, y llamar al método de repintado
        this.gameLoopThread = new Thread(this);
        // Los hilos se lanzan con "start()". Al llamar a start,
        // se lanza el método "run" del hilo.
        this.gameLoopThread.start();
    }

    public void endGameLoop() {
        // Interrumpimos el hilo de ejecución del bucle de juego
        // Si este hilo no se interrumpe, la aplicación no se cerraría.
        // Una alternatica sería usar el método "setDaemon(true)" al crear
        // el hilo, siempre antes de llamar a start. Esto crearía un hilo
        // "demonio", que se cierra cuando el hilo principal de la aplicación
        // se cierra.
        this.gameLoopThread.interrupt();
    }

}
