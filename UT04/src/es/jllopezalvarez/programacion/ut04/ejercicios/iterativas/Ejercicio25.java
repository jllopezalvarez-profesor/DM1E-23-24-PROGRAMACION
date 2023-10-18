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
public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el número del que quieres calcular la tabla: ");
		int numTabla = scanner.nextInt();
		
		for(int n=1; n<=10;n++) {
			System.out.printf("%dx%d=%d\n",numTabla, n, n*numTabla );
		}
	}

}
