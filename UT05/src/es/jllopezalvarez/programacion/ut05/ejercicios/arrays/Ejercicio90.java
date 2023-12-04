package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Arrays;

public class Ejercicio90 {

	/**
	 * Método que recibe un array de números, y que devuelve un nuevo array, del
	 * tamaño adecuado, con los mismos números, en el mismo orden, pero entre cada
	 * dos números habrá un cero.
	 * 
	 * Si recibe {3,4,7,8} devuelve {3,0,4,0,7,0,8}
	 * 
	 */

	public static void main(String[] args) {
		int[] numeros = { 3, 4, 7, 8 };

		System.out.println(Arrays.toString(numeros));

		System.out.println(Arrays.toString(insertaCeros(numeros)));

		String palabra = "programación";
		System.out.println(palabra);
		System.out.println(insertaCeros(palabra));

	}

	private static int[] insertaCeros(int[] numeros) {
		int[] nuevoArray = new int[numeros.length * 2 - 1];

		for (int i = 0; i < nuevoArray.length; i += 2) {
			nuevoArray[i] = numeros[i / 2];
		}

		return nuevoArray;
	}

	private static String insertaCeros(String palabra) {
		String salida = "";

		for (int i = 0; i < palabra.length(); i++) {
			if (i > 0) {
				salida = salida + "-";
			}
			salida = salida + palabra.charAt(i);
		}

		return salida;
	}

	private static String insertaCeros2(String palabra) {
		StringBuilder salida = new StringBuilder(palabra.length() * 2);

		for (int i = 0; i < palabra.length(); i++) {
			if (i > 0) {
				salida.append("-");
			}
			salida.append(palabra.charAt(i));
		}

		return salida.toString();
	}

}
