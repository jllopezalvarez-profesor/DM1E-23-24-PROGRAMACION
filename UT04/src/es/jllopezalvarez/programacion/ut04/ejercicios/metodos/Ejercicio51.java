package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numA = pedirNumero(scanner, "Introduce tu edad, entre 18 y 30 ambos incluidos", 18, 31);
		System.out.println("El usuario ha respondido: " + numA);
		int numB = pedirNumero(scanner, "Introduce la cantidad a escribir, entre 100 y 200 (no incluido)", 100, 200);
		System.out.println("El usuario ha respondido: " + numB);
		int numC = pedirNumero(scanner, "Introduce un año entre el 2000 y el 2010", 2000, 1990);
		System.out.println("El usuario ha respondido: " + numC);
		
	
	}

	public static int pedirNumero(Scanner sc, String pregunta, int min, int max) {
		int numero = 0;

		// Sólo si min y max están bien ordenados, interactuo con el usuario
		if (min <= max) {
			do {
				System.out.println(pregunta);
				numero = sc.nextInt();
				if (numero < min || numero >= max) {
					System.out.printf("El número introducido no está entre %d (incluido) y %d (excluido)\n", min, max);
				}
			} while (numero < min || numero >= max);
		} else {
			System.err.println("Los valores min y max no son correctos");
		}

		return numero;
	}
}
