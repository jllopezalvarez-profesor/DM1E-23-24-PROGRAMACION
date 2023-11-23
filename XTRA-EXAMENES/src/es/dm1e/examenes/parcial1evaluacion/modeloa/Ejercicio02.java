package es.dm1e.examenes.parcial1evaluacion.modeloa;

import java.util.Scanner;

public class Ejercicio02 {
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

		int sumaPares = 0;
		int cuentaPares = 0;
		int sumaMultiplos3 = 0;
		int cuentaMultiplos3 = 0;
		for (int numero = numeroMenor + 1; numero <= numeroMayor; numero++) {
			if (numero % 2 == 0) {
				sumaPares += numero;
				cuentaPares++;
			}
			if (numero % 3 == 0) {
				sumaMultiplos3 += numero;
				cuentaMultiplos3++;
			}			
		}
		
		System.out.printf("La suma de los números pares entre %d (no incluido) y %d (incluido) es %d\n", numeroMenor,
				numeroMayor, sumaPares);
		System.out.printf("La media de estos números es %.2f\n", (double) sumaPares / cuentaPares);
		
		System.out.printf("La suma de los números múltiplos de tres entre %d (no incluido) y %d (incluido) es %d\n", numeroMenor,
				numeroMayor, sumaMultiplos3);
		System.out.printf("La media de estos números es %.2f\n", (double) sumaMultiplos3 / cuentaMultiplos3);
	}
}
