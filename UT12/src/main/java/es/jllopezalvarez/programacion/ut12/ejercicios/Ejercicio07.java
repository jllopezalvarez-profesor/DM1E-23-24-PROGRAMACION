package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    private static final char CHAR_INICIAL = 0x20;
    private static final char CHAR_FINAL = 0x7E;
    public static final int CANTIDAD_CARACTERES = 100;

    private static Random rnd = new Random();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Character> caracteres = generarAleatorios(CANTIDAD_CARACTERES, CHAR_INICIAL, CHAR_FINAL);
        caracteres.sort(null);

        System.out.println("Dime el nombre del fichero (puede incluir carpetas)");
        String nombrefichero = scanner.nextLine();

        // Comprobar si existe
        File fichero = new File(nombrefichero);
        if (fichero.exists()){
            System.out.println("El fichero indicado no existe");
            return;
        }



        // Crear stream de escritura
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero))){
            for (char caracter :caracteres) {
                writer.write(caracter);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static List<Character> generarAleatorios(int cantidadCaracteres, char charInicial, char charFinal) {
        List<Character> caracteres = new ArrayList<>();

        for (int i = 0; i < cantidadCaracteres; i++) {
            char aleatorio = (char) rnd.nextInt(charInicial, charFinal + 1);
            caracteres.add(aleatorio);
        }

        return caracteres;
    }
}
