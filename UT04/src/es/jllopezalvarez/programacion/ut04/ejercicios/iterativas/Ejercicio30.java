package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Haz un programa que muestre la tabla de multiplicar de los números 1,2,3,4 y 5. 
 * Hazlo usando un bucle anidado, un bucle dentro de otro.
 *  
 * ################################################################################
 * Análisis
 * ################################################################################
 * Hay que hacer la tabla de multiplicar del uno al cinco ambos incluidos.
 * Cada tabla, a su vez, va del uno al diez ambos incluidos.
 * Nos piden que se usen bucles anidados. Vamos a hacer un bucle del 1 al 5 y, 
 * dentro de este, otro del 1 al 10.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Hacer un bucle del 1 al 5 ambos incluidos (<= 5), y dentro de este:
 * 1.1. Hacer un bucle del 1 al 10 ambos incluidos (<=10) y dentro de este:
 * 1.1.1 Mostrar la multiplicación de un número por otro, y el resultado.
 * 1.2. Cada vez que terminemos el bucle interior, ponemos un salto de línea 
 *      adicional para que sea más estético, no se pequen las tablas. 
 *    
 * ################################################################################
 */
public class Ejercicio30 {
	public static void main(String[] args) {

		// Primer bucle, para los números de los que vamos a hacer la tabla
		for (int operando1 = 1; operando1 <= 5; operando1++) {
			// Segundo bucle, para los números del 1 al 10
			for (int operando2 = 1; operando2 <= 10; operando2++) {
				// Mostramos la operación y el resuktado
				// Usamos %2d para que ocupen 2 dígitos y quede mejor formada la tabla
				System.out.printf("%2dx%2d=%2d\n", operando1, operando2, operando1 * operando2);
			}
			// Salto de línea para que se separen las tablas
			System.out.println();
		}
	}
}
