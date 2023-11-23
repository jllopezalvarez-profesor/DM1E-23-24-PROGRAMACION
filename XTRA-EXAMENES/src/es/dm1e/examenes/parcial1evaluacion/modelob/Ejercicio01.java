package es.dm1e.examenes.parcial1evaluacion.modelob;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeroMenor;
		int numeroMayor;

		do {
			System.out.print("Introduce el número menor ");
			numeroMenor = scanner.nextInt();
			System.out.print("Introduce el número mayor ");
			numeroMayor = scanner.nextInt();

			if (numeroMenor >= numeroMayor) {
				System.out.println("Números incorrectos. El menor tiene que ser realmente menor que el mayor.");
			}

		} while (numeroMenor >= numeroMayor);

		int suma = 0;
		int cuenta = 0;
		for (int numero = numeroMenor + 1; numero <= numeroMayor; numero++) {
			if (numero % 2 == 1) {
				suma += numero;
				cuenta++;
			}
		}

		System.out.printf("La suma de los números impares entre %d (no incluido) y %d (incluido) es %d\n", numeroMenor,
				numeroMayor, suma);
		System.out.printf("La media de estos números es %.2f\n", (double) suma / cuenta);
	}
}
