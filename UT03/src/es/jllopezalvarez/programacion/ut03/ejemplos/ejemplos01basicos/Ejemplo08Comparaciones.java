package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 * Ejemplos de comparaciones de variables y/o literales.
 */
public class Ejemplo08Comparaciones {

	public static void main(String[] args) {
		// Vamos a tener que comparar variables muy a menudo. Un gran porcentaje de la
		// programación consiste en elegir la forma correcta de compara variables,
		// constantes y literales entre sí.

		// Los operadores de comparación son:
		// Igual que (==)
		// Distinto que (!=). Podemos leero como no igual
		// Mayor que (>) y mayor o igual que (>=)
		// Menor que (<) y menor o igual que (<=)
		// El resultado de estos operadores es siempre un valor boolean (true/false)

		// Variable para guardar los resultados de los ejemplos
		boolean resultado;
		
		// Ejemplos de comparación de un número entero con un literal
		int numero = 100; 
		resultado = numero > 100; // Debe ser false
		System.out.println("¿El número es mayor que 100?: " + resultado);
		resultado = numero >= 100; // Debe ser true
		System.out.println("¿El número es mayor o igual que 100?: " + resultado);
		
		// Ejemplos de comparación con constantes
		final int VALOR_COMPARACION = 100;
		resultado = numero > VALOR_COMPARACION; // Debe ser false
		System.out.println("¿El número es mayor que el valor de VALOR_COMPARACION?: " + resultado);
		resultado = numero >= VALOR_COMPARACION; // Debe ser true
		System.out.println("¿El número es mayor o igual que valor de VALOR_COMPARACION?: " + resultado);
		
		// Ejemplos de comparación de dos variables
		int numero2 = 200;
		resultado = numero > numero2; // Debe ser false
		System.out.println("¿El número es mayor que el segundo número?: " + resultado);
		resultado = numero < numero2; // Debe ser true
		System.out.println("¿El número es menor que el segundo número?: " + resultado);
		resultado = numero == numero2; // Debe ser false
		System.out.println("¿El número es igual que el segundo número?: " + resultado);
		resultado = numero != numero2; // Debe ser true
		System.out.println("¿El número es diferente al segundo número?: " + resultado);
		
	}
}
