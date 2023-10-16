package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribe un programa que pida un nombre de usuario y una contraseña y si se ha 
 * introducido “pepe” y “asdasd” se indica “Has entrado al sistema”, si no, se 
 * mostrará un error.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Pedimos por teclado nombre y contraseña. Si coinciden con las correctas indicamos 
 * que se ha entrado en el sistema. En caso contrario indicamos que el nombre o la 
 * clave son incorrectas 
 * Datos de entrada: usuario (cadena), password (cadena)
 * Información de salida: Mensajes de acierto o error.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer el usuario
 * 2. Leer el password
 * 3. Si el usuario es igual a "pepe" y el password es igual a "asdasd" escribir 
 * "Has entrado en el sistema"
 * 4. En caso contrario mostrar el mensaje "Credenciales incorrectas"
 * 
 * ################################################################################
 */
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
