package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos03arrays2d;

import java.awt.geom.Area;
import java.util.Iterator;

public class Ejemplos {
	public static void main(String[] args) {

		// Declarar un array de una dimensión
		int[] array1Dimesion = new int[10];

		// La declaración de dos dimensiones es similar, pero con dos pares de corchetes
		// Se define un array de arrays
		// Los dos corchetes iniciales definen el array "exterior", que está formado por
		// arrays definidos con los dos corchetes finales
		int[][] arrayDosDimensiones;

		// Para crearlo, se usa new con las dos dimensiones (array exterior y array
		// interior)
		arrayDosDimensiones = new int[10][20];

		System.out.println();
		System.out.println("Iterando un array de 1 dimensión");

		
		// El recorrido de un array de 1 dimensión ya lo teníamos claro:
		for (int i = 0; i < array1Dimesion.length; i++) {
			array1Dimesion[i] = 1;
		}

		System.out.println();
		System.out.println("Iterando con un número conocido como límite");

		// El recorrido del array de dos dimensiones es un doble recorrido
		// Se recorre el array exterior en el primer bucle
		for (int i = 0; i < arrayDosDimensiones.length; i++) {
			// Cada elemento del array exterior es a su vez un array
			int[] arrayInterior = arrayDosDimensiones[i];
			// Que podemos recorrer
			for (int j = 0; j < arrayInterior.length; j++) {
				arrayInterior[j] = i * j;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Iterando con .length como límite");

		// En lugar de usar números "mágicos" para la longitud, podemos usar la
		// propiedad length de los arrays
		for (int i = 0; i < arrayDosDimensiones.length; i++) {
			// System.out.println(arrayDosDimensiones[i]);
			int[] arrayInterior = arrayDosDimensiones[i];
			for (int j = 0; j < arrayInterior.length; j++) {
				System.out.printf("%d ", arrayInterior[j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Iterando con foreach");

		// O se puede usar un bucle foreach
		for (int[] arrayInterior : arrayDosDimensiones) {
			for (int numero : arrayInterior) {
				System.out.printf("%d ", numero);
			}
			System.out.println();

		}

		System.out.println();
		System.out.println("Iternado y accediendo por 'coordenadas'");

		// O se puede acceder por "coordenadas"
		for (int i = 0; i < arrayDosDimensiones.length; i++) {
			for (int j = 0; j < arrayDosDimensiones[i].length; j++) {
				System.out.printf("%d ", arrayDosDimensiones[i][j]);
			}
			System.out.println();
		}

		int[][] arrayNoSimetrico = new int[5][];

		for (int i = 0; i < arrayNoSimetrico.length; i++) {
			arrayNoSimetrico[i] = new int[(int) (Math.random() * 10) + 5];
		}
		System.out.println();

		for (int[] arrayInterior : arrayNoSimetrico) {
			for (int numero : arrayInterior) {
				System.out.printf("%d ", numero);
			}
			System.out.printf("(%d)", arrayInterior.length);
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		String frase = "Esta frase la quiero partir en un array de arrays de caracteres";
		System.out.println(frase);
		String[] palabras = frase.split(" ");
		char[][] caracteres = new char[palabras.length][];

		for (int i = 0; i < palabras.length; i++) {
			caracteres[i] = palabras[i].toCharArray();
		}

		for (char[] arrayInterior : caracteres) {
			for (char caracter : arrayInterior) {
				System.out.printf("%s ", caracter);
			}
			System.out.println();
		}

	}
}
