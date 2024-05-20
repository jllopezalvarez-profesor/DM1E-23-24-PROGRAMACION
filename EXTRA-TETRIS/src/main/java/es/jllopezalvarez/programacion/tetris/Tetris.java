package es.jllopezalvarez.programacion.tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tetris {
    public static void main(String[] args) {
        GamePanel gamePanel = new GamePanel();
        gamePanel.setPreferredSize(new Dimension(600, 800));
        gamePanel.setBackground(Color.BLACK);
        gamePanel.startGameLoop();

        JFrame window = new JFrame();
        window.add(gamePanel);
        window.pack();
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gamePanel.endGameLoop();
            }
        });





        window.setVisible(true);

    }
}
