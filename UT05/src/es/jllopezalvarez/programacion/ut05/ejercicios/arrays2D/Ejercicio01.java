package es.jllopezalvarez.programacion.ut05.ejercicios.arrays2D;

import java.util.Scanner;

public class Ejercicio01 {

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
		}
		for (int i = 0; i < numColumnas; i++) {
			System.out.printf("Suma de columna %d = %d\n", i, sumarColumna(numeros, i));
		}
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

	
}
