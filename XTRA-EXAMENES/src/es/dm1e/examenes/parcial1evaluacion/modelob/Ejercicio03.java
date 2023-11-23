package es.dm1e.examenes.parcial1evaluacion.modelob;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("¿En qué número empieza la sucesión? ");
		int primerTermino = scanner.nextInt();
		generarSucesion(primerTermino);
	}

	private static void generarSucesion(int primerTermino) {
		int i = 0;
		int termino = primerTermino;
		while (termino  != 0) {
			System.out.printf("%d ", termino );
			if (i % 2 == 0) {
				termino  /= 2;
			} else {
				termino  = -termino ;
			}
			i++;
		}
	}
}
