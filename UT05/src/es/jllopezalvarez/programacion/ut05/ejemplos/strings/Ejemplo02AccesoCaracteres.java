package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo02AccesoCaracteres {

	public static void main(String[] args) {
		String cadena = "Esto es una cadena de caracteres, un String";

		// Obtener un caracter en cierta posición. Usar el método charAt:
		System.out.println(cadena.charAt(5)); // e de "es"
		
		// Longitud de una cadena:
		System.out.println(cadena.length());
		
		// Bucle similar a un array:
		for (int i = 0; i < cadena.length(); i++) {
			System.out.printf("Caracter en posición %2d: %s\n", i, cadena.charAt(i));
		}

	}

}
