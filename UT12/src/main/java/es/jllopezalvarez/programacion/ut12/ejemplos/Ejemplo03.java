package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.io.*;
import java.nio.file.Path;

public class Ejemplo03 {
    private static final Path PATH_FICHERO_ENTRADA = Path.of("ejemplos", "ejemplo03", "fichero-entrada.txt");

    public static void main(String[] args) {

        // leer el fichero letra a letra
        System.out.println("Leyendo el fichero letra por letra");
        try (FileReader fr = new FileReader(PATH_FICHERO_ENTRADA.toFile())) {
            int letra;
            while ((letra = fr.read()) != -1) {
                char caracter = (char) letra;
                System.out.println(caracter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero");
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(100));

        // Leer de cinco en cinco letras
        try (FileReader fr = new FileReader(PATH_FICHERO_ENTRADA.toFile())) {
            // Crear el buffer (donde guardar lo que se lee)
            char[] letrasLeidas = new char[5];
            int cuantasLeidas;
            // El while comentado no funciona del todo bien porque los últimos 3 no los muestra en pantalla
            // while ((cuantasLeidas = fr.read(letrasLeidas)) == letrasLeidas.length) {
            while ((cuantasLeidas = fr.read(letrasLeidas)) > 0) {
                mostrarLetras(letrasLeidas, cuantasLeidas);

            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero");
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void mostrarLetras(char[] letrasLeidas, int cuantasLeidas) {
        for (int i=0; i<cuantasLeidas;i++){
            System.out.print(letrasLeidas[i]);
        }
        System.out.println();
    }

}
