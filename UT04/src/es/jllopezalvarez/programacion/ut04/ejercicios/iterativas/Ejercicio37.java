package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la frase completa:");
		String frase = scanner.nextLine();
		System.out.println("Introduce la palabra que quieres buscar:");
		String palabra = scanner.nextLine();

		String fraseMinusculas = frase.toLowerCase();
		String palabraMinusculas = palabra.toLowerCase();

		int posicion = fraseMinusculas.indexOf(palabraMinusculas);

		while (posicion > 0) {
			String cadenaEncontrada = frase.substring(posicion, posicion+palabra.length() );
			System.out.printf("Se ha encontrado en la posición %d, la cadena encontrada es '%s'.\n", posicion, cadenaEncontrada  );
			posicion = fraseMinusculas.indexOf(palabraMinusculas, posicion + 1);

		}

	}

}
