package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 * Ejemplo de caracteres de escape en Strings
 */
public class Ejemplo05Escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Si descomentamos la siguiente línea veremos que no compila, porque hemos
		// usado el caracter " dentro de un literal String:
		// String cadena = "Voy a poner algo entre comillas: "Hola"";

		// Solución 1: comillas simples. Como las comillas simples no son las que se
		// usan para delimitar literales String, no hay problema.
		String cadena2 = "Voy a poner algo entre comillas: 'Hola'";

		// Solución 2: escapado. Si no podemos usar comillas simples dentro del literal
		// String (por requisitos del problema, por ejemplo), podemos usar el caracter
		// de escape pra la comilla doble (\"). En el ejemplo también se usa el caracter
		// de escape para el tabulado (\t) y para el salto de línea (\n)
		String cadena3 = "Voy a poner algo \n\tentre comillas: \"Hola\"";

		System.out.println(cadena2);
		System.out.println(cadena3);

	}

}
