package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos10utilidad;

import java.util.Scanner;

/**
 * 
 * Ejemplo de clase de utilidad para métodos que facilitan pedir datos al
 * usuario.
 *
 */
public class EntradaUsuario {

	// Para que no se puedan crear objetos de la clase, ni tampoco heredarla, no
	// podemos usar abstract y final a la vez. Java no lo permite.
	// En su lugar, podemos ocultar el constructor por defecto haciéndolo privado.
	// Esto hace que no se pueda instanciar, pero tampoco heredar, porque desde las
	// sibclases no se podrá llamar al constructor de la superclase.
	private EntradaUsuario() {

	}

	public static int pedirEnteroUsuario(String mensaje, int minInclusivo, int maxInclusivo, Scanner scanner) {
		while (true) {
			System.out.println(mensaje);
			try {
				int valor = Integer.parseInt(scanner.nextLine());
				if (valor >= minInclusivo && valor <= maxInclusivo) {
					return valor;
				}
				System.out.printf("El valor debe estar entre %d y %d ambos incluidos.\n", minInclusivo, maxInclusivo);
			} catch (NumberFormatException e) {
				System.out.println("El valor no es un número entero.");
			}
		}
	}
}
