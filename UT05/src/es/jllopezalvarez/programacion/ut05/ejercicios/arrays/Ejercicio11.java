package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * <pre>
 * 	Crea un programa que 
    • Cree un array de 100 números aleatorios entre 1000 y 2000.
    • Pregunte al usuario un número entre 1000 y 2000.
    • Cuente cuántas veces aparece en el array el número que ha introducido el usuario.
	Utiliza métodos en tu programa. Al menos:
    • Un método para generar el array de números aleatorios. Recibe la cantidad de números a generar, y devuelve un nuevo array con los números generados.
    • Un método para buscar en el array el número que ha introducido el usuario.
 * </pre>
 *
 */
public class Ejercicio11 {

	private static final int CANTIDAD_NUMEROS = 100;

	private static final int MIN = 10;
	private static final int MAX = 20;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = generarNumerosAleatorios(CANTIDAD_NUMEROS, MIN, MAX);

		mostrarArrayNumeros(numeros);
		
		System.out.printf("Introduce un número entre %d y %d ambos incluidos: ", MIN, MAX);
		int numeroBuscado = scanner.nextInt();

		int cuantasApariciones = contarApariciones(numeros, numeroBuscado);

		System.out.printf("El número %d aparece %d veces en los números generados\n", numeroBuscado,
				cuantasApariciones);
	}

	private static int contarApariciones(int[] numeros, int numeroBuscado) {
		int cuenta = 0;
		for (int num : numeros) {
			if (num == numeroBuscado) {
				cuenta++;
			}
		}
		return cuenta;
	}

	private  static void mostrarArrayNumeros(int[] numeros) {
		boolean enPrimerElemento = true;
		for (int numero : numeros) {
			if (enPrimerElemento) {
				System.out.printf("%d", numero);
				enPrimerElemento = false;
			} else {
				System.out.printf(",%d", numero);
			}
		}
		System.out.println();
	}

	/**
	 * Genera un array de números aleatorios del tamaño especificado. Cada número
	 * está entre mínimo y máximo ambos incluidos.
	 * 
	 * @param tamanio cantidad de números que se quieren generar
	 * @param minimo  valor mínimo (inclusivo) de los números generados
	 * @param maximo  valor máximo (inclusivo) de los números generados
	 * @return el array con los números generados
	 */
	private static int[] generarNumerosAleatorios(int cantidadNumeros, int minimo, int maximo) {
		Random rnd = new Random();
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(MIN, MAX + 1);
		}
		return numeros;
	}
}
