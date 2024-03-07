package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio15 {

	public static void main(String[] args) {

		System.out.println(comprobarParentesis("({[]})()"));
		System.out.println(comprobarParentesis("Tengase en cuenta (obviamente) que puede haber otros simbolos."));
		System.out.println(comprobarParentesis(":)"));
		System.out.println(comprobarParentesis("(({[]})"));

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
