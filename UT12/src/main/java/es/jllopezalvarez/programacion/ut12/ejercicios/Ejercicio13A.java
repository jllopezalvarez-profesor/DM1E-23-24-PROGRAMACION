package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.*;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio13A {

    private static String RUTA_FICHERO_NUMEROS = "ejercicios/11/fichero-numeros-a.dat";
    private static Path PATH_FICHERO_NUMEROS = Path.of(RUTA_FICHERO_NUMEROS);

    private static Scanner scanner = new Scanner(System.in);
    private static Random rnd = new Random(1);

    public static void main(String[] args) throws IOException {
        // Creamos los directorios, para evitar errores al crear el stream
        File ficheroNumeros =  PATH_FICHERO_NUMEROS.toFile();
        // Puede fallar si el fichero no está en un subdirectorio.
        ficheroNumeros.getParentFile().mkdirs();

        System.out.println("¿Cuántos números quieres añadir al fichero?");
        int cantidad = scanner.nextInt();

        // Como hay que añadir, se usa la sobrecarga del constructor con "append"
        try (FileOutputStream fos = new FileOutputStream(ficheroNumeros, true)) {
            while(cantidad > 0){
                int numero = rnd.nextInt(100+1);
                //byte byteNumero = numero;
                fos.write(numero);
                cantidad--;
            }
        }

        // Leer el fichero
        try(FileInputStream fis = new FileInputStream(ficheroNumeros)){
            int numero;
            int cuantos = 0;
            while ((numero = fis.read()) != -1){
                if (cuantos % 20 == 0){
                    System.out.println();
                }
                System.out.printf("%d ", numero);
                cuantos++;
            }
        }



    }
}
