package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("El número introducido es negativo");
		} else if (numero > 0) {
			System.out.println("El número introducido es positivo");
		} else {
			System.out.println("El número introducido es cero");
		}
	}

}
