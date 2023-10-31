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
 * Esta versión se hace con un bucle while. Hacemos lectura adelantada (una primera
 * lectura del número antes de entrar en el bucle) y luego se repite la lectura al 
 * final de cada iteración.  
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Declarar la variable numero. Se hace fuera del bucle porque hay que usarla 
 *    en el while.
 * 2. Pedir el primer número al usuario (lectura adelantada)
 * 3. Hacer un while mientras el número sea distinto de cero. Sólo entra la primera
 *    vez si el primer número es distinto de cero.
 * 4. En cada pasada del bucle:
 * 4.1. Mostrar el número. No hay que comprobar si es cero. Si lo es no entra en el while.
 * 4.2. Pedir número al usuario. Esto cambia el valor de número
 * 4.3. Volver al inicio, y evaluar la condición del while.
 *    
 * ################################################################################
 */
public class Ejercicio26C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedir número al usuario (lectura adelantada)
		System.out.print("Introduce un número entero, cero para terminar: ");
		int numero = scanner.nextInt();

		// Mientras que el número sea distinto de cero (o hasta que el número sea cero)
		while (numero != 0) {
			// Mostrar el número. No hace falta comprobar si es cero. El while no deja que
			// se entre dentro de esta parte si es distinto de cero.
			System.out.printf("El número introducido es el %d\n", numero);
			// Volver al pedir el número.
			System.out.print("Introduce un número entero, cero para terminar: ");
			numero = scanner.nextInt();
		}
		System.out.println("Fin de programa.");
	}
}
