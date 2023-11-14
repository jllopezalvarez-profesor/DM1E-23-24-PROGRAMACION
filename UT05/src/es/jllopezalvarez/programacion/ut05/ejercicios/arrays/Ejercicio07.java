package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;

/**
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
 * los almacene en un array. Luego mostrará los números primos que hay en el
 * array, junto a la posición que ocupan en el mismo. Utiliza un método
 * estático, que crearás dentro de la clase del programa principal, para
 * determinar si un número es primo o no.
 *
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// Generar numeros aleatorios (20) entre 0 y 99
		int[] numeros = generaAleatorios(20, 0, 100);

		// Mostrar todos los números
		for (int num : numeros) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		// Mostrar los que sean primos.
		for (int i = 0; i < numeros.length; i++) {
			int numeroActual = numeros[i];
			if (esPrimo(numeroActual)) {
				System.out.printf("Encontrado primo %d en posición %d%n", numeroActual, i);
			}
		}

	}

	private static int[] generaAleatorios(int cantidadNumeros, int min, int max) {
		// Crear un array de tamaño "cantidadNumeros"
		// Llenarlo con numeros aleatorios del 0 a limite-1 ambos incluidos
		// Devolver el array creado
		int[] numeros = new int[cantidadNumeros];
		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(min, max);
		}
		return numeros;
	}

	public static boolean esPrimo(int numero) {
		// Usamos la versión más simple, pero menos eficiente del algoritmo
		// para buscar primos. Hay varias versiones mejores en la UT 04, ejercicio 33.
		if (numero < 2)
			return false;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}

}
