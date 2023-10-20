package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio33A {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no
		 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 * unidad.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();

		int numeroDeDivisores = 0;

		// Empezamos en 2 porque todos los números son divisibles por 1
		// Llegamos a numero-1, porque no tenemos que probar numero / numero
		for (int divisor = 2; divisor < numero; divisor++) {
			int resto = numero % divisor;
			if (resto == 0) {
				numeroDeDivisores++;
			}
		}
		if (numeroDeDivisores > 0) {
			System.out.println("El número no es primo");
		} else {
			System.out.println("El número es primo");
		}
	}
}
