package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que pregunte al usuario dos números. Con esos dos
 * números mostrará:
 * 
 * <pre>
 * • La suma de los dos números 
 * • La resta del primer número menos el segundo 
 * • La resta del segundo número menos el primero 
 * • La multiplicación de los dos números 
 * • La división del primer número por el segundo 
 * • La división del segundo número por el primero
 * </pre>
 * 
 * Debe mostrar estas operaciones con la forma “La suma de XXX y ZZZ es WWW”.
 * Usar el método printf de System.out para dar formato a la salida.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();

//		System.out.println(
//				"La suma de " + primerNumero + " y " + segundoNumero + " es " + (primerNumero + segundoNumero) + ".");

		System.out.printf("La suma de %d y %d es %d.\n", primerNumero, segundoNumero, primerNumero + segundoNumero);
		System.out.printf("La resta de %d y %d es %d.\n", primerNumero, segundoNumero, primerNumero - segundoNumero);
		System.out.printf("La resta de %d y %d es %d.\n", segundoNumero, primerNumero, segundoNumero - primerNumero);
		System.out.printf("El producto de %d y %d es %d.\n", primerNumero, segundoNumero, primerNumero * segundoNumero);
		System.out.printf("La división de %d y %d es %.2f.\n", primerNumero, segundoNumero,
				(double) primerNumero / segundoNumero);
		System.out.printf("La división de %d y %d es %.2f.\n", segundoNumero, primerNumero,
				(double) segundoNumero / (double) primerNumero);

		boolean logico = false;
		System.out.printf("Valor de boolean: %b\n", primerNumero);
		System.out.printf("Valor de boolean: %s, %s, %s, %s \n", logico, "Hola");
	}

}
