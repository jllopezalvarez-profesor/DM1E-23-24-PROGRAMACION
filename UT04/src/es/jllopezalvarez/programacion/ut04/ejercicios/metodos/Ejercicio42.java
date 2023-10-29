package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Primer número a sumar: ");
		double numeroA = scanner.nextDouble();
		System.out.print("Segundo número a sumar: ");
		double numeroB = scanner.nextDouble();

		sumar(numeroA, numeroB);

	}

	private static void sumar(double a, double b) {
		System.out.printf("%.4f", a + b);
	}

}
