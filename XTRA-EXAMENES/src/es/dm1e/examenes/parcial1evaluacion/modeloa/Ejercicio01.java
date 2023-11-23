package es.dm1e.examenes.parcial1evaluacion.modeloa;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿Cuántos términos de la sucesión quieres generar? ");
		int cantidadTerminos = scanner.nextInt();
		generarSucesion(cantidadTerminos);
	}

	private static void generarSucesion(int cantidadTerminos) {
		int termino = 1;
		for (int i = 0; i < cantidadTerminos; i++) {
			System.out.printf("%d ", termino);
			if (i % 2 == 0) {
				termino *= 2;
			} else {
				termino += 3;
			}
		}
	}
}
