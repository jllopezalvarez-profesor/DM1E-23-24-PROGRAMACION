package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();

		// long resultado = factorial(numero);
		long resultado = factorialRecursivo(numero);
		System.out.printf("El factorial de %d es %d\n", numero, resultado);

	}

	private static long factorial(int numero) {
		long resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	private static long factorialRecursivo(int numero) {
		if (numero == 0) {
			return 1;
		}
		return numero * factorialRecursivo(numero - 1);
	}

}
