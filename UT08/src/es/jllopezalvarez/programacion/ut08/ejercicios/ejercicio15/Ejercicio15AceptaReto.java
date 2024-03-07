package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio15;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio15AceptaReto {

	private static Scanner scanner = new Scanner(System.in);
//	private static Scanner scanner = new Scanner("({[]})()\n"
//			+ "Tengase en cuenta (obviamente) que puede haber otros simbolos.\n"
//			+ ":)\n"
//			+ "");

	public static void main(String[] args) {

		while (scanner.hasNext()) {
			String linea = scanner.nextLine();
			System.out.println(comprobarParentesis(linea) ? "YES" : "NO");
		}

	}

	//////////////////////////////
	// ( {
	///////////////////////
	private static boolean comprobarParentesis(String entrada) {
		if (entrada == null) {
			throw new IllegalArgumentException("La entrada no puede ser nula.");
		}

		Deque<Character> pila = new LinkedList<>();

		for (char caracter : entrada.toCharArray()) {
			if (esApertura(caracter)) {
				pila.push(caracter);
			} else if (esCierre(caracter)) {
				if (pila.isEmpty()) {
					// No puede estar vacía si tenía que haber una
					// apertura para el cierre detectado
					return false;
				}
				char caracterApertura = pila.pop();
				if (!sonCoincidentes(caracterApertura, caracter)) {
					return false;
				}
			}
		}
		if (!pila.isEmpty()) {
			// Si no está vacía es que faltan cierres para las aperturas
			return false;
		}

		// Al llegar aquí todo está bien
		return true;
	}

	private static boolean sonCoincidentes(char caracterApertura, char caracterCierre) {
		return (caracterApertura == '{' && caracterCierre == '}') || (caracterApertura == '[' && caracterCierre == ']')
				|| (caracterApertura == '(' && caracterCierre == ')');
	}

	private static boolean esApertura(char caracter) {
		return caracter == '(' || caracter == '{' || caracter == '[';
	}

	private static boolean esCierre(char caracter) {
		return caracter == ')' || caracter == '}' || caracter == ']';
	}

}
