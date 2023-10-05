package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundonúmero: ");
		int segundoNumero = scanner.nextInt();

		if (primerNumero > segundoNumero) {
			System.out.println("El primero es mayor que el segundo.");
		} else {
			System.out.println("El primero es menor o igual que el segundo.");
			
		}

	}

}
