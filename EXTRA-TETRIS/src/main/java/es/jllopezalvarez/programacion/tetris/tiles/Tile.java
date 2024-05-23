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
        // Tras rotar, puede que la pieza se haya salido del tablero por la izquierda o derecha.
        // Si es el caso, tenemos que mover la pieza una posición al lado contrario al que se ha salido.
        int actualLeftPosition = computeActualLeftPosition(this.position);
        if (actualLeftPosition < 0){
            this.position = this.position.moveOneSquareRight();
        }
        int actualRightPosition = computeActualRightPosition(this.position);
        if (actualRightPosition > Settings.COL_COUNT-1){
            this.position = this.position.moveOneSquareLeft();
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

    public boolean moveOneSquareDown(GameBoard board) {
        // Calculamos nueva posicion
        TilePosition newPosition = this.position.moveOneSquareDown();
        if (!this.overflowsBottom(newPosition)) {
            if (!this.collides(newPosition, board)){
                this.position = newPosition;
                return true;
            }
        }
        return false;

    }

    private boolean collides(TilePosition position, GameBoard board) {

        int baseCol = position.getCol();
        int baseRow = position.getRow();

        for (int row = 0; row < this.currentMatrix.length; row++) {
            for (int col = 0; col < this.currentMatrix[0].length; col++) {
                if (this.currentMatrix[row][col]) {
                    int targetRow = baseRow + row;
                    int targetCol = baseCol + col;
                    if (!board.isEmpty(targetRow, targetCol)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean moveOneSquareLeft(GameBoard board) {
        // Calculamos nueva posicion
        TilePosition newPosition = this.position.moveOneSquareLeft();
        if (!this.overflowsLeft(newPosition)) {
            if (!this.collides(newPosition, board)){
                this.position = newPosition;
                return true;
            }
        }
        return false;
    }

    public boolean moveOneSquareRight(GameBoard board) {
        // Calculamos nueva posicion
        TilePosition newPosition = this.position.moveOneSquareRight();
        if (!this.overflowsRight(newPosition)) {
            if (!this.collides(newPosition, board)){
                this.position = newPosition;
                return true;
            }
        }
        return false;
    }


    private boolean overflowsLeft(TilePosition position) {
        int actualLeftPosition = this.computeActualLeftPosition(position);
        return actualLeftPosition < 0;
    }

    private int computeActualLeftPosition(TilePosition position) {
        // Asumimos que hay "color" en la primera columna de la matriz
        int actualLeftPosition = position.getCol();
        //  Recorremos la matriz por columnas, de izquierda a derecha, hasta que encontramos una con contenido (true).
        //  En cada iteración, incrementamos la posición izquierda real si no hay ninguna con contenido en la columna.
        boolean colorFound = false;
        for (int col = 0; col < this.currentMatrix[0].length && !colorFound; col++) {
            for (int row = 0; row < this.currentMatrix.length && !colorFound; row++) {
                if (this.currentMatrix[row][col]) {
                    colorFound = true;
                }
            }
            if (!colorFound) {
                actualLeftPosition++;
            }
        }
        return actualLeftPosition;
    }

    public boolean overflowsRight(TilePosition position) {
        int actualRightPosition = this.computeActualRightPosition(position);
        return actualRightPosition > (Settings.COL_COUNT - 1);
    }

    private int computeActualRightPosition(TilePosition position) {
        // Asumimos que hay "color" en la última columna de la matriz
        int actualRightPosition = position.getCol() + this.getMatrixWidth() - 1;
        //  Recorremos la matriz por columnas, de derecha a izquierda, hasta que encontramos una con contenido (true).
        //  En cada iteración, decrementamos la posición derecha real si no hay ninguna con contenido en la columna.
        boolean colorFound = false;
        for (int col = this.currentMatrix[0].length - 1; col >= 0 && !colorFound; col--) {
            for (int row = 0; row < this.currentMatrix.length && !colorFound; row++) {
                if (this.currentMatrix[row][col]) {
                    colorFound = true;
                }
            }
            if (!colorFound) {
                actualRightPosition--;
            }
        }
        return actualRightPosition;
    }

    public boolean overflowsBottom(TilePosition position) {
        int actualBottomPosition = this.computeActualBottomPosition(position);
        return actualBottomPosition > (Settings.ROW_COUNT - 1);
    }

    private int computeActualBottomPosition(TilePosition position) {
        // Asumimos que hay "color" en la última fila de la matriz
        int actualBottomPosition = position.getRow() + this.getMatrixWidth() - 1;
        //  Recorremos la matriz por filas, de abajo a arriba, hasta que encontramos una con contenido (true).
        //  En cada iteración, decrementamos la posición inferior real si no hay ninguna con contenido en la fila.
        boolean colorFound = false;
        for (int row = this.currentMatrix.length-1; row>=0  && !colorFound; row--) {
            for (int col = 0; col < this.currentMatrix[row].length && !colorFound; col++){
                if (this.currentMatrix[row][col]){
                    colorFound = true;
                }
            }
            if (!colorFound) {
                actualBottomPosition--;
            }
        }
        return actualBottomPosition;
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
