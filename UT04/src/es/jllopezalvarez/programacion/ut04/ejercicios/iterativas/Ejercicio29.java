package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio29 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que pida números enteros positivos hasta que se introduzca
		 * un cero. Debe calcular la suma y la media de todos los números introducidos.
		 * Si el usuario introduce un número menor que cero, debe mostrar un mensaje
		 * indicando que no es válido y no tenerlo en cuenta para el cálculo.
		 */

		Scanner scanner = new Scanner(System.in);

		int suma = 0;
		int cuenta = 0;

		System.out.print("Introduce un número entero, 0 para terminar: ");
		int numero = scanner.nextInt();
		while (numero != 0) {
			if (numero < 0) {
				System.out.println("El número introducido es negativo. Lo ignoramos.");
			} else {
				suma += numero; // suma = suma + numero;
				cuenta++;
			}
			System.out.print("Introduce un número entero, 0 para terminar: ");
			numero = scanner.nextInt();
		}

		double media = (double) suma / cuenta;

		System.out.printf("La suma de los %d números positivos es %d y su media es %.2f\n", cuenta, suma, media);
	}
}
