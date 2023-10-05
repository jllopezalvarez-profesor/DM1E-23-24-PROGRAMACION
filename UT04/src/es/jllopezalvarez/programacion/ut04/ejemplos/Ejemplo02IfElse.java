package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo02IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Ejemplo de uso de if con alternativa "else"
		// Vamos a mostrar un mensaje si el número es negativo (<0), pero también en
		// caso contrario.
		// Siempre se ejecuta al menos una rama del if/else
		if (numero < 0) {
			System.out.println("El número introducido es negativo.");
		} else {
			System.out.println("El número introducido es positivo o cero.");
		}

		
		System.out.println("Fin del programa.");
	}

}
