package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo01dependencia;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Dependencia de la clase java.util.Scanner, porque creamos un objeto de esa
		// clase. Dependencia de la clase java.io.InputStream, porque usamos System.in,
		// que es un objeto de esa clase. Dependencia de la clase java.lang.System,
		// porque usamos un atributo estático de esta clase (System.in).
		try (Scanner sc = new Scanner(System.in)) {
			// Dependencia de java.io.PrintStream, la clase de System.out.
			System.out.print("¿Cuántos números aleatorios quieres generar? ");
			// Dependencia de java.lang.Integer, porque usamos un método estático de la
			// clase.
			int cantidadNumeros = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < cantidadNumeros; i++) {
				// Dependencia de java.lang.Math, porque usamos un método estático de la clase.
				System.out.println(i + " - " + Math.random());
			}
		}
	}

}
