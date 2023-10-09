package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	private static final String USUARIO_ESPERADO = "pepe";
	private static final String PASSWORD_ESPERADO = "asdasd";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el nombre de usuario: ");
		String usuario = scanner.nextLine();
		System.out.print("Introduce la contraseña: ");
		String password = scanner.nextLine();

		if (usuario.equalsIgnoreCase(USUARIO_ESPERADO) && password.equals(PASSWORD_ESPERADO)) {
			System.out.println("Has entrado al sistema");
		} else {
			System.out.println("Credenciales incorrectas");
		}

	}

}
