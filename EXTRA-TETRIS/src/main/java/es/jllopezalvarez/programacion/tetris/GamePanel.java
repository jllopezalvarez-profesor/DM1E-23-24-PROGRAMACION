package es.jllopezalvarez.programacion.tetris;

import es.jllopezalvarez.programacion.tetris.tiles.JTile;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    private int x = 0;
    private int y = 0;

    private Thread gameLoopThread;

    //region Control de FPS
    private static final long NANOS_IN_ONE_SECOND = 1_000_000_000;
    private static final long DESIRED_FPS = 30;
    private static final long FRAME_DURATION = NANOS_IN_ONE_SECOND / 30;
    private long currentFps = 0;


    JTile tile = new JTile();

    //endregion


    public GamePanel() {


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;


        g2d.setColor(Color.yellow);
        g2d.drawRect(x, y, 50, 50);

        tile.paint(g2d);

        g2d.setColor(Color.white);
        Font currentFont = g2d.getFont();
        Font fpsFont = currentFont.deriveFont(currentFont.getSize() * 2f);
        g2d.setFont(fpsFont);

        g2d.drawString(String.format("%d FPS", this.currentFps), 10, getHeight()-10);

//        System.out.println("En paintComponent");


    }

    @Override
    public void run() {
        try {
            long fpsCount = 0;
            long lastCheckFps = System.nanoTime();
            while (true) {

                fpsCount++;
                long elapsed = System.nanoTime() - lastCheckFps;
                if (elapsed > NANOS_IN_ONE_SECOND) {
                    this.currentFps = fpsCount;
                    fpsCount = 0;
                    lastCheckFps = System.nanoTime();
                }

                Thread.sleep(FRAME_DURATION/1000000);


                x++;
                if (x > this.getWidth()){
                    this.x = 0;
                }
                y++;
                if (y > this.getHeight()){
                    this.y = 0;
                }

//                System.out.printf("Posición: %d,%d\n", x, y);
                this.repaint();

                if (Thread.interrupted()){
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Saliendo del bucle de juego");
        }
    }

    public void startGameLoop() {
        this.gameLoopThread = new Thread(this);
        this.gameLoopThread.start();
    }

    public void endGameLoop(){
        this.gameLoopThread.interrupt();
    }

}
