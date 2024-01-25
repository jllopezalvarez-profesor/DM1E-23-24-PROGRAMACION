package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos10utilidad;

import java.util.Scanner;

/**
 * 
 * Pruebas de la clase de utilidad
 *
 */
public class Programa {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int numero = EntradaUsuario.pedirEnteroUsuario("Introduce un número entre 0 y 10 ambos incluidos", 0, 10, scanner);
			System.out.printf("El número introducido es el %d.\n", numero);
		}
		
	}

}
