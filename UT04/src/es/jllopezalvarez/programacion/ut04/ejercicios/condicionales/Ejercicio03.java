package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribe un programa que lea un número e indique si es par o impar. El resto de la 
 * división entera de un número entre dos es cero si es par, y uno si es impar. 
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Tenemos que pedir un número por teclado, y comprobar si es par o impar.
 * El cero es par por dos motivos:
 * Al dividirlo por 2 su resto es cero. Pero como también es cero al dividirlo 
 * con el resto de los números, la segunda prueba es que se encuentra en la 
 * secuencia entre dos números impares: -1 y 1
 * Datos de entrada: número (entero)
 * Información de salida: Un mensaje de texto indicando si el número es par o impar.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer el numero
 * 2. Si el resto de dividir el número entre 2 es igual a 0 el número es par.
 * 3. En caso contrario es impar
 *  
 * ################################################################################
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		int resto = numero % 2;

		// El resto de dividir por dos sólo puede ser 0 o 1
		if (resto == 0) {
			System.out.printf("%d es par\n", numero);
		} else
			System.out.printf("%d es impar\n", numero); 

	}
}
