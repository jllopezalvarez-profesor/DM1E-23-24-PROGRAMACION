package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 *  Ejemplos de conversiones entre tipos de datos primitivos y String.
 */
public class Ejemplo07Conversiones {

	public static void main(String[] args) {
		int entero;
		int entero2 = 100;
		long enteroLargo = 2000000000000000L;
		double valorDouble = 34234.123;

		// Cast de double a int. Si no usamos casting (int), fallará, no compilará,
		// porque un double puede no caber en un int, y además se perderían decimales
		entero = (int) valorDouble;

		// La conversión de int a double no es problemática, porque un int es más
		// pequeño que un double, un int siempre cabe en un double
		valorDouble = entero2;

		// Mostramos valores.
		System.out.println(entero);
		System.out.println(entero2);
		System.out.println(valorDouble);

		// Con los long (enteros largos) también es necesario el casting, porque un long
		// también es más grande que un int, y puede que no quepa al asignarlo
		int entero3 = (int) enteroLargo;
		System.out.println(entero3);

		// No se puede asignar un String a un int
		// Esto falla, no compila (por eso está comentado):
		// int numero = "2500";

		// Para pasar de String a int (o a otro número) tenemos que usar
		// Integer.parseInt
		int numero = Integer.parseInt("2500");
		System.out.println("Numerox: " + numero);

		// Para convertir un número (u otros tipos de datos) a String, en general se usa
		// el método valueOf de la clase String:
		String cadena = String.valueOf(enteroLargo);
		System.out.println("Valor como cadena del número: " + cadena);
	}
}
