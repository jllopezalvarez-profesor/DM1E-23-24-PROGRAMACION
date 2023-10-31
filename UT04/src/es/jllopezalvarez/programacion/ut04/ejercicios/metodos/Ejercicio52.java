package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
	

		boolean a = pedirConfirmacion(scanner, "¿Seguro que quieres hacer el examen el jueves?");
		System.out.println("El usuario ha respondido: " + a);
		boolean b = pedirConfirmacion(scanner, "Pero... ¿Seguro?");
		System.out.println("El usuario ha respondido: " + b);
		boolean c = pedirConfirmacion(scanner, "¿Vas a aprobar?");
		System.out.println("El usuario ha respondido: " + c);


	}

	public static boolean pedirConfirmacion(Scanner sc, String pregunta) {

		String respuestaUsuario;
		do {
			System.out.println(pregunta);
			respuestaUsuario = sc.next();
			// !(A || B) --- !A && !B
			if (!respuestaUsuario.equalsIgnoreCase("S") && !respuestaUsuario.equalsIgnoreCase("N")) {
				System.out.println("El valor introducido sólo puede ser 'S', 's', 'N' o 'n'");
			}
		} while (!respuestaUsuario.equalsIgnoreCase("S") && !respuestaUsuario.equalsIgnoreCase("N"));
		return respuestaUsuario.equalsIgnoreCase("S");

	}
}
