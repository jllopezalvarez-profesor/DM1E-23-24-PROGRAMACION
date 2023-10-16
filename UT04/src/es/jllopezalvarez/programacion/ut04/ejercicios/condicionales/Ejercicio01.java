package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribir un programa que pida dos números e indique si el primero es mayor que el segundo o no.
 *
 * ################################################################################
 * Análisis
 * ################################################################################
 * Tenemos que pedir dos números por teclado, compararlos e indicar si el primero es mayor que el segundo o no.
 * Datos de entrada:número 1, número 2
 * Información de salida: Un mensaje de texto indicando si es mayor.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer los números
 * 2. Si el número 1 es mayor que el segundo escribir "El primero es mayor"
 * 3. En caso contrario escribir "El primero no es mayor que el segundo" o "El primero es menor o igual que el segundo."
 *  
 * ################################################################################
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundonúmero: ");
		int segundoNumero = scanner.nextInt();

		if (primerNumero > segundoNumero) {
			System.out.println("El primero es mayor que el segundo.");
		} else {
			System.out.println("El primero es menor o igual que el segundo.");

		}

	}

}
