package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio33E {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no
		 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
		 * unidad.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();

		int raizNumero = (int) Math.sqrt(numero);

		boolean hayDivisor = false;

		long inicio = System.currentTimeMillis();

		if (numero != 2) {
			if (numero % 2 == 0) {
				hayDivisor = true;
			} else {
				// Empezamos en 2 porque todos los números son divisibles por 1
				// Llegamos a numero-1, porque no tenemos que probar numero / numero
				for (int divisor = 3; (divisor <= raizNumero) && (!hayDivisor); divisor += 2) {
					int resto = numero % divisor;
					if (resto == 0) {
						hayDivisor = true;
					}
				}
			}
		}
		long fin = System.currentTimeMillis();
		if (hayDivisor) {
			System.out.println("El número no es primo");
		} else {
			System.out.println("El número es primo");
		}
		System.out.printf("Tiempo invertido: %s", fin - inicio);

	}
}
