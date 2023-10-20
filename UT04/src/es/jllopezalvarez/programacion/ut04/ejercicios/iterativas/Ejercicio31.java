package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio31 {
	public static void main(String[] args) {
		/*
		 * Crea una aplicación que permita adivinar un número. La aplicación genera un
		 * número aleatorio del 1 al 99. A continuación, va pidiendo números y va
		 * respondiendo si el número a adivinar es mayor o menor que el introducido,
		 * además de informarle de los intentos que le quedan (tiene 10 intentos para
		 * acertarlo). El programa termina cuando se acierta el número (además te dice
		 * en cuantos intentos lo has acertado), si se llega al límite de intentos te
		 * muestra el número que había generado.
		 */

		Scanner scanner = new Scanner(System.in);

		Random rnd = new Random();
		int numeroSecreto = rnd.nextInt(1, 100);
		// Sólo para pruebas, muestro el nº secreto
		System.out.println("El número que hay que adivinar es el " + numeroSecreto);

		// El cero no es un valor válido para el número secreto y siempre será distinto
		// a ese número secreto
		int numero = 0;
		// Condición: seguir en el bucle si quedan intentos (intentosRestantes > 0) y si
		// aún no he adivinado el número
		int intentosRestantes;
		for (intentosRestantes = 10; (intentosRestantes > 0) && (numero != numeroSecreto); intentosRestantes--) {
			System.out.printf("Introduce un número (quedan %d intentos): \n", intentosRestantes);
			numero = scanner.nextInt();

			// Comprobar si el número es correcto;
			if (numeroSecreto < numero) {
				System.out.println("El número secreto es menor");
			} else if (numeroSecreto > numero) {
				System.out.println("El número secreto es mayor");
			}
		}
		if (numero != numeroSecreto) {
			// No acerté el número
			System.out.printf("Lo siento, no acertaste el número. Era el %d.\n", numeroSecreto);
		} else {
			// Sí acerté
			System.out.printf("Muy bien, acertaste en %d intentos.\n", 10 - intentosRestantes);
		}

	}

}
