package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pida al usuario tres números, y calcule y muestre la
 * media de los tres números.
 */
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// int numeroUno, numeroDos, numeroTres;

		System.out.print("Introduce el primer número: ");
		int numeroUno = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numeroDos = scanner.nextInt();
		System.out.print("Introduce el tercer número: ");
		int numeroTres = scanner.nextInt();

		// La D significa que el 3 es double
		// double media = (numeroUno + numeroDos + numeroTres) / 3D;
		double media = (double)(numeroUno + numeroDos + numeroTres) / 3;
		System.out.printf("La media de %d, %d, y %d es %f.\n", numeroUno, numeroDos, numeroTres, media);

	}

}
