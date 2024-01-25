package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos22utilidad;

import java.util.Scanner;

public class InputUtilities {

	private InputUtilities() {

	}

	public static int pedirEntero(Scanner scanner, String mensaje) {
		System.out.println(mensaje);
		return scanner.nextInt();
	}
}
