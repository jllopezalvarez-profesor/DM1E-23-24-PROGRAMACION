package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio34 {
	public static void main(String[] args) {
		/*
		 * Programa que muestra en pantalla los N primeros números primos. Se pide por
		 * teclado la cantidad de números primos que queremos mostrar.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Cuántos primos quieres calcular? ");

		int cantidadPrimos = scanner.nextInt();

		int numero = 2;

		while (cantidadPrimos > 0) {
			// Si es primo resto 1 a cantidadPrimos
			if (esPrimo(numero)) {
				System.out.println(numero);
				cantidadPrimos--;
			} 
			// Sumo 1 a numeroPrueba
			numero++;
		}

	}

	private static boolean esPrimo(int numero) {
		int raizNumero = (int) Math.sqrt(numero);
		boolean hayDivisor = false;

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
		return !hayDivisor;
	}
}
