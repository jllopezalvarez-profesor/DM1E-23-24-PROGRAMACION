package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.*;
import java.nio.file.Path;
import java.util.Set;

public class Ejercicio06 {
    private static final Path FICHERO_ENTRADA = Path.of("ejercicios", "03", "parrafo.txt");
    private static final Path FICHERO_SALIDA = Path.of("ejercicios", "04", "parrafoSinVocales.txt");

    private static final Set<Character> VOCALES = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {

        // Asegurarme de que el directorio del fichero de escritura existe
        FICHERO_SALIDA.toFile().getParentFile().mkdirs();

        // Abrir ficheros de lectura y de escritura
        try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO_ENTRADA.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_SALIDA.toFile()))) {
            int c;
            while ((c = reader.read()) != -1) {
                char caracterLeido = (char) c;
                if (!VOCALES.contains(caracterLeido)){
                    writer.write(caracterLeido);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
