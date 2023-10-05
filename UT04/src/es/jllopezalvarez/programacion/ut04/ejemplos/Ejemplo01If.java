package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo01If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		// Ejemplo de uso de if, sin alternativa "else"
		// Sólo vamos a mostrar un mensaje si el número es negativo (<0)
		if (numero < 0) {
			System.out.println("El número introducido es negativo.");
		}

		// Si se ha introducido un número >= 0 no se hace nada, se continúa con la
		// primera sentencia despues del cierre del if
		System.out.println("Fin del programa.");
	}

}
