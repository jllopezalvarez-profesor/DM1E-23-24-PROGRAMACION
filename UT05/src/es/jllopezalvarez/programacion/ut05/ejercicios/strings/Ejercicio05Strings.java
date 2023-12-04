package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

import java.util.Arrays;

public class Ejercicio05Strings {
	public static void main(String[] args) {

		String cadenaReferenciaNull = null;

		System.out.printf("¿'%s' es palíndromo?: %s\n", "Hola", esPalindromo("Hola"));
		System.out.printf("¿'%s' es palíndromo?: %s\n", "arenera", esPalindromo("arenera"));
		System.out.printf("¿'%s' es palíndromo?: %s\n", "yo hago yoga hoy", esPalindromo("yo hago yoga hoy"));
		System.out.printf("¿'%s' es palíndromo?: %s\n", cadenaReferenciaNull, esPalindromo(cadenaReferenciaNull));

		System.out.printf("¿'%s' es palíndromo 2?: %s\n", "Hola", esPalindromo2("Hola"));
		System.out.printf("¿'%s' es palíndromo 2?: %s\n", "arenera", esPalindromo2("arenera"));
		System.out.printf("¿'%s' es palíndromo 2?: %s\n", "yo hago yoga hoy", esPalindromo2("yo hago yoga hoy"));
		System.out.printf("¿'%s' es palíndromo 2?: %s\n", cadenaReferenciaNull, esPalindromo2(cadenaReferenciaNull));

		System.out.println(invertirPorPalabras("nosotros somos seres luminosos"));

	}

	private static String invertirPorPalabras(String cadena) {
		String[] partes = cadena.split("\\s+");

		StringBuilder sb = new StringBuilder();
		for (int i = partes.length - 1; i >= 0; i--) {
			sb.append(partes[i]);
			if (i > 0) {
				sb.append(" ");
			}

		}
		return sb.toString();

	}

	private static boolean esPalindromo2(String cadena) {
		if (cadena == null) {
			return false;
		}

		return new StringBuilder(quitarEspacios(cadena)).reverse().toString().equals(quitarEspacios(cadena));

	}

	private static boolean esPalindromo(String cadena) {

		if (cadena == null) {
			return false;
		}

		String cadenaSinEspacios = quitarEspacios(cadena);

		for (int izq = 0, dch = cadenaSinEspacios.length() - 1; izq < dch; izq++, dch--) {
			// Extraer los caracteres a la izq y a la dch
			char charIzq = cadenaSinEspacios.charAt(izq);
			char charDch = cadenaSinEspacios.charAt(dch);

			// Comparar si son diferentes
			if (charIzq != charDch) {
				return false;
			}
		}
		return true;

//		int izq=0;
//		int dch = cadena.length()-1;
//		while(izq<dch) {
//			izq++;
//			dch--;
//		}

	}

	private static String quitarEspacios(String cadena) {
		return cadena.replace(" ", "");

	}

}
