package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Diseñar un programa que calcule el dinero que tenemos (en euros y céntimos)
 * después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20
 * céntimos o 10 céntimos).
 */
public class Ejercicio17B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cantidadTotalEnCentimos = 0;

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

		cantidadTotalEnCentimos += monedas2Euros * 200;
		cantidadTotalEnCentimos += monedas1Euros * 100;
		cantidadTotalEnCentimos += monedas50Cent * 50;
		cantidadTotalEnCentimos += monedas20Cent * 20;
		cantidadTotalEnCentimos += monedas10Cent * 10;

		System.out.println("La cantidad final es " + cantidadTotalEnCentimos/100D);
		
	}
}
