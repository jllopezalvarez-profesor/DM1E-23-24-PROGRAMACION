package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto");
		String cadena = scanner.nextLine();
		int longitud = cadena.length();
		
		int posicionCentro = longitud / 2;
		
		String cadenaIzquierda = cadena.substring(0, posicionCentro);
		String cadenaDerecha = cadena.substring(posicionCentro);
		
		
		System.out.println("La subcadena de la izquierda es " + cadenaIzquierda);
		System.out.println("La subcadena de la derecha es " + cadenaDerecha);

	}

}
