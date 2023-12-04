package es.jllopezalvarez.programacion.ut05.ejercicios.arrays2D;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int numFilas = scanner.nextInt();

		System.out.println("Introduce el número de columnas: ");
		int numColumnas = scanner.nextInt();

		scanner.close();

		int[][] numeros = crearArray2D(numFilas, numColumnas, 100);

		mostrarNumeros(numeros);
	
		System.out.println("-".repeat(numColumnas));
		
		mostrarNumeros(trasponer(numeros));
	}

	public static int[][] trasponer(int[][] original) {
		int[][] traspuesto = new int[original[0].length][original.length];

		for (int i = 0; i < traspuesto.length; i++) {
			for (int j = 0; j < traspuesto[0].length; j++) {
				traspuesto[i][j] = original[j][i];
			}
		}

		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < traspuesto.length; j++) {
				traspuesto[j][i] = original[i][j];
			}
		}

		
		return traspuesto;
	}

	private static void mostrarNumeros(int[][] numeros) {
		for (int[] numerosFila : numeros) {
			for (int numero : numerosFila) {
				System.out.printf("%2s ", numero);
			}
			System.out.println();
		}

	}

	public static int[][] crearArray2D(int numFilas, int numColumnas, int limiteNumeros) {
		int[][] numeros = new int[numFilas][numColumnas];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = (int) (Math.random() * limiteNumeros);
			}
		}
		return numeros;
	}

}
