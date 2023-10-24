package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//int opcion;
		String opcion;
		do {
			// Mostrar Menú
			System.out.println("""
					1. Opción A
					2. Opción B
					3. Opción C
					4. Opción D
					9. Salir""");

			//opcion = scanner.nextInt();
			opcion = scanner.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("La opción elegida ha sido la A");
				break;

			default:
				break;
			}

		} while (!opcion.equals("9"));

		
		
		
		
		
	}
}
