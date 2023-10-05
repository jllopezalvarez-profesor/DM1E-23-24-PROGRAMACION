package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo03IfElseIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Vamos a mostrar un mensaje distinto para cada caso:
		// Si el número es negativo (<0)
		// Si es positivo (>0)
		// En último caso (==0)
		if (numero < 0) {
			System.out.println("El número introducido es negativo");
		} else if (numero > 0) {
			System.out.println("El número introducido es positivo");
		} else {
			System.out.println("El número introducido es cero");
		}

		System.out.println("Fin del programa.");
	}

}
