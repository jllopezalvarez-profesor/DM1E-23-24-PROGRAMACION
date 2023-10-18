package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Iterator;
import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * 
 * ################################################################################
 * Diseño
 * ################################################################################

 *  
 * ################################################################################
 */
public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el valor inicial: ");
		int numInicial = scanner.nextInt();
		System.out.print("Introduce el valor final: ");
		int numFinal = scanner.nextInt();

		if (numInicial > numFinal) {
			System.out.printf("%d no es menor o igual que %d", numInicial, numFinal);
		} else {
			int num = numInicial;
			while (num <= numFinal) {
				System.out.printf("%d ", num);
				num++;
			}

		}

	}

}
