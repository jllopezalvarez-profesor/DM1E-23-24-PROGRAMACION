package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Iterator;
import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Haz un programa que permita escribir la tabla de multiplicar de un número que se pregunte al usuario.
 * Ejemplo de tabla de multiplicar generada por el programa para el número 3:
 * 3x1=3
 * 3x2=6
 * 3x3=9
 * 3x4=12
 * 3x5=15
 * 3x6=18
 * 3x7=21
 * 3x8=24
 * 3x9=27
 * 3x10=30
 *  
 * ################################################################################
 * Análisis
 * ################################################################################
 * Hay que pedir un número al usuario. El enunciado no dice nada, pero suponemos que será un número entero.
 * Hay que mostrar los operandos y el resultado de multiplicar el número por los números del uno al diez.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Pedir el número al usuario.
 * 2. Hacer un for desde 1 hasta 10 ambos incluidos (<=10)
 * 3. En cada iteración, mostrar numeroxiterador = resultado de la multiplicación
 *  
 * ################################################################################
 */
public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedimos el número al usuario.
		System.out.print("Introduce el número del que quieres calcular la tabla: ");
		int numTabla = scanner.nextInt();

		// Hacemos un bucle desde
		for (int n = 1; n <= 10; n++) {
			// Mostramos la multiplicación
			System.out.printf("%dx%d=%d\n", numTabla, n, n * numTabla);
		}
	}

}
