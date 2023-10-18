package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio26A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Algoritmo que pida números hasta que se introduzca un cero. Debe mostrar cada
		// uno de los números introducidos, hasta que el usuario introduzca el cero, a
		// medida que los vaya introduciendo. El cero, que es el número con el que el
		// usuario “corta” el programa, no debe mostrarse.
		boolean esCero = false;
		while (!esCero) {
			System.out.print("Introduce un número entero, cero para terminar: ");
			int numero = scanner.nextInt();
			esCero = numero == 0;
			if (!esCero) {
				System.out.printf("El número introducido es el %d\n", numero);
			}
		}
		System.out.println("Fin de programa.");
	}
}
