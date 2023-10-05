package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.print("Introduce el divisor: ");
		int divisor = scanner.nextInt();

		if (divisor == 0) {
			System.out.println("No se puede dividir por cero.");
		} else {
			System.out.printf("El resultado de dividir %d entre %d es %.2f", dividendo, divisor,
					(double) dividendo / divisor);
		}

		// Lo mismo pero invirtiendo la condición
		if (divisor != 0) {
			System.out.printf("El resultado de dividir %d entre %d es %.2f", dividendo, divisor,
					(double) dividendo / divisor);
		} else {
			System.out.println("No se puede dividir por cero.");
		}

	}

}
