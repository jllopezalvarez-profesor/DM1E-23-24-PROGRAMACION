package org.parcial3ev.modeloa;

import java.util.*;

public class Ejercicio01 {

    private static final int MAX_NUM = 10;
    private static Scanner scanner = new Scanner(System.in);
    private static Random rnd = new Random();


    public static void main(String[] args) {
        int tamanio = pedirCantidadNumerosUsuario();
        List<Integer> numeros = generarNumeros(tamanio);
        System.out.println("Numeros generados:");
        System.out.println(numeros);
        Map<Integer, Integer> cuenta = contarNumerosDistintos(numeros);
        System.out.println("Cuantas veces aparece cada numero (en el mismo orden que se generaron:");
        for (Map.Entry<Integer, Integer> entrada : cuenta.entrySet()) {
            System.out.printf("%d - %d\n", entrada.getKey(), entrada.getValue());
        }
        Set<Integer> multiplos = obtenerMultiplosDeTres(numeros);
        System.out.println("Múltiplos de tres generados (en orden descendente):");
        System.out.println(multiplos);
    }

    private static Set<Integer> obtenerMultiplosDeTres(List<Integer> numeros) {
        Set<Integer> multiplos = new TreeSet<>(Comparator.reverseOrder());

        for (Integer numero : numeros) {
            if (numero > 0 && numero % 3 == 0) {
                multiplos.add(numero);
            }
        }

        return multiplos;
    }

    private static Map<Integer, Integer> contarNumerosDistintos(List<Integer> numeros) {
        Map<Integer, Integer> cuenta = new LinkedHashMap<>();

        for (Integer numero : numeros) {
            if (cuenta.containsKey(numero)) {
                cuenta.put(numero, cuenta.get(numero) + 1);
            } else {
                cuenta.put(numero, 1);
            }
        }
        return cuenta;
    }

    private static List<Integer> generarNumeros(int tamanio) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < tamanio; i++) {
            numeros.add(rnd.nextInt(MAX_NUM + 1));
        }
        return numeros;
    }

    private static int pedirCantidadNumerosUsuario() {
        int numero = 0;

        while (numero <= 0) {
            System.out.println("Introduce la cantidad de números que quieres generar:");
            try {
                numero = Integer.parseInt(scanner.nextLine());
                if (numero <= 0) {
                    System.out.println("El número tiene que ser mayor que cero");
                }
            } catch (NumberFormatException e) {
                System.out.println("El valor introducido no es un número válido");
            }
        }


        return numero;
    }


}
