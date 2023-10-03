package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Diseñar un programa que calcule el dinero que tenemos (en euros y céntimos)
 * después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20
 * céntimos o 10 céntimos).
 */
public class Ejercicio17A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double cantidadTotalEnEuros = 0;

		System.out.print("Cantidad de monedas de 2 euros: ");
		int monedas2Euros = scanner.nextInt();
		System.out.print("Cantidad de monedas de 1 euro: ");
		int monedas1Euros = scanner.nextInt();
		System.out.print("Cantidad de monedas de 50 céntimos: ");
		int monedas50Cent = scanner.nextInt();
		System.out.print("Cantidad de monedas de 20 céntimos: ");
		int monedas20Cent = scanner.nextInt();
		System.out.print("Cantidad de monedas de 10 céntimos: ");
		int monedas10Cent = scanner.nextInt();

		cantidadTotalEnEuros += monedas2Euros * 2;
		cantidadTotalEnEuros += monedas1Euros;
		cantidadTotalEnEuros += monedas50Cent * 0.5;
		cantidadTotalEnEuros += monedas20Cent * 0.2;
		cantidadTotalEnEuros += monedas10Cent * 0.1;

		System.out.println("La cantidad final es " + cantidadTotalEnEuros);
		
	}
}
