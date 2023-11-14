package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos02arrays;

/**
 * 
 * Ejemplo de cómo guardar y obtener valores en un array
 */
public class Ejemplo03GuardarObtenerValores {

	public static void main(String[] args) {

		// Declaramos y creamos un array de números enteros y otro de Strings, ambos de
		// tamaño 3 (admiten tres valores)
		int[] numeros = new int[3];
		String[] cadenas = new String[3];

		// Inicialmente, en el array sólo hay:
		// - Ceros en el array de números
		// - null en cada posición del array de Strings

		// Ponemos un 5 en la primera posición del array de números
		// Ojo, la primera posición del array es la 0, no la 1
		numeros[0] = 5;
		// Ponemos un 7 en la segunda posición (la 1) y un 30 en la tercera (la 2)
		numeros[1] = 7;
		numeros[2] = 30;

		// Llenamos ahora el array de Strings
		cadenas[0] = "Primera cadena";
		cadenas[1] = "Segunda cadena";
		cadenas[2] = "Tercera cadena";
		
		// Accedemos a cada posición para mostrar su valor
		// Con el array de enteros:
		System.out.printf("Número en la primera posición: %d\n", numeros[0]);
		System.out.printf("Número en la segunda posición: %d\n", numeros[1]);
		System.out.printf("Número en la tercera posición: %d\n", numeros[2]);
		// Con el array de cadenas
		System.out.printf("Cadena en la primera posición: %s\n", cadenas[0]);
		System.out.printf("Cadena en la segunda posición: %s\n", cadenas[0]);
		System.out.printf("Cadena en la tercera posición: %s\n", cadenas[0]);
		
	}
}
