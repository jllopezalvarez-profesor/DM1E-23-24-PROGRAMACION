package es.jllopezalvarez.programacion.ut05.ejemplos;

import java.util.Random;

public class Borrar {

	public static void main(String[] args) {

		int numero;

		int[] numeros = new int[20];

		// System.out.println(numeros);

		int numero1 = 10;
		int numero2 = 11;
		int numero3 = 12;
		int numero4 = 13;

		numeros[0] = 10;
		numeros[1] = 11;
		numeros[2] = 12;
		numeros[3] = 13;

		System.out.println("\nRecorrido manual de inicio a fin:");

		System.out.printf("%d ", numeros[0]);
		System.out.printf("%d ", numeros[1]);
		System.out.printf("%d ", numeros[2]);
		System.out.printf("%d ", numeros[3]);

		System.out.println("\nRecorrido manual de fin a inicio:");

		System.out.printf("%d ", numeros[3]);
		System.out.printf("%d ", numeros[2]);
		System.out.printf("%d ", numeros[1]);
		System.out.printf("%d ", numeros[0]);

		System.out.println("\nRecorrido con for de incio a fin:");

		for (int posicion = 0; posicion < numeros.length; posicion++) {
			System.out.printf("%d ", numeros[posicion]);
		}

		System.out.println("\nRecorrido con for de incio a fin con variable auxiliar:");

		for (int i = 0; i < numeros.length; i++) {
			int j = numeros[i];
			System.out.printf("%d ", j);
		}

		System.out.println("\nRecorrido con for de fin a inicio:");

		for (int posicion = numeros.length - 1; posicion >= 0; posicion--) {
			System.out.printf("%d ", numeros[posicion]);
		}

		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(1, 10);
		}
		System.out.println("\nRecorrido con for de fin a inicio tras llenar con aleatorios:");

		for (int posicion = numeros.length - 1; posicion >= 0; posicion--) {
			System.out.printf("%d ", numeros[posicion]);
		}
		System.out.println("\nRecorrido con for de inicio a fin tras llenar con aleatorios:");

		for (int posicion = 0; posicion < numeros.length; posicion++) {
			System.out.printf("%d ", numeros[posicion]);
		}

		System.out.println("\nRecorrido con for-each. Este siempre es de inicio a fin:");

		// for(<tipo de dato> <nombre de variable>: nombre de array)
		for (int x : numeros) {
			System.out.printf("%d ", x);
		}
		// Poner todos a 0
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 0;
		}

		System.out.println("\nRecorrido con for-each tras poner a cero:");
		for (int x : numeros) {
			System.out.printf("%d ", x);
		}

		// Poner todos a 9
		for (int num : numeros) {
			num = 9;
		}

		System.out.println("\nRecorrido con for-each tras poner a nueve:");
		for (int x : numeros) {
			System.out.printf("%d ", x);
		}
		
		String cadenaVocales = "aeiou";

		char[] arrayVocales = { 'a', 'e', 'i', 'o', 'u' };
		char[] arrayVocales2 = "aeiou".toCharArray();
		

		int[] arrayNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		for (int i : arrayNumeros) {
			System.out.println(i);
		}
	}

}
