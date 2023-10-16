package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/**
 * Variante del problema 6 que pide una cadena de cinco caracteres.
 */
public class Ejercicio06C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una palabra de 5 letras con la letra central en mayúsculas: ");
		String cadena = scanner.nextLine();

		// Comprobar la longitud de la cadena (tiene que ser 5)
		if (cadena.length() != 5) {
			System.out.println("Tienes que escribir una cadena de 5 caracteres, ni más ni menos.");
			System.out.printf("Lo que has escrito tiene %d caracteres.", cadena.length());
		} else {
			// En las cadenas (string) la primera posición es la cero
			// 0 1 2 3 4  < Posición
			// A B C D E  < Caracteres en la cadena
			// Por eso, la central de una cadena de cinco posiciones es la 2
			char letraCentral = cadena.charAt(2); 
			if (Character.isUpperCase(letraCentral)) {
				System.out.println("Gracias por escribir la palabra correcta");
			} else {
				System.out.println("Lo que has escrito no es correcto");
			}
		}

	}

}
