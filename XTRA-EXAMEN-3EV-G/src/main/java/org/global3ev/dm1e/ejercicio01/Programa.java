package org.global3ev.dm1e.ejercicio01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Programa {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        // Preguntar la ubicación del fichero
        System.out.println("Introduce la ubicación del fichero a procesar:");
        String ubicacionFichero = scanner.nextLine();

        // creamos objeto File
        File ficheroEntrada = new File(ubicacionFichero);

        // Comprobar si existe
        if (!ficheroEntrada.exists()) {
            System.out.printf("El fichero %s no existe.", ubicacionFichero);
            return;
        }

        // Comprobar que no es un directorio
        if (ficheroEntrada.isDirectory()) {
            System.out.printf("%s es un directorio.", ubicacionFichero);
            return;
        }

        List<String> palabras = leerFichero(ficheroEntrada);

//        System.out.println(palabras);

        Set<String> palabrasUnicas = obtenerUnicas(palabras);

//        System.out.printf("Hay %d palabras únicas\n", palabrasUnicas.size());
//        System.out.println(palabrasUnicas);

        Map<String, Integer> cuenta = contarPalabras(palabras);
//        System.out.println(cuenta);

        File ficheroSalida = new File(ubicacionFichero + ".analisis");

        generarInforme(ficheroSalida, palabrasUnicas, cuenta);


    }

    private static void generarInforme(File ficheroSalida, Set<String> palabrasUnicas, Map<String, Integer> cuenta) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(ficheroSalida)) {

            writer.println("Palabras únicas en el fichero:");
            for (String palabra : palabrasUnicas) {
                writer.println(palabra);
            }

            writer.println("Cuántas veces aparece cada palabra:");
            for (Map.Entry<String, Integer> entrada : cuenta.entrySet()) {
                String palabra = entrada.getKey();
                Integer frecuencia = entrada.getValue();
                writer.printf("%s - %d\n", palabra, frecuencia);
            }
        }

    }

    private static Map<String, Integer> contarPalabras(List<String> palabras) {
        Map<String, Integer> cuenta = new TreeMap<>(Comparator.reverseOrder());

        for (String palabra : palabras) {
            int cuentaActual = 0;

            if (cuenta.containsKey(palabra)) {
                cuentaActual = cuenta.get(palabra);
            }
            cuentaActual++;
            cuenta.put(palabra, cuentaActual);
        }
        // Versión alternativa para Java "moderno"
//        for (String palabra : palabras) {
//            cuenta.put(palabra, cuenta.getOrDefault(palabra, 0)+1);
//        }


        return cuenta;
    }

    private static Set<String> obtenerUnicas(List<String> palabras) {
        Set<String> unicas = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.reverseOrder()));
        //Set<String> unicas =  new TreeSet<>(Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase).reversed());
        unicas.addAll(palabras);
        return unicas;
    }

    private static List<String> leerFichero(File ficheroEntrada) throws FileNotFoundException {
        List<String> palabras = new ArrayList<>();

        try (Scanner scannerFichero = new Scanner(ficheroEntrada)) {
            scannerFichero.useDelimiter("[^a-zA-Zà-üÀ-Ü]");
            while (scannerFichero.hasNext()) {
                String palabra = scannerFichero.next();
                palabras.add(palabra);
            }
        }
        return palabras;
    }
}
