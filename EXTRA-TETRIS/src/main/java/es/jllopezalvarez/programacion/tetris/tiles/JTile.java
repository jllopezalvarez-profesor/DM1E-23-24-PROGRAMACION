package es.jllopezalvarez.programacion.tetris.tiles;

import java.awt.*;

public class JTile {

    private static final boolean[][] MATRIX_0_DEG = {
            {false, false, true},
            {false, false, true},
            {false, true, true}};

    private static final boolean[][] MATRIX_270_DEG = {
            {false, false, false},
            {true, false, false},
            {true, true, true}};
    private static final boolean[][] MATRIX_180_DEG = {
            {true, true, false},
            {true, false, false},
            {true, false, false}};
    private static final boolean[][] MATRIX_90_DEG = {
            {true, true, true},
            {false, false, true},
            {false, false, false}};

    private boolean[][] currentMatrix;

    public JTile() {
        this.currentMatrix = MATRIX_0_DEG;
    }

    public void rotate() {
        if (this.currentMatrix == MATRIX_0_DEG) {
            this.currentMatrix = MATRIX_270_DEG;
        } else if (this.currentMatrix == MATRIX_270_DEG) {
            this.currentMatrix = MATRIX_180_DEG;
        } else if (this.currentMatrix == MATRIX_180_DEG) {
            this.currentMatrix = MATRIX_90_DEG;
        } else {
            this.currentMatrix = MATRIX_0_DEG;
        }
    }

    public void paint(Graphics2D graphics){

    }


}
