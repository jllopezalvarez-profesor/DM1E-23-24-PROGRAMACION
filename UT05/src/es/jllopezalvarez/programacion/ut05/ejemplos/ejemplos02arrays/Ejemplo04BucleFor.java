package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos02arrays;

/**
 * 
 * Ejemplo de uso del bucle for en un array. Llena el array con números
 * aleatorios, y luego lo recorre para mostrarlos. También hace un recorrido en
 * orden inverso, del último al primero. También muestra como se usa for-each.
 */

public class Ejemplo04BucleFor {

	// Constante para el tamaño del array
	private static int LONGITUD_ARRAY = 20;
	private static int MAX_NUMERO = 100;

	public static void main(String[] args) {

		// Declaramos y creamos un array de números enteros
		int[] numeros = new int[LONGITUD_ARRAY];

		// Recorremos el array llenándolo de números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			// El valor que generamos estará entre 1 y MAX_NUMERO ambos incluidos
			numeros[i] = (int) ((Math.random() * MAX_NUMERO) + 1);
		}

		// Mostramos el contenido del array separado por espacios
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%d ", numeros[i]);
		}

		System.out.println();

		// Mostramos el contenido del array separado por espacios,
		// pero en orden inverso
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.printf("%d ", numeros[i]);
		}

		System.out.println();

		// El mismo bucle para mostrar del primer al último
		// elemento, pero usando un bucle for-each
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}

	}
}
