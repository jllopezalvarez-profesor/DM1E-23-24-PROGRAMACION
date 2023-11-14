package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

/**
 * 
 * Declara un array de números enteros. Créalo usando la palabra reservada new,
 * de forma que tenga un tamaño de 5 posiciones. Llena el array (las 5
 * posiciones) con números. Elige los números que quieras. Muestra el valor de
 * la tercera y cuarta posición del array. Recuerda que para acceder a la
 * primera posición del array se accede a la posición 0.
 * 
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		
		numeros[3] = 45;
		numeros[0] = 432;
		numeros[4] = 23;
		numeros[2] = 545;
		numeros[1] = 234;
		// numeros[5] = 3234; // Esto lanza una excepción
		
		System.out.printf("En las posiciones tercera (índice 2) y cuarta (índice 3) del array están los números %d y %d.\n", numeros[2], numeros[3]);

	}

}
