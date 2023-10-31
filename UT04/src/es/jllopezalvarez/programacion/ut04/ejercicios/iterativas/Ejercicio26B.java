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
 * Esta versión se hace con un bucle do-while, lo que permite que al menos se entre
 * una vez dentro del bucle.  
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Declarar la variable numero. Se hace fuera del bucle porque hay que usarla 
 *    en la parte while del do-while..
 * 2. Hacer un do-while mientras el número sea distinto de cero. Siempre entra la 
 *    primera vez en el bucle.
 * 3. En cada pasada del bucle:
 * 3.1. Pedir número al usuario.
 * 3.2. Si no es cero, mostrarlo. Por el requisito de no mostrar el cero.
 * 3.3. Comprobar la condición en el while. Mientras no sea cero, se vuelve al 
 *      principio del bucle..
 *   
 * ################################################################################
 */
public class Ejercicio26B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// La variable para guardar números se declara antes porque en los while y
		// do-while el while está fera del cuerpo del bucle.
		int numero;

		// Repetimos...
		do {
			// Pedimos el número al usuario
			System.out.print("Introduce un número entero, cero para terminar: ");
			numero = scanner.nextInt();
			// Si no es cero, lo mostramos.
			if (numero != 0) {
				System.out.printf("El número introducido es el %d\n", numero);
			}
		} while (numero != 0); // Mientras el número sea distinto de cero
		System.out.println("Fin de programa.");
	}
}
