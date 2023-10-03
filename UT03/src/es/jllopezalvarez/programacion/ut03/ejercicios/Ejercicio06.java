package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que convierta un valor dado en grados Fahrenheit a
 * grados Celsius. La fórmula para la conversión es: C = (F-32) * 5 / 9. El
 * programa debe funcionar con temperaturas con decimales. El resultado de la
 * conversión se mostrará redondeado con dos decimales.
 */
public class Ejercicio06 {

	final static double RESTA_CALCULO_TEMPERATURA = 32;
	final static double FACTOR_CALCULO_TEMPERATURA = (5 / 9);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la temperatura en ºFarenheit (puedes usar decimales): ");
		double temperaturaF = scanner.nextDouble();

		double temperaturaC = (temperaturaF - RESTA_CALCULO_TEMPERATURA) * FACTOR_CALCULO_TEMPERATURA;

		// double temperaturaC = (temperaturaF - 32) * (5 / 9);

		System.out.printf("%.2f ºF son %.2f ºC.\n", temperaturaF, temperaturaC);

	}
}
