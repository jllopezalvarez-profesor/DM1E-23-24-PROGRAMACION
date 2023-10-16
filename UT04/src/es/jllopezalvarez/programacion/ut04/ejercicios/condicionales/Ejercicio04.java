package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Crea un programa que pida al usuario dos números y muestre la división del primero 
 * por el segundo sólo si el segundo no es cero. Si el segundo es cero, mostrará un 
 * mensaje de aviso indicando que no se puede hacer la operación.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Tenemos que pedir dos números, y mostrar el resultado de la división. 
 * Si el divisor es 0 debemos responder un mensaje de error.
 * Datos de entrada: dividendo, divisor (entero)
 * Información de salida: El resultado de la división o un mensaje de error indicando 
 * que el divisor es igual a 0.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer los números
 * 2. Si el divisor es igual a 0 escribir "No se puede dividir por 0"
 * 3. En caso contrario mostrar el resultado de la división 
 * 
 * ################################################################################
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.print("Introduce el divisor: ");
		int divisor = scanner.nextInt();

		if (divisor == 0) {
			System.out.println("No se puede dividir por cero.");
		} else {
			System.out.printf("El resultado de dividir %d entre %d es %.2f", dividendo, divisor,
					(double) dividendo / divisor);
		}

		// Lo mismo pero invirtiendo la condición, en lugar de divisor igual a cero,
		// divisior distinto de cero
		if (divisor != 0) {
			System.out.printf("El resultado de dividir %d entre %d es %.2f", dividendo, divisor,
					(double) dividendo / divisor);
		} else {
			System.out.println("No se puede dividir por cero.");
		}

	}

}
