package es.dm1e.examenes.global1evaluacion.modeloa;

import java.util.Iterator;
import java.util.Random;

public class Ejercicio3 {
	private static final int TERMINACION_BUSCADA = 5;
	private static final int CANTIDAD_NUMEROS = 50;
	private static final int MIN_NUMERO = 25;
	private static final int MAX_NUMERO = 75;

	public static void main(String[] args) {
		int[] numeros = generarAleatorios(CANTIDAD_NUMEROS, MIN_NUMERO, MAX_NUMERO);
		mostrarNumeros(numeros);
		procesarNumeros(numeros);
		mostrarNumeros(numeros);
	}

	private static int[] generarAleatorios(int cantidadNumeros, int minNumero, int maxNumero) {
		Random rnd = new Random();
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(minNumero, maxNumero + 1);
		}
		return numeros;
	}

	private static void procesarNumeros(int[] numeros) {
		for (int i = 0; i < numeros.length; i += 2) {
			if (numeros[i] % 10 == TERMINACION_BUSCADA) {
				numeros[i] = 0;
			}
		}
	}

	private static void mostrarNumeros(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (i>0) {
				System.out.print(",");
			}
			System.out.print(numeros[i]);
		}
		System.out.println();
	}

}
