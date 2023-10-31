package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Iterator;
import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Repite el programa del problema 24, pero usando un bucle while.
 * Ver problema 23 para el enunciado
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Igual que el 23. 
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Pedir el número menor
 * 2. Pedir el número mayor
 * 3. Si el número menor es mayor que el mayor, mensaje de error
 * 4. En caso contrario:
 * 4.1. Declarar una variable iteradora num, e inicializarla con el valor menor.
 * 4.2. Hacer un while hasta que la variable num llegue al mayor incluido (<= mayor)
 * 4.3. Para cada iteración del bucle, mostrar la variable iteradora y un espacio.
 * 4.4. También dentro del bucle, incrementar el valor de la variable iteradora (num) 
 *   
 * ################################################################################
 */
public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedimos el menor de los valores
		System.out.print("Introduce el valor inicial: ");
		int numInicial = scanner.nextInt();

		// Pedimos el mayor de los valores
		System.out.print("Introduce el valor final: ");
		int numFinal = scanner.nextInt();

		// Si no están bien ordenados, mostramos un mensaje de error.
		if (numInicial > numFinal) {
			System.out.printf("%d no es menor o igual que %d", numInicial, numFinal);
		} else {
			// Declaramos la variable que vamos a usar para iterar
			// La inicializamos con el primero de los valores (el menor)
			int num = numInicial;
			// Mientras no alcancemos el mayor valor (incluido)
			while (num <= numFinal) {
				// En cada "pasada" del bucle, mostramos el valor de la variable iteradora.
				System.out.printf("%d ", num);
				// incrementamos su valor. En el for no es necesario, porque lo hace el propio
				// bucle.
				num++;
			}
		}
	}
}
