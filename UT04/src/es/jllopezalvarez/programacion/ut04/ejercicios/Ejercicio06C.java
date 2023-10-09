package es.jllopezalvarez.programacion.ut04.ejercicios;

import java.util.Scanner;

/**
 * En este caso tenemos que pedir una cadena de longitud 5 y ver si la letra del
 * centro (posición 2) es mayúscula
 */
public class Ejercicio06C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una palabra de 5 letras con la letra central en mayúsculas: ");
		String cadena = scanner.nextLine();

		// Comprobar la longitud de la cadena (tiene que ser 1)
		if (cadena.length() != 5) {
			System.out.println("Tienes que escribir una cadena de 5 caracteres, ni más ni menos.");
			System.out.printf("Lo que has escrito tiene %d caracteres.", cadena.length());
		} else {
			// 0 1 2 3 4
			// A B C D E
			char letraCentral = cadena.charAt(2);
			if (Character.isUpperCase(letraCentral)) {
				System.out.println("Gracias por escribir la palabra correcta");
			} else {
				System.out.println("Lo que has escrito no es correcto");
			}
		}

	}

}
