package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;

/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
 * los almacene en un array. Usando métodos, calcula la suma de los números que
 * están en posiciones pares, y la media de los que están en impares.
 */

public class Ejercicio08 {
	private static final int CANTIDAD_NUMEROS = 5;
	private static final int MIN = 0;
	private static final int MAX = 10;

	public static void main(String[] args) {
		int[] numeros = new int[CANTIDAD_NUMEROS];
		llenarConAleatorios(numeros, MIN, MAX);

		mostrarNumeros(numeros);

		int sumaPares = calcularSumaPosicionesPares(numeros);
		double mediaPares = calcularMediaPosicionesPares(numeros);
		double mediaImpares = calcularMediaPosicionesImpares(numeros);

		System.out.printf("La suma de las posiciones pares es %d\n", sumaPares);

		System.out.printf("La media de las posiciones pares es %.2f\n", mediaPares);

		System.out.printf("La media de las posiciones impares es %.2f\n", mediaImpares);

	}

	private static void mostrarNumeros(int[] numeros) {
		for (int num : numeros) {
			System.out.printf("%d ", num);
		}
		System.out.println();
	}

	private static int calcularSumaPosicionesPares(int[] numeros) {
		int suma = 0;

		// Menos eficiente:
//		for (int i = 0; i < numeros.length; i++) {
//			if (i % 2 == 0) {
//				suma += numeros[i];
//			}
//		}

		// Más eficiente, simplemente saltamos de 2 en 2:
		for (int i = 0; i < numeros.length; i += 2) {
			suma += numeros[i];
		}

		return suma;
	}



	private static int calcularSumaPosicionesImpares(int[] numeros) {
		int suma = 0;

		for (int i = 1; i < numeros.length; i += 2) {
			suma += numeros[i];
		}

		return suma;
	}

	private static double calcularMediaPosicionesPares(int[] numeros) {
		int sumaPares = calcularSumaPosicionesPares(numeros);
		int cantidadPares = numeros.length / 2;
		// Si el número de elementos en el array no es par, la división no es exacta y
		// hay que sumar 1
		if (numeros.length % 2 == 1) {
			cantidadPares++;
		}
		double mediaPares = (double) sumaPares / cantidadPares;
		return mediaPares;
	}
	
	// Versión alternativa, que usa la típica suma / cuenta
	private static double calcularMediaPosicionesPares2(int[] numeros) {
		int suma = 0;
		int cuenta = 0;

		for (int i = 0; i < numeros.length; i += 2) {
			suma += numeros[i];
			cuenta++;
		}

		return (double) suma / cuenta;
	}

	private static double calcularMediaPosicionesImpares(int[] numeros) {
		int sumaImpares = calcularSumaPosicionesImpares(numeros);
		int cantidadImpares = numeros.length / 2;
		double mediaImpares = (double) sumaImpares / cantidadImpares;
		return mediaImpares;
	}

	private static void llenarConAleatorios(int[] numeros, int min, int max) {
		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(min, max);
		}
	}
}

