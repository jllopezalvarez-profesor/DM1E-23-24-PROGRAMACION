package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce X1: ");
		int x1 = scanner.nextInt();
		System.out.print("Introduce Y1: ");
		int y1 = scanner.nextInt();
		System.out.print("Introduce R1: ");
		int r1 = scanner.nextInt();

		System.out.print("Introduce X2: ");
		int x2 = scanner.nextInt();
		System.out.print("Introduce Y2: ");
		int y2 = scanner.nextInt();
		System.out.print("Introduce R2: ");
		int r2 = scanner.nextInt();

		double distanciaCentros = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double sumaRadios = r1 + r2;
		double diferenciaRadios = Math.abs(r2 - r1);

		/**
		 * Valores de prueba para cada caso:
		 * 
		 * <pre>
		 		Exteriores:
			        Circunferencia 1: Centro (0, 0), Radio 3
			        Circunferencia 2: Centro (8, 0), Radio 4
			    Secantes:
			        Circunferencia 1: Centro (0, 0), Radio 4
			        Circunferencia 2: Centro (8, 0), Radio 5
			    Interiores:
			        Circunferencia 1: Centro (0, 0), Radio 5
			        Circunferencia 2: Centro (3, 0), Radio 1
			    Tangentes Exteriores:
			        Circunferencia 1: Centro (0, 0), Radio 3
			        Circunferencia 2: Centro (5, 0), Radio 2
			    Tangentes Interiores:
			        Circunferencia 1: Centro (0, 0), Radio 4
			        Circunferencia 2: Centro (2, 0), Radio 2
			    Concéntricas:
			        Circunferencia 1: Centro (0, 0), Radio 4
			        Circunferencia 2: Centro (0, 0), Radio 6
			    Superpuestas (o la misma circunferencia):
			        Circunferencia 1: Centro (0, 0), Radio 5
			        Circunferencia 2: Centro (0, 0), Radio 5
		 * </pre>
		 */

		if (distanciaCentros > sumaRadios) {
			System.out.println("Las circunferencias son exteriores");
		}
		if ((distanciaCentros < sumaRadios) && (distanciaCentros > diferenciaRadios)) {
			System.out.println("Las circunferencias son secantes");
		}
		if ((distanciaCentros > 0) && (distanciaCentros < diferenciaRadios)) {
			System.out.println("Las circunferencias son interiores");
		}
		if (distanciaCentros == sumaRadios) {
			System.out.println("Las circunferencias son tangentes exteriores");
		}
		if (distanciaCentros == diferenciaRadios) {
			System.out.println("Las circunferencias son tangentes interiores");
		}
		if (distanciaCentros == 0) {
			System.out.println("Las circunferencias son concéntricas");
		}
	}
}
