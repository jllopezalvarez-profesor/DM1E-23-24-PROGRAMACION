package es.jllopezalvarez.programacion.ut03.ejemplos;

import java.util.Scanner;

public class PrintStreamScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("¿Como te llamas? ");
//		
//		String nombre = scanner.nextLine();
//		
//		System.out.println("Te llamas " + nombre);
//		
//		System.out.print("Cuántos años tienes? ");
//		
//		int edad = scanner.nextInt();
//		
//		System.out.printf("Tienes %d años\n", edad);
//		
		System.out.println("¿Cuánto mides (en metros)");
		double estatura = scanner.nextDouble();
		
		System.out.printf("Mides %08.1f metros\n\n\\n\\t", estatura);
	}

}
