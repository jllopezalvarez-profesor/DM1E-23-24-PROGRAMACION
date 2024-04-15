package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.io.*;
import java.nio.file.Path;

public class Ejemplo02 {

    private static final Path PATH_FICHERO_BINARIO = Path.of("ejemplos", "ejemplo02", "fichero-binario.dat");
    private static final Path PATH_FICHERO_TEXTO = Path.of("ejemplos", "ejemplo02", "fichero-texto.txt");

    public static void main(String[] args) throws IOException {

        // Asegurarme de que existe la carpeta de destino
        PATH_FICHERO_BINARIO.toFile().getParentFile().mkdirs();

        // crear stream para escribir en fichero binario
        try (FileOutputStream fos = new FileOutputStream(PATH_FICHERO_BINARIO.toFile());
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(1500);
            dos.writeBoolean(true);
            dos.writeDouble(100.25);
            dos.writeUTF("Hola a todos.");
        }

        // Asegurarme de que existe la carpeta de destino
        PATH_FICHERO_TEXTO.toFile().getParentFile().mkdirs();

        // Escribir fichero de texto
        try (FileWriter fw = new FileWriter(PATH_FICHERO_TEXTO.toFile());
             PrintWriter pw = new PrintWriter(fw)) {
            pw.print(1500);

            pw.write(String.valueOf(true));
            pw.write(String.valueOf( 100.25));
            pw.print("Hola a todos");
        }


    }
}
