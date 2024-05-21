package es.jllopezalvarez.programacion.tetris.tiles.tiles;

import es.jllopezalvarez.programacion.tetris.tiles.Tile;

import java.awt.*;

public class ZTile extends Tile {
    private static final Color COLOR = Color.RED;
    private static final int MATRIX_WIDTH = 3;
    private static final boolean[][] NORTH_MATRIX = {
            {true, true, false},
            {false, true, true},
            {false, false, false}
    };
    private static final boolean[][] EAST_MATRIX = {
            {false, false, true},
            {false, true, true},
            {false, true, false}
    };
    private static final boolean[][] SOUTH_MATRIX = {
            {false, false, false},
            {true, true, false},
            {false, true, true}
    };
    private static final boolean[][] WEST_MATRIX = {
            {false, true, false},
            {true, true, false},
            {true, false, false}
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
    public boolean[][] getNorthMatrix() {        return NORTH_MATRIX;    }

    @Override
    public boolean[][] getEastMatrix() {
        return EAST_MATRIX;
    }

    @Override
    public boolean[][] getSouthMatrix() {
        return SOUTH_MATRIX;
    }

    @Override
    public boolean[][] getWestMatrix() {
        return WEST_MATRIX;
    }

    @Override
    public boolean[][] getInitialMatrix() {
        return getNorthMatrix();
    }
}
