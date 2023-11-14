package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que pida 10 números por teclado, los almacene en un array
 * y que luego muestre el máximo valor, el mínimo y las posiciones que ocupan
 * estos dos números en el array.
 *
 */
public class Ejercicio05 {

	private static final int CANTIDAD_NUMEROS = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[CANTIDAD_NUMEROS];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número ");
			numeros[i] = scanner.nextInt();
		}

		// Para acceder a valores mínimos o máximos de los tipos:
		// int menorEnteroPosible = Integer.MIN_VALUE;
		// int mayorEnteroPosible = Integer.MAX_VALUE;
		
		
		int maximo = numeros[0];
		int posMaximo = 0;
		int minimo = numeros[0];
		int posMinimo = 0;

		for (int i = 0; i < numeros.length; i++) {
			// Si el máximo o el mínimo está repetido, al poner > o < nos quedamos con la 
			// primera posición en que aparecen. Si usamos >= o <=, entonces nos quedaríamos 
			// con la última posición.
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMaximo = i;
			}
			if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMinimo = i;
			}
		}
		
		System.out.printf("El máximo es %d y está en la posición %d.\n", maximo, posMaximo);
		System.out.printf("El mínimo es %d y está en la posición %d.\n", minimo, posMinimo);
	}

}
