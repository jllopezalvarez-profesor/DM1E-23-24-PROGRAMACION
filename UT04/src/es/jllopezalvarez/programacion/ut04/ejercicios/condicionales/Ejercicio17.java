package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribe un programa que pida un número entero entre uno y doce (un mes)
 * Mostrará:
 * - Si el mes no es un número entre 1 y 12 a.i., mostrará un error.
 * - El número de días del mes
 *  
 * ################################################################################
 * Análisis
 * ################################################################################
 * Leer un mes como entero e indicar los días que tiene el mes.
 * Como no sabemos el año (ni si es bisiesto), para febrero ponemos "28 o 29 días".
 * Si el número introducido es incorrecto mostrar mensaje de error.
 * Datos de entrada: mes (entero)
 * Información de salida: cantidad de días del mes indicado o mensaje de error
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer número que representa el mes. Según el valor del mes:
 * 2. Si es el 1,3,5,7,8,10,12: tiene 31 días
 * 3. Si es el 4,6,9,11: tiene 30 días
 * 4. Si es el 2: tiene 28 o 29 días
 * 6. Si es otro número, mostrar mensaje de error
 * 
 * ################################################################################
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos el mes
		System.out.print("¿De qué mes quieres saber el número de días (1 al 12)? ");
		int mes = scanner.nextInt();

		// Evaluamos los casos posibles
		switch (mes) {
		case 1,3,5,7,8,10,12:
			System.out.println("31 días");
			break;
		case 4,6,9,11:
			System.out.println("30 días");
			break;
		case 2:
			System.out.println("28 o 19 días, depende del año");
			break;
		default:
			System.out.println("ERROR: mes incorrecto.");
			break;
		}
	}
}
