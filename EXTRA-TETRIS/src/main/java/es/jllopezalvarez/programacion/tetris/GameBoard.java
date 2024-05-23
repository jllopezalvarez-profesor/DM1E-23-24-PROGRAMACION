package es.jllopezalvarez.programacion.tetris;

import es.jllopezalvarez.programacion.tetris.tiles.Tile;
import es.jllopezalvarez.programacion.tetris.tiles.TilePosition;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class GameBoard {
    private final Color[][] board;

    public GameBoard() {
        this.board = new Color[Settings.ROW_COUNT][Settings.COL_COUNT];
        // El array debería estar lleno de null, pero si no lo estuviera podemos
        // llenarlo con un poco de programación funcional:
        // Arrays.stream(board).forEach(row -> Arrays.fill(row, null));

        //TODO: Eliminar este tablero generado aleatoriamente.
        //fillRandomBoard(this.board);
        //almostFillLastRow(this.board);
    }

    private void almostFillLastRow(Color[][] board) {
        Arrays.fill(this.board[this.board.length - 1], Color.RED);
        this.board[this.board.length - 1][0] = null;
    }

    private void fillRandomBoard(Color[][] board) {
        Color[] colors = {Color.CYAN, Color.BLUE, Color.ORANGE, Color.YELLOW, Color.GREEN, new Color(129, 20, 184), Color.RED, null};
        Random rnd = new Random();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                int colorPosition = rnd.nextInt(colors.length);
                board[row][col] = colors[colorPosition];
            }
        }
    }

    /**
     * Elimina todas las filas completas en el tablero.
     *
     * @return número de filas que se han eliminado.
     */
    public int removeCompleteRows() {
        int numRowsRemoved = 0;

        // Vamos a recorrer de abajo hacia arriba
        int currentRowNum = this.board.length - 1;
        // Terminamos cuando hemos procesado la fila "0"
        while (currentRowNum > 0) {
            Color[] currentRow = this.board[currentRowNum];
            // Si hay algún cuadrado en la fila que es null, es que no está llena
            if (Arrays.stream(currentRow).anyMatch(Objects::isNull)) {
                // Si la fila no está llena, pasamos a la fila que está por encima.
                currentRowNum--;
            } else {
                // Eliminamos la fila llena, lo que compacta el tablero de juego.
                removeRow(currentRowNum);
                // Incrementamos el número de filas eliminadas
                numRowsRemoved++;
                // No cambiamos de fila porque la fila en la que estábamos se habrá
                // llenado con la superior, y hay que analizarla.
            }
        }

        // Devolvemos el número de filas eliminadas. Puede ser util para puntuación
        return numRowsRemoved;
    }


    private void removeRow(int rowNum) {
        // "Bajamos" todas las filas por encima de la que queremos eliminar
        // TODO: revisar este método porque no está limpiando correctamente las líneas superiores
        for (int i = rowNum - 1; i >= 0; i--) {
            this.board[i + 1] = this.board[i];
        }
        // Añadimos una fila nueva
        this.board[0] = new Color[Settings.COL_COUNT];
    }

    public void paint(Graphics2D graphics) {
        for (int row = this.board.length / 2; row < this.board.length; row++) {
            for (int col = 0; col < this.board[0].length; col++) {
                if (this.board[row][col] != null) {
                    int x = col * Settings.SQUARE_SIZE;
                    int y = row * Settings.SQUARE_SIZE;
                    graphics.setColor(this.board[row][col]);
                    graphics.fillRect(x, y, Settings.SQUARE_SIZE, Settings.SQUARE_SIZE);
                    graphics.setColor(Color.WHITE);
                    graphics.drawRect(x, y, Settings.SQUARE_SIZE, Settings.SQUARE_SIZE);
                }
            }
        }
    }

    public void consolidateTile(Tile tile) {
        TilePosition currentPosition = tile.getPosition();
        boolean[][] currentMatrix = tile.getCurrentMatrix();

        for (int row = 0; row < currentMatrix.length; row++) {
            for (int col = 0; col < currentMatrix[0].length; col++) {
                if (currentMatrix[row][col]) {
                    this.board[currentPosition.getRow() + row][currentPosition.getCol() + col] = tile.getColor();
                }
            }
        }

    }

    public boolean isEmpty(int row, int col) {
        return this.board[row][col] == null;
    }
}
