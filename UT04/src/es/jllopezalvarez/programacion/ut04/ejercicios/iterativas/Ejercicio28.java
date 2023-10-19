package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántos números quieres procesar? ");
		int cantidadNumeros = scanner.nextInt();

		int cuantosMayoresQueCero = 0;
		int cuantosMenoresQueCero = 0;
		int cuantosIgualesQueCero = 0;

		for (int i = 0; i < cantidadNumeros; i++) {
			// para 3 números i vale 0, 1, 2

			// Preguntar un número al usuario
			System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();

			// Comparar este número con 0 para:
			// saber si es menor
			// o si es mayor
			// o si es cero
			if (numero < 0) {
				cuantosMenoresQueCero++; // cuantosMenoresQueCero = cuantosMenoresQueCero + 1;
			} else if (numero > 0) {
				cuantosMayoresQueCero++;
			} else {
				// Es cero
				cuantosIgualesQueCero++;
			}
		}

		if (cantidadNumeros > 0) {
			System.out.printf(
					"En los números introducidos había %d menores que cero, %d mayores, y %d iguales a cero\n",
					cuantosMenoresQueCero, cuantosMayoresQueCero, cuantosIgualesQueCero);
		}
		System.out.println("Fin de programa.");

	}
}
