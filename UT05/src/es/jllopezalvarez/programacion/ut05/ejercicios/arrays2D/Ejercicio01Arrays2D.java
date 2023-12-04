package es.jllopezalvarez.programacion.ut05.ejercicios.arrays2D;

import java.util.Scanner;

public class Ejercicio01Arrays2D {

	private static final int LIMITE = 10;

	public static void main(String[] args) {

		mostrarSeparadoPorPuntos(1, 2, 3, 4);
		mostrarSeparadoPorPuntos(1);
		mostrarSeparadoPorPuntos(7, 3, 2, 3, 4, 3, 2, 3, 4, 3);
		
		int[] n = new int[5];
		mostrarSeparadoPorPuntos(n);

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Numero de filas? ");
		int numFilas = scanner.nextInt();
		System.out.print("¿Numero de columnas? ");
		int numColumnas = scanner.nextInt();

		int[][] numeros = crearArray2D(numFilas, numColumnas, LIMITE);

		mostrarArray2D(numeros);

//		for(int numFila = 0; numFila < numFilas;numFila++) {
//			System.out.printf("La suma de la fila %d es %d\n", numFila, sumarFila(numeros, numFila));
//		}
//		for(int numCol = 0; numCol < numColumnas; numCol++)
//		{
//			System.out.printf("La suma de la columna %d es %d\n", numCol, sumarColumna(numeros, numCol));
//		}

		for (int numFilaCol = 0; numFilaCol < Math.max(numFilas, numColumnas); numFilaCol++) {
			if (numFilaCol < numFilas) {
				System.out.printf("La suma de la fila %d es %d\n", numFilaCol, sumarFila(numeros, numFilaCol));
			}
			if (numFilaCol < numColumnas) {
				System.out.printf("La suma de la columna %d es %d\n", numFilaCol, sumarColumna(numeros, numFilaCol));
			}

		}

	}

	private static int[][] crearArray2D(int numFilas, int numColumnas, int limiteAleatorios) {
		int[][] numeros = new int[numFilas][numColumnas];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = (int) (Math.random() * limiteAleatorios);
			}
		}

		return numeros;
	}

	private static int sumarFila(int[][] numeros, int numFila) {
		int suma = 0;
		for (int i = 0; i < numeros[numFila].length; i++) {
			suma = suma + numeros[numFila][i];
		}
		return suma;
	}

	private static int sumarFila2(int[][] numeros, int numFila) {
		return sumarArray1D(numeros[numFila]);
	}

	private static int sumarArray1D(int[] numeros) {
		int suma = 0;
		for (int num : numeros) {
			suma += num;
		}
		return suma;
	}

	private static int sumarColumna(int[][] numeros, int numColumna) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i][numColumna];
		}
		return suma;
	}

	private static void mostrarArray2D(int[][] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.printf("%2d ", numeros[i][j]);
			}
			System.out.println();
		}

	}

	private static void mostrarSeparadoPorPuntos(int... numeros) {
		
		

	}

}
