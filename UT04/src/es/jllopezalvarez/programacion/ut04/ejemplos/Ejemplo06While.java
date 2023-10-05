package es.iesclaradelrey.dm1e2223.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo06While {

	public static void main(String[] args) {
		// Demo de while para preguntar al usuario un número hasta que sea cero
		// O lo que es lo mismo, mientras sea distinto de cero
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número. Cero para terminar.");
		numero = Integer.parseInt(sc.nextLine());
		while(numero != 0) {
			System.out.printf("El número introducido es %d\n", numero);
			System.out.print("Introduce un número. Cero para terminar.");
			numero = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Fin del programa...");
		
		
		sc.close();
	}

}
