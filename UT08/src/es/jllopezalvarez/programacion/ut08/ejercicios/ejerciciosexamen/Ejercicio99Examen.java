package es.jllopezalvarez.programacion.ut08.ejercicios.ejerciciosexamen;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio99Examen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuántos números quieres generar.");
		int tamanio = Integer.parseInt(sc.nextLine());
		System.out.println("Valor mínimo (incluido)");
		int min = Integer.parseInt(sc.nextLine());
		System.out.println("Valor máximo (no incluido)");
		int max = Integer.parseInt(sc.nextLine());
		
		
		try {
			List<Integer> numeros = generarNumerosAleatorios(tamanio, min, max);
			System.out.println(numeros);
			//numeros.sort(Comparator.reverseOrder());
			Collections.sort(numeros, Comparator.reverseOrder());
			System.out.println(numeros);
			System.out.println("Valor que quieres reemplazar");
			int original = Integer.parseInt(sc.nextLine());
			System.out.println("Valor que quieres que sustituya al indicado");
			int nuevo = Integer.parseInt(sc.nextLine());
			int numReemplazados = reemplazarNumero(numeros, original, nuevo);
			System.out.println(numeros);
			System.out.println("Se han reeemplazado " + numReemplazados );
		} catch (IllegalArgumentException e) {
			System.out.println("Error al crear la lista: " + e.getMessage());
		}
		
	}

	private static List<Integer> generarNumerosAleatorios(int tamanio, int min, int max) {

		if (max - min < tamanio) {
			throw new IllegalArgumentException(String.format(
					"No hay suficientes enteros entre %d y %d para crear una lista con %d números", min, max, tamanio));
		
		}

		Random rnd = new Random();

		List<Integer> numeros = new ArrayList<>(tamanio);

		// Mal porque no tiene en cuenta los repetidos
//		for (int i = 0; i < tamanio; i++) {
//			numeros.add(rnd.nextInt(min, max));
//		}

		// Mal porque si se repite un número la cantidad de devueltos será menor que lo
		// esperado
//		for (int i = 0; i < tamanio; i++) {
//			int numero = rnd.nextInt(min, max);
//			if (!numeros.contains(numero)) {
//				numeros.add(numero);
//			}
//		}

		// Si funciona.
//		for (int i = 0; i < tamanio; i++) {
//			int numero = rnd.nextInt(min, max);
//			while (numeros.contains(numero)) {
//				numero = rnd.nextInt(min, max);
//			}
//			numeros.add(numero);
//		}

		// Si funciona
		while (numeros.size() < tamanio) {
			int numero = rnd.nextInt(min, max);
//			System.out.println("Probando número " + numero);
			if (!numeros.contains(numero)) {
				numeros.add(numero);

			}
		}

		return numeros;
	}
	
	private static int reemplazarNumero(List<Integer> numeros, int original, int nuevo) {
		if (numeros == null) {
			throw new IllegalArgumentException("La lista no puede ser nula");
		}
		
		int cuantosCambiados = 0;
		
		ListIterator<Integer> iterador = numeros.listIterator();
		while(iterador.hasNext()) {
			int numero = iterador.next();
			if (numero == original) {
				iterador.set(nuevo);
				cuantosCambiados++;
			}
		}
		return cuantosCambiados;
		
	}

}
