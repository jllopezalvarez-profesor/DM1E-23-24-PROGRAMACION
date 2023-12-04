package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

import java.util.Scanner;

/**
 * 
 * <pre>
 * Realiza un método esPalindromo que
    • Recibe una cadena de caracteres
    • Devuelve true si la cadena es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda.
    • Devuelve false si la cadena es null o si no es un palíndromo.
    • Para hacerlo usa exclusivamente métodos de String, sin arrays.
   Ejemplo:
    • esPalindromo(“cactus”) devuelve false
    • esPalindromo(null) devuelve false
    • esPalindromo(“arenera”) devuelve true
    • esPalindromo(“yo hago yoga hoy”) devuelve true
 * </pre>
 *
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Escribe la palabra o frase a comprobar");
//		String palabra = sc.nextLine();
//
//		if (esPalindromo(palabra)) {
//			System.out.println("Es un palíndromo");
//		} else {
//			System.out.println("No es un palíndromo");
//		}

		sc.close();
		System.out.println(esPalindromo(null));
		System.out.println(esPalindromo("arenera"));
		System.out.println(esPalindromo("yo hago yoga hoy"));
		System.out.println(esPalindromo("cactus"));
		System.out.println("-".repeat(50));
		System.out.println(esPalindromo2(null));
		System.out.println(esPalindromo2("arenera"));
		System.out.println(esPalindromo2("yo hago yoga hoy"));
		System.out.println(esPalindromo2("cactus"));
		System.out.println("-".repeat(50));
		System.out.println(esPalindromo3(null));
		System.out.println(esPalindromo3("arenera"));
		System.out.println(esPalindromo3("yo hago yoga hoy"));
		System.out.println(esPalindromo3("cactus"));
	}

	public static boolean esPalindromo(String cadena) {
		if (cadena == null) {
			return false;
		}

		cadena = cadena.replaceAll(" ", "");

		int izquierda = 0;
		int derecha = cadena.length() - 1;

		// Comparo dos a dos
		while (izquierda < derecha) {
			if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
				return false;
			}
			izquierda++;
			derecha--;
		}
		// He comparado todos, así que sí es un palíndromo.
		return true;
	}

	public static boolean esPalindromo2(String cadena) {
		if (cadena == null) {
			return false;
		}

		cadena = cadena.replaceAll(" ", "");

		for (int izquierda = 0; izquierda < cadena.length() / 2; izquierda++) {
			int derecha = (cadena.length() - 1) - izquierda;
			if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
				return false;
			}
		}
		// He comparado todos, así que sí es un palíndromo.
		return true;
	}

	public static boolean esPalindromo3(String cadena) {
		if (cadena == null) {
			return false;
		}

		cadena = cadena.replaceAll(" ", "");

		StringBuilder sb = new StringBuilder(cadena);
		sb.reverse();
		
		return cadena.equals(sb.toString());
		
		//return cadena.equals(new StringBuilder(cadena).reverse().toString());
	}
}
