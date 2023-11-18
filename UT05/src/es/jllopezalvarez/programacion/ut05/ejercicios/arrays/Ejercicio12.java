package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * <pre>
 * 	Crea un programa que:
    • Pregunte al usuario cuántos números desea generar, que tendrá que ser un valor entre 10 y 100 ambos incluidos. Si el usuario introduce un número menor que 10 o mayor que 100 se le volverá a preguntar. 
    • Cree un array con tantos números aleatorios como haya indicado el usuario. Cada número tendrá que ser un valor entre 0 y 1000 ambos incluidos, y no podrán repetirse, no podrá aparecer el mismo número en el array dos veces.
    • Muestre el array en pantalla.
	A tener en cuenta:
    • El array se debe crear con un método que:
        ◦ Recibe la cantidad de números a generar.
        ◦ Recibe el valor mínimo y el valor máximo para generar los números aleatorios
        ◦ Devuelve el array con los números creados.
    • El array se debe mostrar con un método que muestra los números del array separados por guiones (-).
 * </pre>
 *
 */
public class Ejercicio12 {

	private static final int MIN_CANTIDAD_NUMEROS = 10;
	private static final int MAX_CANTIDAD_NUMEROS = 100;

	private static final int MIN_NUMERO = 0;
	private static final int MAX_NUMERO = 20;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cantidadNumeros = pedirCantidadNumeros(scanner, MIN_CANTIDAD_NUMEROS, MAX_CANTIDAD_NUMEROS);

		int[] numeros = crearNumerosAleatoriosNoRepetidos(cantidadNumeros, MIN_NUMERO, MAX_NUMERO);

		mostrarNumeros(numeros);

		if (hayRepetidos(numeros)) {
			System.out.println("Hay repetidos en el array");
		} else {
			System.out.println("No hay repetidos en el array");
		}

	}

	private static boolean hayRepetidos(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			int numeroBuscado = numeros[i];

			for (int j = 0; j < numeros.length; j++) {
				if (i != j) {
					int numActual = numeros[j];
					if (numActual == numeroBuscado) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static void mostrarNumeros(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
//			if (i!=0) {
//				System.out.print("-");
//			}
			System.out.print(numeros[i]);
			if (i < numeros.length - 1) {
				System.out.print("-");
			}
		}
		System.out.println();
	}

	private static int[] crearNumerosAleatoriosNoRepetidos(int cantidadNumeros, int min, int max) {
		Random rnd = new Random();
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			int candidato = rnd.nextInt(min, max + 1);
			// Comprobar que el candidato no está ya en numeros
			while (contieneNumero(numeros, candidato, i)) {
				candidato = rnd.nextInt(min, max + 1);
			}
			numeros[i] = candidato;
		}
		return numeros;
	}

	private static boolean contieneNumero(int[] numeros, int candidato, int hastaPosicion) {
		for (int i = 0; (i < numeros.length) && (i < hastaPosicion); i++) {
			int num = numeros[i];
			if (num == candidato) {
				return true;
			}
		}
		return false;
	}

	private static int pedirCantidadNumeros(Scanner scanner, int minCantidadNumeros, int maxCantidadNumeros) {
		int numero;

		do {
			System.out.printf("Introduce un número entre %d y %d: ", minCantidadNumeros, maxCantidadNumeros);
			numero = scanner.nextInt();
			if (numero < minCantidadNumeros || numero > maxCantidadNumeros) {
				System.out.println("El número introducido no es válido.");
			}
		} while (numero < minCantidadNumeros || numero > maxCantidadNumeros);

		return numero;
	}

}
