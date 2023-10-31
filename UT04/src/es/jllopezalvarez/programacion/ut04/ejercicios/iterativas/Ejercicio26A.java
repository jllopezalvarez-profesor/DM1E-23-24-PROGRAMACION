package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Algoritmo que pida números hasta que se introduzca un cero. 
 * Debe mostrar cada uno de los números introducidos, hasta que el usuario 
 * introduzca el cero, a medida que los vaya introduciendo. El cero, que es 
 * el número con el que el usuario “corta” el programa, no debe mostrarse.
 *  
 * ################################################################################
 * Análisis
 * ################################################################################
 * Hay que pedir números al usuario hasta que intruzca un cero, que es lo mismo que 
 * mientras el valor introducido sea distinto de cero.
 * Hay que mostrar cada número que el usuario introduce, excepto el que provoca el 
 * corte, que es el cero. El cero no hay que mostrarlo.
 * Esta versión se hace con un flag, una variable boolean que se usa para controlar
 * la permanencia en el bucle. 
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Crear una variable boolean esCero, que por defecto tiene valor false. Esta 
 *    variable será la que se usará para la condición de salida del bucle.
 * 2. Hacer un while(!esCero). esCero inicialmente es false, y entra en el bucle.
 * 3. En cada pasada del bucle:
 * 3.1. Pedir número al usuario.
 * 3.2. Comprobar si el número es cero, y actualizar el valor de esCero.
 * 3.3. Si no es cero, mostrarlo. Por el requisito de no mostrar el cero.
 * 3.4. Volver al principio del bucle.
 *   
 * ################################################################################
 */
public class Ejercicio26A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Flag para controlar la salida del bucle
		boolean esCero = false;
		
		// Entra la primera vez por que esCero vale false.
		while (!esCero) {
			// Pedir número al usuario.
			System.out.print("Introduce un número entero, cero para terminar: ");
			int numero = scanner.nextInt();
			// Calculamos si es cero
			esCero = numero == 0;
			// Si es cero no se muestra el número
			if (!esCero) {
				System.out.printf("El número introducido es el %d\n", numero);
			}
		}
		System.out.println("Fin de programa.");
	}
}
