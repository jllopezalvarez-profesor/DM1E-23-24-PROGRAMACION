package es.jllopezalvarez.programacion.ut05.ejercicios.arrays2D;

import java.math.MathContext;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de filas: ");
		int numFilas = scanner.nextInt();

		System.out.println("Introduce el número de columnas: ");
		int numColumnas = scanner.nextInt();

		int[][] numeros = crearArray2D(numFilas, numColumnas, 100);

		mostrarNumeros(numeros);

		for (int i = 0; i < numFilas; i++) {
			System.out.printf("Suma de fila %d = %d\n", i, sumarFila(numeros, i));
			System.out.printf("Media de fila %d = %.2f\n", i, mediaFila(numeros, i));
			System.out.printf("Máximo de fila %d = %d\n", i, maximoFila(numeros, i));
			System.out.printf("Mínimo de fila %d = %d\n", i, minimoFila(numeros, i));
		}
		for (int i = 0; i < numColumnas; i++) {
			System.out.printf("Suma de columna %d = %d\n", i, sumarColumna(numeros, i));
			System.out.printf("Media de columna %d = %.2f\n", i, mediaColumna(numeros, i));
			System.out.printf("Máximo de columna %d = %d\n", i, maximoColumna(numeros, i));
			System.out.printf("Mínimo de columna %d = %d\n", i, minimoColumna(numeros, i));
		}
		
		System.out.printf("Máximo absoluto: %d\n", maximoGeneral(numeros));
		
		scanner.close();
	}

	private static void mostrarNumeros(int[][] numeros) {
		for (int[] numerosFila : numeros) {
			for (int numero : numerosFila) {
				System.out.printf("%d ", numero);
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

	public static int sumarFila(int[][] numeros, int numFila) {
		int suma = 0;

		int[] numerosFila = numeros[numFila];

		for (int numero : numerosFila) {
			suma += numero;
		}

		return suma;
	}

	public static int sumarColumna(int[][] numeros, int numColumna) {
		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i][numColumna];
		}

		return suma;
	}

	public static double mediaFila(int[][] numeros, int numeroFila) {
		return (double) sumarFila(numeros, numeroFila) / numeros[numeroFila].length;
	}

	public static double mediaColumna(int[][] numeros, int numeroColumna) {
		return (double) sumarColumna(numeros, numeroColumna) / numeros.length;
	}

	public static int maximoFila(int[][] numeros, int numFila) {
		int[] numerosFila = numeros[numFila];

		int maximo = numerosFila[0];

		for (int numero : numerosFila) {
			maximo = Math.max(maximo, numero);
		}

		return maximo;
	}

	public static int maximoColumna(int[][] numeros, int numColumna) {
		int maximo = numeros[0][numColumna];

		for (int i = 0; i < numeros.length; i++) {
			maximo = Math.max(maximo, numeros[i][numColumna]);
		}

		return maximo;
	}

	public static int minimoFila(int[][] numeros, int numFila) {
		int[] numerosFila = numeros[numFila];

		int minimo = numerosFila[0];

		for (int numero : numerosFila) {
			minimo = Math.min(minimo, numero);
		}

		return minimo;
	}

	public static int minimoColumna(int[][] numeros, int numColumna) {
		int minimo = numeros[0][numColumna];

		for (int i = 0; i < numeros.length; i++) {
			minimo = Math.min(minimo, numeros[i][numColumna]);
		}

		return minimo;
	}
	
	public static int maximoGeneral(int[][] numeros) {
		
		int maximo = maximoFila(numeros, 0);
		for (int i = 1; i < numeros.length; i++) {
			maximo = Math.max(maximo, maximoFila(numeros, i));
		}
		return maximo;
	}
	
	
}
