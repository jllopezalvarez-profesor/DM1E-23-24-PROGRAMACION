package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;

/*
 * 	Escribe un programa que genere 100 números aleatorios menores que 100 (de 0 a 99), y los almacene en un array. Luego debe calcular la suma y la media de los números introducidos. 
	Usa al menos los siguientes métodos:
    • generarNumeros. Hay dos opciones:
        ◦ Recibe un array de cierto tamaño y lo llena de números aleatorios.
        ◦ Recibe el tamaño del array que queremos crear, y devuelve un array, de ese tamaño, lleno de números aleatorios.
    • calcularSuma. Recibe el array de números y devuelve la suma de los números.
    • calcularMedia. Recibe el array de números y devuelve la media de los números. Recomendación: para simplificar este método, puedes llamar al método calcularSuma.
 	En esta versión el método "generarNumeros" recibe el array y lo rellena.
 * */
 
public class Ejercicio04B {
	private static final int CANTIDAD_NUMEROS = 100000000;

	public static void main(String[] args) {
		int[] numeros = new int[CANTIDAD_NUMEROS];
		 
		generarNumeros(numeros, 0, 100);
		
		int suma = calcularSuma(numeros);
		
		double media = calcularMedia(numeros);
		
		System.out.printf("La suma es %d y la media es %.2f\n", suma, media);
		
	}

	private static double calcularMedia(int[] numeros) {
		return (double)calcularSuma(numeros)/numeros.length ;
	}

	private static int calcularSuma(int[] numeros) {
		int suma = 0;
		for (int num : numeros) {
			suma+=num;
		}
		return suma;
	}

	private static void generarNumeros(int[] numeros, int min, int max) {
		Random rnd = new Random();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(min, max);
		}
		
	}
}
