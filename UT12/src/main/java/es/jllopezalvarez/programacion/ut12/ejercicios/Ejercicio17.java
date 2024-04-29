package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class Ejercicio17 {
    private static final int MAX_NUM = 50;
    private static final int MIN_NUM = -50;

    private static final Path PATH_FICHERO = Path.of("ejercicios", "ejercicio17", "numeros.txt");
    public static final int NUMS_POR_LINEA = 5;
    public static final int DIVISOR_PARA_ELIMINAR_MULTIPLOS = 5;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cantidadNumeros = pedirCantidadNumeros(scanner);
        List<Integer> numeros = crearListaNumeros(cantidadNumeros, MAX_NUM, MIN_NUM);
//        numeros.sort(null);
        Collections.sort(numeros);
        // Borro el fichero para no tener que borrarlo manualmente en cada prueba
        PATH_FICHERO.toFile().delete();
        aniadirNumerosAFichero(numeros, PATH_FICHERO);
        eliminarMultiplos(numeros, DIVISOR_PARA_ELIMINAR_MULTIPLOS);
        aniadirNumerosAFichero(numeros, PATH_FICHERO);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        separarParesImpares(numeros, pares, impares);
        Collections.sort(pares, Comparator.reverseOrder());
        aniadirNumerosAFichero(impares, PATH_FICHERO);
        aniadirNumerosAFichero(pares, PATH_FICHERO);
        mostrarContenidoFicheroScanner(PATH_FICHERO);

    }

    private static void mostrarContenidoFichero(Path pathFichero) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathFichero.toFile()))) {
            String linea;
            while((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
        }
    }
    private static void mostrarContenidoFicheroScanner(Path pathFichero) throws IOException {


        try (Scanner scanner = new Scanner(pathFichero.toFile())) {
            while(scanner.hasNext()){
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        }
    }

    private static void separarParesImpares(List<Integer> numeros, List<Integer> pares, List<Integer> impares) {
        for (int numero : numeros) {
            if (numero % 2 == 0)
                pares.add(numero);
            else
                impares.add(numero);
        }
    }

    private static void eliminarMultiplos(List<Integer> numeros, int divisor) {

        for (Iterator<Integer> iterator = numeros.iterator(); iterator.hasNext(); ) {
            Integer numero = iterator.next();
            if (numero % divisor == 0) {
                iterator.remove();
            }
        }
    }

    private static void aniadirNumerosAFichero(List<Integer> numeros, Path pathFichero) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(pathFichero.toFile(), true))) {
            int indice = 0;
            for (int numero : numeros) {
                pw.printf("%3d ", numero);
                indice++;
                if (indice % NUMS_POR_LINEA == 0) {
                    pw.println();
                }
            }
            pw.printf("\n%s\n", "-".repeat(15));
        }

    }


    private static List<Integer> crearListaNumeros(int cantidadNumeros, int maxNum, int minNum) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<>();
        while (cantidadNumeros > 0) {
            numeros.add(random.nextInt(minNum, maxNum + 1));
            cantidadNumeros--;
        }
        return numeros;
    }

    private static int pedirCantidadNumeros(Scanner scanner) {
        return 150;
    }
}
