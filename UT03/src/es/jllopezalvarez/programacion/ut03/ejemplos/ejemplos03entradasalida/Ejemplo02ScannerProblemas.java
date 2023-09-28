package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

import java.util.Scanner;

public class Ejemplo02ScannerProblemas {
	public static void main(String[] args) {
		System.out.println("Inicio del programa");

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero... ");
		int numero = sc.nextInt();
		System.out.printf("El número introducido es %d\n", numero);

		System.out.print("Introduce un número con decimales... ");
		double numeroConDecimales = sc.nextDouble();
		System.out.printf("El número introducido es %.2f\n", numeroConDecimales);

		System.out.print("Introduce una cadena...\n");
		String cadena = sc.nextLine();
		System.out.printf("La cadena introducida es '%s'\n", cadena);

		System.out.println("Fin del programa");

	}
}
