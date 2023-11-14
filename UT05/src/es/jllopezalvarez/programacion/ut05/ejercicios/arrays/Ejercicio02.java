package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que pida 10 nombres por teclado. Almacena los nombres en
 * un array, y luego muéstralos junto a la posición que ocupan en el array. Ten
 * en cuenta el tipo de dato más adecuado para guardar un nombre, para usarlo en
 * la declaración del array.
 *
 */
public class Ejercicio02 {

	private static final int NUM_ELEMENTOS = 10;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nombres = new String[NUM_ELEMENTOS];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce un nombre... ");
			nombres[i] = scanner.nextLine();
		}

		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("En la posición %d del array está el nombre %s.\n", i, nombres[i]);
		}
		
	}

}
