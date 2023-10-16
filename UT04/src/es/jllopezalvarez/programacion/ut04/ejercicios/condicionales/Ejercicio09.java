package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribir un programa que lea un año e indicar si es bisiesto. 
 * Un año es bisiesto si es un número divisible por 4, pero no si es divisible 
 * por 100, excepto que también sea divisible por 400.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Pedir un año y comprobar si es bisiesto.
 * Datos de entrada: el año (entero)
 * Información de salida: Si el año es bisiesto o no
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer año
 * 2. Si el año es divisible por 4, pero no si es divisible por 100 , o 
 * si es divisible por 4, por 100 y por 400 a la vez, es bisiesto.
 * 3. En caso contrario, no es bisiesto.
 * ################################################################################
 */
public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el año: ");
		int anio = scanner.nextInt();

		boolean divisiblePorCuatro = (anio % 4) == 0;
		boolean divisiblePorCien = (anio % 100) == 0;
		boolean divisiblePorCuatrocientos = (anio % 400) == 0;

		// Condición traduciendo literalmente el enunciado / diseño del problema.
		if ((divisiblePorCuatro && !divisiblePorCien)
				|| (divisiblePorCuatro && divisiblePorCien && divisiblePorCuatrocientos)) {
			System.out.printf("El año %d es bisiesto", anio);

		} else {
			System.out.printf("El año %d NO es bisiesto", anio);
		}

		// Otra versión:
		// La segunda parte de la condición se puede simplificar, porque si un número es
		// divisible por 400, necesariamente va a ser divisible por cuatro y por 100,
		// así que podemos quitar esos dos criterios, y quedarnos solo con divisible por 400;
		if ((divisiblePorCuatro && !divisiblePorCien) || divisiblePorCuatrocientos) {
			System.out.printf("El año %d es bisiesto", anio);
		} else {
			System.out.printf("El año %d NO es bisiesto", anio);
		}

	}
}
