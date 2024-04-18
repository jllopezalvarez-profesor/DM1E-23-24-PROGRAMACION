package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.*;
import java.nio.file.Path;

public class Ejercicio09 {

    private static final int LIMITE_INFERIOR = 0x20;
    private static final int LIMITE_SUPERIOR = 0x7E;


    public static void main(String[] args) {

        Path ficheroOriginal = Path.of("ejercicios", "09", "ficheroOriginal.txt");
        Path ficheroCifrado = Path.of("ejercicios", "09", "ficheroCifrado.txt");
        Path ficheroDescifrado = Path.of("ejercicios", "09", "ficheroDescifrado.txt");

        int claveCifrado = 10;

        cifrar(ficheroOriginal, ficheroCifrado, claveCifrado);
        descifrar(ficheroCifrado, ficheroDescifrado, claveCifrado);


    }


    private static void cifrar(Path ficheroOriginal, Path ficheroCifrado, int claveCifrado) {

        if (claveCifrado > (LIMITE_SUPERIOR - LIMITE_INFERIOR)) {
            throw new IllegalArgumentException(String.format("La clave de cifrado no puede ser mayor que %d", (LIMITE_SUPERIOR - LIMITE_INFERIOR)));
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(ficheroOriginal.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroCifrado.toFile()))) {

            // Forma "Tradicional" con lectura adelantada para un bucle de
            // lectura de fichero hasta que se termina
            // int charOriginal = reader.read();
            // while (charOriginal != -1) {
            //     // Usar charOriginal para lo que tengamos que hacer
            //     charOriginal = reader.read();
            // }

            // Lectura del caracter dentro de la condición del bucle
            // int charOriginal;
            // while ((charOriginal = reader.read()) != -1) {
            //     // Usar charOriginal para lo que tengamos que hacer
            // }

            int charOriginal = reader.read();
            while (charOriginal != -1) {
                // Usar charOriginal para lo que tengamos que hacer
                if (charOriginal < LIMITE_INFERIOR || charOriginal > LIMITE_SUPERIOR) {
                    writer.write(charOriginal);
                } else {
                    int charCifrado = charOriginal + claveCifrado;
                    if (charCifrado > LIMITE_SUPERIOR) {
                        charCifrado = LIMITE_INFERIOR + (charCifrado % (LIMITE_SUPERIOR + 1));
                    }
                    writer.write(charCifrado);
                }
                charOriginal = reader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void descifrar(Path ficheroCifrado, Path ficheroDescifrado, int claveCifrado) {
        if (claveCifrado > (LIMITE_SUPERIOR - LIMITE_INFERIOR)) {
            throw new IllegalArgumentException(String.format("La clave de cifrado no puede ser mayor que %d", (LIMITE_SUPERIOR - LIMITE_INFERIOR)));
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(ficheroCifrado.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ficheroDescifrado.toFile()))) {

            int charCifrado = reader.read();
            while (charCifrado != -1) {
                if (charCifrado < LIMITE_INFERIOR || charCifrado > LIMITE_SUPERIOR) {
                    writer.write(charCifrado);
                } else {
                    int charDescifrado = charCifrado - claveCifrado;
                    if (charDescifrado < LIMITE_INFERIOR){
                        charDescifrado = LIMITE_SUPERIOR + (charDescifrado - LIMITE_INFERIOR) + 1;
                    }
                    writer.write(charDescifrado);
                }
                charCifrado = reader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
