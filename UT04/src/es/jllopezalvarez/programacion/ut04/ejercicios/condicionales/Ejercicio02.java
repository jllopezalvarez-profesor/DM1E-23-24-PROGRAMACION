package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Algoritmo que pida un número y diga si es positivo, negativo o 0.
 *
 * ################################################################################
 * Análisis
 * ################################################################################
 * Tenemos que pedir un número por teclado, compararlo con 0, e indicar si es igual, mayor o menor que 0.
 * Datos de entrada: número (entero)
 * Información de salida: Un mensaje de texto indicando si el número es igual, mayor o menor que 0.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer el numero
 * 2. Si el número es menor que 0 escribir "El número introducido es negativo"
 * 3. En caso contrario si es mayor que 0 escribir "El número introducido es positivo"
 * 4. En otro caso escribir "El número introducido es cero"
 *  
 * ################################################################################
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("El número introducido es negativo");
		} else if (numero > 0) {
			System.out.println("El número introducido es positivo");
		} else {
			System.out.println("El número introducido es cero");
		}
	}

}
