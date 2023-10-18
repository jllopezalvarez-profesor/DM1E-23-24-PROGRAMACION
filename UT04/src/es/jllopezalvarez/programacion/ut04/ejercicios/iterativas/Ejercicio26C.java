package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio26C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Algoritmo que pida números hasta que se introduzca un cero. Debe mostrar cada
		// uno de los números introducidos, hasta que el usuario introduzca el cero, a
		// medida que los vaya introduciendo. El cero, que es el número con el que el
		// usuario “corta” el programa, no debe mostrarse.
		System.out.print("Introduce un número entero, cero para terminar: ");
		int numero = scanner.nextInt();
		while (numero != 0) {
			System.out.printf("El número introducido es el %d\n", numero);
			System.out.print("Introduce un número entero, cero para terminar: ");
			numero = scanner.nextInt();
		}
		System.out.println("Fin de programa.");
	}
}
