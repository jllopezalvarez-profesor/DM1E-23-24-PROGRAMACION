package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;

/**
 * Queremos procesar cada posición del array según el siguiente algoritmo: • Si
 * el valor en una posición es un número par, lo dividimos entre 2, modificando
 * el valor almacenado en el array en esa posición • Si el valor en una posición
 * es impar, lo multiplicamos por 2, modificando el valor almacenado en el
 * array. Para hacerlo, usa dos métodos estáticos del programa principal: •
 * Método procesarNumeros, que recibe el array y lo procesa. No devuelve nada,
 * modifica los valores del array. • Método esPar. Recibe un número y devuelve
 * un boolean indicando si el número es par o no.
 */

public class Ejercicio09 {
	private static final int CANTIDAD_NUMEROS = 5;
	private static final int MIN = 0;
	private static final int MAX = 10;

	public static void main(String[] args) {
		int[] numeros = new int[CANTIDAD_NUMEROS];
		llenarConAleatorios(numeros, MIN, MAX);
		mostrarNumeros(numeros);
		procesarNumeros(numeros);
		mostrarNumeros(numeros);
	}

	private static void procesarNumeros(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (esPar(i)) {
				numeros[i] /= 2; // numeros[i] = numeros[i] / 2;
			} else {
				numeros[i] *= 2; // numeros[i] = numeros[i] * 2;
			}
		}
	}

	private static boolean esPar(int numero) {
		return (numero % 2) == 0;
	}

	private static void mostrarNumeros(int[] numeros) {
		for (int num : numeros) {
			System.out.printf("%d ", num);
		}
		System.out.println();
	}

	private static void llenarConAleatorios(int[] numeros, int min, int max) {
		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(min, max);
		}
	}
}
