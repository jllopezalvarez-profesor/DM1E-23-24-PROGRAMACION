package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el año: ");
		int anio = scanner.nextInt();

		boolean divisiblePorCuatro = (anio % 4) == 0;
		boolean divisiblePorCien = (anio % 100) == 0;
		boolean divisiblePorCuatrocientos = (anio % 400) == 0;

		if ((divisiblePorCuatro && !divisiblePorCien)
				|| (divisiblePorCuatro && divisiblePorCien && divisiblePorCuatrocientos)) {
			System.out.printf("El año %d es bisiesto", anio);
		} else {
			System.out.printf("El año %d NO es bisiesto", anio);
		}

	}
}
