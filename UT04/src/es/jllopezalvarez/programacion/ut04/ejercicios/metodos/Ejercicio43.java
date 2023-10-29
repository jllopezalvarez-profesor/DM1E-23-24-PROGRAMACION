package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Primer número a sumar: ");
		double numeroA = scanner.nextDouble();
		System.out.print("Segundo número a sumar: ");
		double numeroB = scanner.nextDouble();

		double suma = sumar(numeroA, numeroB);
		System.out.printf("%.4f", suma);


	}

	private static double sumar(double a, double b) {
		return a + b;

	}

}
