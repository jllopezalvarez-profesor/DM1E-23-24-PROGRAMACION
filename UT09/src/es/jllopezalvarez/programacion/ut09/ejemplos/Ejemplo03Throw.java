package es.jllopezalvarez.programacion.ut09.ejemplos;

import java.util.Scanner;

public class Ejemplo03Throw {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.print("Introduce el divisor: ");
		int divisor = scanner.nextInt();
		
		System.out.printf("El resultado de dividir %d entre %d es %d\n", dividendo, divisor, dividirB(dividendo, divisor));
		
		
		System.out.println("Fin del programa");
	}
	
	
	private static int dividirA(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Error, el divisor no puede ser cero.");
			
		}
		return a/b;
	}
	
	private static int dividirB(int a, int b) {
		
			try {
				return a/b;
			} catch (Exception e) {
				System.out.println("Error al dividir");
				throw new RuntimeException("Error al dividir", e);
			}
	}
	
}
