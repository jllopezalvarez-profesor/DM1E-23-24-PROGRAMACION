package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

/**
 * Ejemplos de salida de datos por pantalla
 */
public class Ejemplo01PrintStream {
	public static void main(String[] args) {
		System.out.print("Número: " + "fdfef" + ", cadena: " + 344 + "\n\n");
		
		System.out.printf("Número: %s, cadena: %s\n\n%s\n", "fdfef", 344, 333);
		
		// Mostrar una cadena en la consola, con salto de línea al final
		System.out.println("Esto es un mensaje para el usuario, con salto al final.");
		System.out.println("Y esta línea se coloca debajo.");

		// Mostrar una cadena sin salto al final
		System.err.print("El método print no añade salto ");
		System.err.print("así que esto se coloca a continuación.");
		System.err.print (4342);
		// Escribir sólo un salto
		System.err.println();

		// Se pueden escribir otros tipos de variables
		long numeroGrande = 1_000_000_000_000_000_000L;
		System.out.println(numeroGrande);
		double numeroMasGrande = 1_000_900_000_000_000_000_000_000_000_000_000_000_000_000_000_000.343;
		System.out.println(numeroMasGrande);
		System.out.println("Esto en la siguiente línea");

		// Si usamos "+" con cadenas y números, el número se convierte a cadena y se
		// concatena
		System.out.println("Un número muy grande: " + numeroMasGrande);

		// Unos println para dejar espacio en la salida:
		System.out.println();
		System.out.println();
//
//		// Con printf y format podemos "intercalar" valores en una cadena
//		int n = 100;
//		System.out.printf("Voy a escribir el número n: %d", n);
//		// printf no añade salto de línea, podemos usar println
//		System.out.println();
//		// O podemos usar el caracter de escape de salto de línea (\n) en la cadena
//		System.out.printf("Escribo n: %d, salto de línea ahora\ny otro ahora\n", n);
//
//		// En lugar de dos println, para dejar espacio podemos escribir dos saltos de
//		// línea con printf
//		System.out.println("\n\n");
//
//		// Se pueden indicar cuantos números decimales
//		System.out.println("Pi se puede escribir con varios decimales (redondea automáticamente).");
//		System.out.printf("3 decimales: %.3f\n", Math.PI);
//		System.out.printf("10 dígitos, 5 decimales: %010.5f\n", Math.PI);
//		// printf y format son equivalentes
//		System.out.format("Con format también se puede escribir con 3 decimales: %.3f\n", Math.PI);

	}
}
