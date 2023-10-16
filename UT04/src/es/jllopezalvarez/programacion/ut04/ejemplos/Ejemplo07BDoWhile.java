package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo07BDoWhile {

	public static void main(String[] args) {
		// Demo de while para preguntar al usuario un número hasta que sea cero
		// O lo que es lo mismo, mientras sea distinto de cero. En este caso usamos
		// do-while.
		int numero;
		Scanner sc = new Scanner(System.in);

		// En este caso se entra al menos la primera vez en el bucle.
		do {
			// Preguntamos al usuario el número.
			System.out.print("Introduce un número. Cero para terminar: ");
			numero = sc.nextInt();

			// Mostramos el número introducido
			System.out.printf("El número introducido es %d\n", numero);

			// Mientras que el usuario no introduzca un cero volvemos al principio del
			// bucle, donde se vuelve a preguntar el número.
		} while (numero != 0);

		// Cuando el usuario haya introducido un cero, llegaremos a este punto.
		System.out.println("Fin del programa...");

	}

}
