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
 * Esta versión se hace con un bucle while, pero se inicializa la variable número 
 * con un valor que sabemos que cumple la condición del while para forzar la entrada.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Declarar la variable numero. Se hace fuera del bucle porque hay que usarla 
 *    en el while. Se inicializa con un valor distinto de cero para que entre la 
 *    primera vez en el bucle.
 * 2. Hacer un while mientras el número sea distinto de cero. Siempre entra la 
 *    primera vez porque se ha inicializado numero con un valor que cumple la condición.
 * 3. En cada pasada del bucle:
 * 3.1. Pedir número al usuario. 
 * 3.2. Mostrar el número sólo si es distinto de cero.
 * 3.3. Volver al inicio, y evaluar la condición del while.
 *    
 * ################################################################################
 */
public class Ejercicio26D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Inicializamos la variable con un valor distinto de cero.
		// Aquí usamos una constante que es el máximo valor de un entero.
		int numero = Integer.MAX_VALUE;
		
		// Mientras que el valor sea distinto de cero
		while (numero != 0) {
			// Pedir el número
			System.out.print("Introduce un número entero, cero para terminar: ");
			numero = scanner.nextInt();
			// Si es distinto de cero lo mostramos.
			if (numero != 0) {
				System.out.printf("El número introducido es el %d\n", numero);
			}
		}
		System.out.println("Fin de programa.");
	}
}
