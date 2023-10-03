package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Realiza un programa que reciba una cantidad de minutos y muestre por pantalla
 * a cuántas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas
 * y 40 minutos. Utiliza constantes para minimizar el uso de literales. Pista:
 * división entera y resto de división entera.
 */
public class Ejercicio08 {
	
	
	
	private static final int MINUTOS_POR_HORA = 60;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de minutos: ");
		int totalMinutos = scanner.nextInt();
		int horas = totalMinutos / MINUTOS_POR_HORA;
		int minutos = totalMinutos % MINUTOS_POR_HORA;
		
		System.out.printf("En %d minutos hay %d horas y %d minutos\n", totalMinutos, horas, minutos);
		
	}
}
