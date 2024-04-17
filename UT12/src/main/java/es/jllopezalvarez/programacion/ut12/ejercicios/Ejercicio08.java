package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.*;
import java.nio.file.Path;

public class Ejercicio08 {
    private static final Path PATH_F1 = Path.of("ejercicios", "07", "f1.txt");
    private static final Path PATH_F2 = Path.of("ejercicios", "07", "f2.txt");
    private static final Path PATH_F_SALIDA = Path.of("ejercicios", "08", "f3.txt");

    public static void main(String[] args) throws IOException {

//        char a = 'b';
//        char b = 'A';
//
//
//
//        System.out.printf("¿ A < b ? %s\n", a<b);
//
//        System.out.printf("Valor de a: %d\n", (int)a);
//        System.out.printf("Valor de b: %d\n", (int)b);

        try (BufferedReader readerF1 = new BufferedReader(new FileReader(PATH_F1.toFile()));
             BufferedReader readerF2 = new BufferedReader( new FileReader(PATH_F2.toFile()));
             BufferedWriter writer = new BufferedWriter( new FileWriter(PATH_F_SALIDA.toFile()))) {

            int charF1 = readerF1.read();
            int charF2 = readerF2.read();

            while (charF1 != -1 && charF2 != -1) {
                if (charF1 <= charF2) {
                    writer.write(charF1);
                    charF1 = readerF1.read();
                } else {
                    writer.write(charF2);
                    charF2 = readerF2.read();
                }

                if (charF1 == -1) {
                    // Se ha acabado el stream 1 y hay que terminar el 2
                    do {
                        writer.write(charF2);
                    } while ((charF2 = readerF2.read()) != -1);
                }

                if (charF2 == -1) {
                    // se ha acabado el stream 2 y hay que treminar el 1
                    do {
                        writer.write(charF1);
                    } while ((charF1 = readerF1.read()) != -1);
                }


            }



        }
    }
}


