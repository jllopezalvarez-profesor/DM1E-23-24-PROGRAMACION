package es.jllopezalvarez.programacion.tetris.tiles.tiles;

import es.jllopezalvarez.programacion.tetris.tiles.Tile;

import java.awt.*;

public class OTile extends Tile {
    private static final Color COLOR = Color.YELLOW;
    private static final int MATRIX_WIDTH = 2;
    private static final boolean[][] COMMON_MATRIX = {
            {true, true },
            {true, true}
    };

    @Override
    public Color getColor() {
        return COLOR;
    }

    @Override
    public int getMatrixWidth() {
        return MATRIX_WIDTH;
    }

    @Override
    public boolean[][] getNorthMatrix() {
        return COMMON_MATRIX;
    }

    @Override
    public boolean[][] getEastMatrix() {
        return COMMON_MATRIX;
    }

    @Override
    public boolean[][] getSouthMatrix() {
        return COMMON_MATRIX;
    }

    @Override
    public boolean[][] getWestMatrix() {
        return COMMON_MATRIX;
    }

    @Override
    public boolean[][] getInitialMatrix() {
        return getNorthMatrix();
    }
}
