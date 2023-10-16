package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribe un programa en Java que simule una calculadora de operaciones básicas.
 * El programa debe solicitar al usuario que introduzca dos números y luego le 
 * dará la opción de realizar una de las siguientes operaciones: 
 * - suma
 * - resta
 * - multiplicación
 * - división
 * El usuario debe seleccionar la operación deseada introduciendo un número del 
 * 1 al 4. Luego, el programa debe realizar la operación seleccionada y mostrar 
 * el resultado. Si la operación es ilegal (división por cero), debe mostrar un 
 * mensaje indicando que no se puede realizar.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Hay que pedir los dos operandos.
 * Una vez solicitados, mostrar las operaciones disponibles, y preguntar al usuario
 * qué operación quiere realizar. Si introduce una operación no disponible se 
 * mostrará un mensaje de error.
 * Si la operación es ilegal (dividir por cero), se mostrará un mensaje de error.
 * Si todo va bien se mostrará el resultado de la operación
 * Datos de entrada: operando 1 (double), operando 2 (double), operación (número)
 * Información de salida: resultado de la operación, o mensaje de error si no se 
 * ha seleccionado una operación válida o no se puede realizar. 
 *   
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer operanado1 y operando2
 * 2. Mostrar las operaciones disponibles y preguntar cuál quiere realizar
 * 3. Si es 1, mostrar la suma
 * 4. Si es 2, mostrar la resta del primero menos el segundo
 * 5. Si es 3, mostrar la multiplicación
 * 6. Si es 4, comprobar si el segundo operando es cero.
 * 6.1 Si es cero, mostrar mensaje de error
 * 6.2 Si es distinto de cero, mostrar la división del primero por el segundo.
 * 7. Si la operación es un valor no válido mostrar mensaje de error.
 * ################################################################################
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos el primer operando
		System.out.print("Primer operando: ");
		double operando1 = scanner.nextDouble();

		// Preguntamos el segundo operando
		System.out.print("Segundo operando: ");
		double operando2 = scanner.nextDouble();

		// Mostramos operaciones
		System.out.println("Operaciones disponibles: ");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicación");
		System.out.println("4 - División");
		System.out.print("Operación a realizar: ");

		// Leemos la operación
		int operacion = scanner.nextInt();

		// Hacemos un switch para la operación, y si no es una válida mostramos un
		// mensaje de error.
		switch (operacion) {
		case 1:
			System.out.printf("La suma de %f y %f es %f", operando1, operando2, operando1 + operando2);
			break;
		case 2:
			System.out.printf("La resta de %f menos %f es %f", operando1, operando2, operando1 - operando2);
			break;
		case 3:
			System.out.printf("La multiplicación de %f y %f es %f", operando1, operando2, operando1 * operando2);
			break;
		case 4:
			// Comprobamos si el operando 2 es cero.
			if (operando2 == 0) {
				System.out.println("No se puede dividir por cero.");
			} else {
				System.out.printf("La división de %f entre %f es %f", operando1, operando2, operando1 / operando2);
			}
			break;
		default:
			System.out.println("Operación no válida");
			break;
		}
	}
}
