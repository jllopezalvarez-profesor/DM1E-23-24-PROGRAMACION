package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		if (numero == 0) {
			System.out.println("El cero no es par ni impar.");
		} else {
			int resto = numero % 2;

			// El resto de dividir por dos sólo puede ser 0 o 1
			if (resto == 0) {
				System.out.printf("%d es par\n", numero);
			} else
				System.out.printf("%d es impar\n", numero);
			
		}
	}
}
