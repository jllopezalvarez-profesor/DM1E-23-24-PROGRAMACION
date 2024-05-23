package es.jllopezalvarez.programacion.tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

public class Tetris {
    public static void main(String[] args) {
        // Habilitamos OpenGL para acelerar las funciones gráficas
        // Evita el movimiento "a saltos" cuando no tenemos el ratón sobre la ventana
//        enableOpenGL();

        // Creamos el panel de juego
        GamePanel gamePanel = createGamePanel();

        // Creamos ventana para contener el panel
        JFrame window = createGameWindow(gamePanel);

        // Mostramos la ventana
        window.setVisible(true);

        // Arrancamos el bucle del juego
        gamePanel.startGameLoop();
    }

    private static void enableOpenGL() {
        // TODO: verificar que esto funciona en otras plataformas distintas a linux.
        System.setProperty("sun.java2d.opengl", "true");
    }

    private static GamePanel createGamePanel() {
        GamePanel gamePanel = new GamePanel();
        gamePanel.setPreferredSize(new Dimension(Settings.PANEL_WIDTH, Settings.PANEL_HEIGHT));
        gamePanel.setBackground(Settings.APP_BACKGROUND_COLOR);
        return gamePanel;
    }

    private static JFrame createGameWindow(GamePanel gamePanel) {
        JFrame window = new JFrame();
        window.setTitle(Settings.APP_TITLE);
        setWindowIcon(window);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.add(gamePanel);
        window.pack();
        window.setResizable(false);
        // Centrar en pantalla
        window.setLocationRelativeTo(null);

        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gamePanel.endGameLoop();
            }
        });
        return window;
    }

    private static void setWindowIcon(JFrame window) {
        // La imagen está ubicada en la carpeta "resources",
        // no dentro de las carpetas de código (src)
        URL iconURL = Tetris.class.getResource("/icon.png");
        // Si no se encuentra la imagen, iconURL será null
        if (iconURL != null){
            ImageIcon icon = new ImageIcon(iconURL);
            window.setIconImage(icon.getImage());
        }
    }


}
