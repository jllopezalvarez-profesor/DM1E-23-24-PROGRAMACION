package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pregunte al usuario su nombre, y luego le salude.
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Declarar la variable
		String nombre;
		// Pedir el nombre al usuario
		System.out.println("¿Cómo te llamas?");
		nombre = scanner.nextLine();
		System.out.println("Hola " + nombre + ".");

	}

}
