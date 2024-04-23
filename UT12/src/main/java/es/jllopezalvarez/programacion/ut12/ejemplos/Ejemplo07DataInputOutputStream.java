package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.io.*;
import java.nio.file.Path;
import java.util.Random;

public class Ejemplo07DataInputOutputStream {
    private final static Path FICHERO_NUMEROS = Path.of("ejemplos", "ejemplo07", "numeros.dat");
    private static Random rnd = new Random();


    public static void main(String[] args) throws IOException {

        generarFicheroNumeros(FICHERO_NUMEROS, 10);

        mostrarNumerosFichero2(FICHERO_NUMEROS);


    }

    private static void mostrarNumerosFichero(Path ficheroNumeros) throws IOException {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(ficheroNumeros.toFile())))) {

            while (true) {
                int entero = dis.readInt();
                double doble = dis.readDouble();
                String string = dis.readUTF();
                System.out.printf("Leido: %d | %f | %s\n", entero, doble, string);
            }

        } catch (EOFException e) {
            // Lo dejo vacío. Es el único caso de excepción vacía
        }

    }

    private static void mostrarNumerosFichero2(Path ficheroNumeros) throws IOException {
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(ficheroNumeros.toFile())))) {
            boolean finalfichero = false;
            while (!finalfichero) {
                try {
                    int entero = dis.readInt();
                    double doble = dis.readDouble();
                    String string = dis.readUTF();
                    System.out.printf("Leido: %d | %f | %s\n", entero, doble, string);

                } catch (EOFException e) {
                    finalfichero = true;
                }
            }
        }
    }

    private static void generarFicheroNumeros(Path ficheroNumeros, int cuantos) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(ficheroNumeros.toFile())))) {
            while (cuantos > 0) {
                // Escribo un entero
                int entero = rnd.nextInt(0, 1000);
                dos.writeInt(entero);
                // Doble
                double doble = rnd.nextDouble(0, 10000);
                dos.writeDouble(doble);
                // String
                String string = String.valueOf(rnd.nextInt(40000));
                dos.writeUTF(string);
                System.out.printf("Escrito: %d | %f | %s\n", entero, doble, string);
                cuantos--;
            }

        }

    }

}
