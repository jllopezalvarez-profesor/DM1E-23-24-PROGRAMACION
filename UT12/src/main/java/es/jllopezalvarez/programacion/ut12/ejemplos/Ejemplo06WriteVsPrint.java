package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class Ejemplo06WriteVsPrint {

    private static final Path FICHERO_EJEMPLO = Path.of("ejemplos", "ejemplo06", "write-vs-print.txt");
    public static void main(String[] args) throws FileNotFoundException {
        int numero = 853434432;

        try (PrintWriter pw = new PrintWriter(FICHERO_EJEMPLO.toFile())) {
            pw.println("Valor cuando se usa print:");
            pw.print(numero);
            pw.println();
            pw.println("Valor cuando se usa write:");
            pw.write(numero);
            pw.println();
            pw.println("Valor cuando se usa write con string:");
            pw.write("Hola");
            pw.println();

        }

    }
}
