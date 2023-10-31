package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean seguir;
		do {
			int numero = Ejercicio51.pedirNumero(scanner, "¿De qué número quieres generar la tabla?", 0, 11);
			mostrarTablaMultiplicar(numero);
			seguir = Ejercicio52.pedirConfirmacion(scanner, "¿Quieres hacer más tablas de multiplicar?");
		} while (seguir);

	}

	private static void mostrarTablaMultiplicar(int numero) {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%dx%d=%d\n", numero, i, numero * i);
		}
		System.err.println();

	}

}
