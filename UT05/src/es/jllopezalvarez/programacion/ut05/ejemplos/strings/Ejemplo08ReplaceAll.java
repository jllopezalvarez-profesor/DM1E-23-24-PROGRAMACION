package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo08ReplaceAll {
	public static void main(String[] args) {
		String original = "Esto es una cádena con vocales";

		String modificada = original.replaceAll("(?i)[aeiou]", " ");

		System.out.println(original);
		System.out.println(modificada);

		String c1 = "Hoy nos hemos quedado pocos en clase. ";
		char[] caracteres = c1.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {

			if (caracteres[i] == ' ')
				caracteres[i] = '_';
		}
		
		
		String c2 = String.valueOf(caracteres).toUpperCase();
		
		System.out.println(c2);
	}
}
