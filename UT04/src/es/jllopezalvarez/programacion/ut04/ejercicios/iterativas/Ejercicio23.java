package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Realiza un programa que:
 * - Pida al usuario un número inicial (entero)
 * - Pida al usuario un número final (entero)
 * - Si el número inicial no es menor o igual al número final, mostrará un mensaje de error.
 * - En caso contrario, usando un bucle bucle for, muestre todos los números desde el inicial al final, separados por espacios, ambos incluidos. 
 *  
 * ################################################################################
 * Análisis
 * ################################################################################
 * Hay que pedir dos números enteros al usuario. Primero el menor y luego el mayor.
 * Hay que comprobar que los números están ordenados, que el usuario ha hecho caso
 * a las instrucciones.
 * Si no lo ha hecho se mostrará un mensaje de error.
 * Si lo ha hecho bien, mostrar todos los números del inicial al final, en una sola
 * línea, separados por un espacio. Hay que mostrar todos, incluidos el menor y el mayor
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Pedir el número menor
 * 2. Pedir el número mayor
 * 3. Si el número menor es mayor que el mayor, mensaje de error
 * 4. En caso contrario:
 * 4.1. Hacer un for desde el menor al mayor incluido (<= mayor)
 * 4.2. Para cada iteración del bucle, mostrar la variable iteradora y un espacio.
 * 
 * ################################################################################
 */
public class Ejercicio23 {
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
			// Hacemos un bucle desde el inicial al final ambos incluidos
			// Para que incluya el final se usa <= en la condición   
			for (int num = numInicial; num <= numFinal; num++) {
				// En cada "pasada" del bucle, mostramos el valor de la variable iteradora.
				System.out.printf("%d ", num);
			}
		}
	}
}
