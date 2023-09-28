package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 * Ejemplos de declaración de constantes.
 */
public class Ejemplo04Final {

	public static void main(String[] args) {

		// Las constantes se declaran como final
		// Las convenciones son importantes. Mayúsculas separadas por guiones
		final int CANTIDAD_NUMEROS = 15;

		// Una constante no puede modificarse. La siguiente línea produce error si se
		// descomenta.
		// CANTIDAD_NUMEROS = 30;

		// La constante se puede usar luego como si fuera una variable, solo que no se
		// puede modificar.
		System.out.println("Vamos a pedir al usuario " + CANTIDAD_NUMEROS + " números.");
	}

}
