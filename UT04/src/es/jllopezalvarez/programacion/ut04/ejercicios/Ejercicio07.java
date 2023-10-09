package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		System.out.print("Introduce tu nota: ");
		int nota = scanner.nextInt();
		System.out.print("Introduce tu sexo: ");
		String sexo = scanner.nextLine();
		
		System.out.printf("Edad: '%s'\n", edad);
		System.out.printf("Edad: '%s'\n", nota);
		System.out.printf("Edad: '%s'\n", sexo);
		

	}
}
