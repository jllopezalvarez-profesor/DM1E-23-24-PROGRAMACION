package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio06A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una letra mayúscula: ");
		String cadena = scanner.nextLine();

		// Comprobar la longitud de la cadena (tiene que ser 1)
		if (cadena.length() != 1) {
			System.out.println("Tienes que escribir sólo una letra mayúscula, ni más ni menos");
		} else {
			String cadenaEnMayusculas = cadena.toUpperCase();
			if (cadena.equals(cadenaEnMayusculas)) {
				System.out.println("Gracias por escribir la letra en mayúsculas");
			} else {
				System.out.println("Lo que has escrito no está en mayúsculas");
			}
		}

	}

}
