package es.jllopezalvarez.programacion.tetris.tiles;

import es.jllopezalvarez.programacion.tetris.Settings;

public class TilePosition {
    private final int row;
    private final int col;

    public TilePosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public TilePosition moveOneSquareUp() {
        return new TilePosition(row - 1, col);
    }

    public TilePosition moveOneSquareDown() {
        return new TilePosition(row + 1, col);
    }


    public TilePosition moveOneSquareLeft() {
        return new TilePosition(row, col - 1);
    }

    public TilePosition moveOneSquareRight() {
        return new TilePosition(row, col + 1);
    }

    public boolean overflowsLeft() {
        return this.col < 0;
    }

    public boolean overflowsRight(int matrixWidth) {
        return (this.col + matrixWidth-1) > (Settings.COL_COUNT - 1);
    }

    public boolean overflowsBottom(int matrixWidth) {
        return (this.row + matrixWidth-1) > (Settings.ROW_COUNT - 1);
    }


}
