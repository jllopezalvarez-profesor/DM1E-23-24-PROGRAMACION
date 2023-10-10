package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio08B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();
		System.out.print("Introduce el tercer número: ");
		int tercerNumero = scanner.nextInt();

		int mayor = 0, medio = 0, menor = 0;

		if ((primerNumero >= segundoNumero) && (primerNumero >= tercerNumero)) {
			mayor = primerNumero;
			if (segundoNumero >= tercerNumero) {
				medio = segundoNumero;
				menor = tercerNumero;
			} else {
				medio = tercerNumero;
				menor = segundoNumero;
			}
		} else if ((segundoNumero >= primerNumero) && (segundoNumero >= tercerNumero)) {
			mayor = segundoNumero;
			if (primerNumero >= tercerNumero) {
				medio = primerNumero;
				menor = tercerNumero;
			} else {
				medio = tercerNumero;
				menor = primerNumero;
			}
		} else if ((tercerNumero >= primerNumero) && (tercerNumero >= segundoNumero)) {
			mayor = tercerNumero;
			if (primerNumero >= segundoNumero) {
				medio = primerNumero;
				menor = segundoNumero;
			} else {
				medio = segundoNumero;
				menor = primerNumero;
			}
		}
		System.out.printf("Números ordenados: %d %d %d", mayor, medio, menor);
	}
}
