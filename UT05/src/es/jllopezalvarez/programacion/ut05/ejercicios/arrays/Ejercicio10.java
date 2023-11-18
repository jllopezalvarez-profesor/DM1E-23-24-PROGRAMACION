package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;

/**
 * Escribe un programa que: • Cree un array con 20 números enteros aleatorios
 * entre 1 y 20, ambos incluidos. • Muestre el array en la consola, con los
 * valores separados por comas. • Procese el array, poniendo un cero en las
 * posiciones que contengan un número primo. • Muestre de nuevo el array en la
 * consola. Para ello, usar: • Un método para generar un array de números
 * aleatorios de un tamaño dado. Recibe el tamaño del array y devuelve un array
 * de números de la longitud indicada, lleno de números aleatorios. • Un método
 * para calcular si un número es primo o no. Recibe un número y devuelve un
 * boolean indicando si el número es primo o no. • Un método para mostrar el
 * contenido de un array de enteros. Recibe el array y muestra por pantalla
 * (consola) todos los valores del array, separados por coma. No tiene que haber
 * coma al final, tras el último número.
 */
public class Ejercicio10 {

	private static final int CANTIDAD_NUMEROS = 20;
	// El mínimo valor (incluido) que pueden tener los números
	private static final int MIN = 1;
	// El máximo valor (incluido) que pueden tener los números
	private static final int MAX = 20;

	public static void main(String[] args) {
		int[] numeros = crearNumerosAleatorios(CANTIDAD_NUMEROS);
		mostrarNumerosConFlag(numeros);
		reemplazarPrimosPorCero(numeros);
		mostrarNumerosPorIndice(numeros);
	}

	private static void reemplazarPrimosPorCero(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				numeros[i] = 0;
			}
		}

	}

	private static boolean esPrimo(int numero) {
		for(int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	private static void mostrarNumerosConFlag(int[] numeros) {
		boolean primero = true;
		for (int numero : numeros) {
			if (primero) {
				primero = false;
			} else {
				System.out.print(",");
			}
			System.out.print(numero);
		}
		System.out.println();
	}

	private static void mostrarNumerosPorIndice(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (i != 0) {
				System.out.print(",");
			}
			System.out.print(numeros[i]);
		}
		System.out.println();
	}

	private static int[] crearNumerosAleatorios(int cantidadNumeros) {
		Random rnd = new Random();

		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(MIN, MAX + 1);
		}

		return numeros;
	}

}
