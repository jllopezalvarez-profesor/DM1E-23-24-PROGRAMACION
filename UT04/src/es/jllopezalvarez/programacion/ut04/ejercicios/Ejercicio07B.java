package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio07B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce tu nota: ");
		int nota = scanner.nextInt();
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		scanner.nextLine(); // Hacemos nextLine para consumir el \n que no consume nextInt
		System.out.print("Introduce tu sexo: ");
		String sexo = scanner.nextLine();

		if ((edad >= 18) && (nota >= 5)) {
			if (sexo.equals("F")) {
				System.out.println("ACEPTADA");
			} else if (sexo.equals("M")) {
				System.out.println("POSIBLE");
			} else {
				System.out.println("NO ACEPTADA");
			}
		} else {
			System.out.println("NO ACEPTADA");
		}

	}
}
