package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mensaje: ");
		String mensaje = scanner.nextLine();
		System.out.print("Número de veces que lo quieres mostrar: ");
		int veces = scanner.nextInt();

		System.out.printf("Valor de veces antes de entrar al método: %d\n", veces);

		mostrarNVeces(mensaje, veces);

		System.out.printf("Valor de veces después de salir del método: %d\n", veces);

	}

	private static void mostrarNVeces(String mensaje, int cuantasVeces) {

		System.out.printf("Valor de cuantasVeces al entrar en el método: %d\n", cuantasVeces);
		if (cuantasVeces < 0) {
			System.out.println("El número de veces no puede ser menor que cero.");
		}
		while (cuantasVeces > 0) {
			System.out.println(mensaje);
			cuantasVeces--;
		}
		System.out.printf("Valor de cuantasVeces antes de salir del método: %d\n", cuantasVeces);
	}

}
