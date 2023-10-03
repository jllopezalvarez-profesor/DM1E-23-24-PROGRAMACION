package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que lea un número y que muestre su raíz cuadrada, su
 * raíz cúbica y su raíz quinta. Java no tiene ninguna función predefinida que
 * permita calcular la raíz quinta, ¿Cómo se puede calcular? Disclaimer: ya sé
 * que esto de la raíz quinta es más de matemáticas de ESO que de programación,
 * pero nos hace pensar.
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();

		System.out.printf("La raíz cuadrada de %d es %.2f\n", numero, Math.sqrt(numero));
		System.out.printf("La raíz cúbica de %d es %.2f\n", numero, Math.cbrt(numero));
		System.out.printf("La raíz quinta de %d es %.2f\n", numero, Math.pow(numero, (1D / 5)));

	}
}
