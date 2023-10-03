package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide
 * realizar un programa que:
 * 
 * <pre>
 * • Pida los valores de las variables al usuario. 
 * • Muestre el valor de esas variables. 
 * • Intercambie el valor de las variables.
 * • Vuelva a mostrar los valores para comprobar que se han intercambiado bien.
 * </pre>
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int variableA = scanner.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int variableB = scanner.nextInt();
		
		System.out.printf("La variable A vale %d y la variable B vale %d\n", variableA, variableB);

		// Intercambiar valores
		int auxiliar = variableA;
		variableA = variableB;
		variableB = auxiliar;
		
		System.out.printf("La variable A vale %d y la variable B vale %d\n", variableA, variableB);

	}
}
