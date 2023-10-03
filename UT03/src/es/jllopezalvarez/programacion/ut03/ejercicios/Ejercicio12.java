package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Pide al usuario dos números enteros y muestra la “distancia” entre ellos. La
 * distancia entre dos números enteros es el valor absoluto de su diferencia, de
 * modo que el resultado sea siempre positivo.
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();

		int distancia = Math.abs(primerNumero - segundoNumero);

		System.out.printf("La distancia entre %d y %d es %d\n", primerNumero, segundoNumero, distancia);

	}
}
