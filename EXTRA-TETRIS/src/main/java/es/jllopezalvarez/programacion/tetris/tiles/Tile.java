package es.jllopezalvarez.programacion.tetris.tiles;

import es.jllopezalvarez.programacion.tetris.GameBoard;
import es.jllopezalvarez.programacion.tetris.Settings;
import es.jllopezalvarez.programacion.tetris.tiles.tiles.*;

import java.awt.*;
import java.util.Random;

public abstract class Tile {
    private static final int TILE_TYPES_COUNT = 7;
    private static final Random rnd = new Random();
    private boolean[][] currentMatrix;
    private TilePosition position;

    protected Tile() {
        this.currentMatrix = this.getInitialMatrix();
        this.position = this.getStartingPosition();
    }


    public abstract Color getColor();

    public TilePosition getPosition() {
        return position;
    }


    public boolean[][] getCurrentMatrix() {
        return currentMatrix;
    }

    public abstract boolean[][] getNorthMatrix();

    public abstract boolean[][] getEastMatrix();

    public abstract boolean[][] getSouthMatrix();

    public abstract boolean[][] getWestMatrix();

    public abstract boolean[][] getInitialMatrix();

    public TilePosition getStartingPosition() {
        // TODO: ajustar para pares e impares
        return new TilePosition(0, (Settings.COL_COUNT / 2) - (getMatrixWidth() / 2));
    }

    public abstract int getMatrixWidth();


    public void rotate(GameBoard board) {
        if (currentMatrix == this.getNorthMatrix()) {
            currentMatrix = this.getEastMatrix();
        } else if (currentMatrix == this.getEastMatrix()) {
            currentMatrix = this.getSouthMatrix();
        } else if (currentMatrix == this.getSouthMatrix()) {
            currentMatrix = this.getWestMatrix();
        } else if (currentMatrix == this.getWestMatrix()) {
            currentMatrix = this.getNorthMatrix();
        }
    }

    public void paint(Graphics2D graphics) {
        int tileOriginX = this.position.getCol() * Settings.SQUARE_SIZE;
        int tileOriginY = this.position.getRow() * Settings.SQUARE_SIZE;

        for (int row = 0; row < this.currentMatrix.length; row++) {
            for (int col = 0; col < this.currentMatrix[0].length; col++) {
                if (this.currentMatrix[row][col]) {
                    int x = tileOriginX + (col * Settings.SQUARE_SIZE);
                    int y = tileOriginY + (row * Settings.SQUARE_SIZE);
                    graphics.setColor(this.getColor());
                    graphics.fillRect(x, y, Settings.SQUARE_SIZE, Settings.SQUARE_SIZE);
                    graphics.setColor(Color.WHITE);
                    graphics.drawRect(x, y, Settings.SQUARE_SIZE, Settings.SQUARE_SIZE);
                }
            }
        }
    }

    public boolean moveOneSquareDown(GameBoard board){
        // Calculamos nueva posicion
        TilePosition newPosition = this.position.moveOneSquareDown();
        if (!newPosition.overflowsBottom(this.getMatrixWidth())){
            // TODO: Comprobar que la pieza no ha colisionado

            this.position = newPosition;
            return  true;
        }
        return false;

    }

    public boolean moveOneSquareLeft(GameBoard board) {
        // Calculamos nueva posicion
        TilePosition newPosition = this.position.moveOneSquareLeft();
        if (!newPosition.overflowsLeft()){
            // TODO: Comprobar que la pieza no ha colisionado

            this.position = newPosition;
            return  true;
        }
        return false;
    }
    public boolean moveOneSquareRight(GameBoard board) {
        // Calculamos nueva posicion
        TilePosition newPosition = this.position.moveOneSquareRight();
        if (!newPosition.overflowsRight(this.getMatrixWidth())){
            // TODO: Comprobar que la pieza no ha colisionado

            this.position = newPosition;
            return  true;
        }
        return false;
    }

    public static Tile createRandomTile() {
        int randomTileNumber = rnd.nextInt(TILE_TYPES_COUNT);
        return switch (randomTileNumber) {
            case 0 -> new ITile();
            case 1 -> new JTile();
            case 2 -> new LTile();
            case 3 -> new OTile();
            case 4 -> new STile();
            case 5 -> new TTile();
            case 6 -> new ZTile();
            default -> throw new IllegalStateException("Tipo de pieza no válido: " + randomTileNumber);
        };

    }


}
