package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

/*
 * Realizar un programa que:
    • Pregunte al usuario cuántos números vamos a procesar.
    • Pida al usuario la cantidad de números que ha introducido en el paso anterior, 
     y para cada número indique si el número es menor que cero, cero o mayor que cero.*
 */
public class Ejercicio27B {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántos números quieres procesar? ");
		int cantidadNumeros = scanner.nextInt();

		while (cantidadNumeros > 0) {
			// Para tres números cantidadNumeros valdrá 3, 2, y 1

			// Preguntar un número al usuario
			System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();

			// Comparar este número con 0 para:
			// saber si es menor
			// o si es mayor
			// o si es cero
			if (numero < 0) {
				System.out.printf("%d es menor que cero\n", numero);
			} else if (numero > 0) {
				System.out.printf("%d es mayor que cero\n", numero);
			} else {
				// Es cero
				System.out.printf("%d es igual a cero\n", numero);
			}

			cantidadNumeros--;
		}

		System.out.println("Fin de programa.");

	}
}
