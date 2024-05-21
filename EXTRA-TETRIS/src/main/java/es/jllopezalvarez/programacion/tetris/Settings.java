package es.jllopezalvarez.programacion.tetris;

import java.awt.*;

public class Settings {
    private Settings() {
        // Evitamos que se construyan objetos de esta clase de utilidad
    }

    public static final String APP_TITLE = "Tetris (o algo parecido)";
    public static final Color APP_BACKGROUND_COLOR = Color.BLACK;
    public static final int SQUARE_SIZE = 30;
    public static final int ROW_COUNT = 30;
    public static final int COL_COUNT = 18;
    public static final int PANEL_HEIGHT = ROW_COUNT * SQUARE_SIZE;
    public static final int PANEL_WIDTH = COL_COUNT * SQUARE_SIZE;


    public static final boolean SHOW_FPS = true;
    public static final long NANOS_IN_ONE_SECOND = 1_000_000_000;
    public static final long DESIRED_FPS = 60;
    public static final long FRAME_DURATION = NANOS_IN_ONE_SECOND / DESIRED_FPS;
    public static final long FRAME_DURATION_MS = FRAME_DURATION / 1_000_000;


    public static final boolean USE_ANTIALIASING = true;


}
