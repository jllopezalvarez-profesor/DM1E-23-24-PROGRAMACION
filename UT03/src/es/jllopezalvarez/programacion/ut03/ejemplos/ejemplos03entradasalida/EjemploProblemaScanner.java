package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

import java.util.Scanner;

public class EjemploProblemaScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("Hola José Luis\n23\n55\n34.23\nHola otra vez");
		
		String frase = scanner.nextLine();
		System.out.printf("Frase: %s\n", frase);
		int numeroEntero = scanner.nextInt();
		System.out.printf("Entero: %s\n", numeroEntero);
		numeroEntero = scanner.nextInt();
		System.out.printf("Entero: %s\n", numeroEntero);
		double numeroReal = scanner.nextDouble();
		System.out.printf("Real: %s\n", numeroReal);
		scanner.nextLine();
		String frase2 = scanner.nextLine();
		System.out.printf("Frase2: %s\n", frase2);

	}

}
