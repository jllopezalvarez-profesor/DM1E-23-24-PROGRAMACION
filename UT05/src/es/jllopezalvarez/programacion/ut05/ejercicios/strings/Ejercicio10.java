package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

public class Ejercicio10 {

	public static void main(String[] args) {

		String salida = invertirPorPalabras("hoy es martes");
		String salida2 = invertirPorPalabras("hoy es martes,y mañana es miércoles");

	}

	public static String invertirPorPalabras(String original) {
		if (original == null) {
			return null;
		}

		String[] palabras = original.split("[ ,]");

		StringBuilder sb = new StringBuilder();

		for (int i = palabras.length - 1; i >= 0; i--) {
			String palabra = palabras[i];
			sb.append(palabra);
			if (i > 0) {
				sb.append(" ");
			}
			System.out.printf("Contenido del StringBuilder: '%s'\n", sb);
		}
		return sb.toString();

	}

}
