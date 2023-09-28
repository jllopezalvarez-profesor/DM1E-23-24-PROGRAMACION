package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

import java.util.Scanner;

public class Ejemplo02Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el nombre de tu comida favorita...");
		String comida = sc.nextLine();
		
		System.out.print("Introduce un número entero... ");
		int numero = sc.nextInt();
		
		System.out.print("Introduce un número con decimales... ");
		double numeroConDecimales = sc.nextDouble();

		System.out.printf("Tu comida favorita es %s y los números son %d y %08.2f\n", comida, numero, numeroConDecimales);
		
	}
}
