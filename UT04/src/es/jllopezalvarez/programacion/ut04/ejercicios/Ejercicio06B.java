package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio06B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una letra mayúscula: ");
		String cadena = scanner.nextLine();


//		String s = "DM1E";
//		char c1 = s.charAt(0);
//		char c2 = s.charAt(1);
//		char c3 = s.charAt(2);
//		char c4 = s.charAt(3);
		
		
		
		// Comprobar la longitud de la cadena (tiene que ser 1)
		if (cadena.length() != 1) {
			System.out.println("Tienes que escribir sólo una letra mayúscula, ni más ni menos.");
			System.out.printf("Lo que has escrito tiene %d caracteres.", cadena.length());
		} else {
			
			
			char primeraLetra = cadena.charAt(0);
			if (Character.isUpperCase(primeraLetra)){
				System.out.println("Gracias por escribir la letra en mayúsculas");
			} else {
				System.out.println("Lo que has escrito no está en mayúsculas");
			}
		}

	}

}
