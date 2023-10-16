package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * Mezcla de las versiones A y B. 
 * De la A: usamos Sustem.out.printf en cada if para mostrar valores.
 * De la B: Usamos los if dentro de otros if.
 */
public class Ejercicio08C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();
		System.out.print("Introduce el tercer número: ");
		int tercerNumero = scanner.nextInt();

		if ((primerNumero >= segundoNumero) && (primerNumero >= tercerNumero)) {
			if (segundoNumero >= tercerNumero) {
				System.out.printf("Números ordenados: %d %d %d", primerNumero, segundoNumero, tercerNumero);
			} else {
				System.out.printf("Números ordenados: %d %d %d", primerNumero, tercerNumero, segundoNumero);
			}
		} else if ((segundoNumero >= primerNumero) && (segundoNumero >= tercerNumero)) {
			if (primerNumero >= tercerNumero) {
				System.out.printf("Números ordenados: %d %d %d", segundoNumero, primerNumero, tercerNumero);
			} else {
				System.out.printf("Números ordenados: %d %d %d", segundoNumero, tercerNumero, primerNumero);
			}
		} else if ((tercerNumero >= primerNumero) && (tercerNumero >= segundoNumero)) {
			if (primerNumero >= segundoNumero) {
				System.out.printf("Números ordenados: %d %d %d", tercerNumero, primerNumero, segundoNumero);
			} else {
				System.out.printf("Números ordenados: %d %d %d", tercerNumero, segundoNumero, primerNumero);
			}
		}

	}
}
