package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 * Ejemplo de declaraciones de variables de tipo char (1 carácter) vs String
 * (varios caracteres)
 */
public class Ejemplo02CharVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char variableCaracter;

		String variableCadena;

		// BIEN
		variableCaracter = 'c';
		variableCadena = "Hola";

		// MAL. Con caracteres no se puede usar la comilla doble, y con strings no se
		// puede usar la simple. Descomentar las siguientes dos líneas para ver los
		// errores de compilación que se producen.
		// variableCaracter = "Hola";
		// variableCadena = 'c';

		// Mostramos los valores de las variables:
		System.out.println("La variable char tiene el valor: " + variableCaracter);
		System.out.println("La variable String tiene el valor: " + variableCadena);

	}

}
