package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio05 {

	private static Random rnd = new Random();

	public static void main(String[] args) {

		List<Integer> minuendo = crearListaAleatoria(10, 0, 10);
		List<Integer> sustraendo = crearListaAleatoria(10, 0, 10);
		List<Integer> resultado = restar(minuendo, sustraendo);

		System.out.println(minuendo);
		System.out.println("-");
		System.out.println(sustraendo);
		System.out.println("-".repeat(100));
		System.out.println(resultado);
	}

	private static List<Integer> crearListaAleatoria(int tamanio, int min, int max) {
		List<Integer> resultado = new ArrayList<>();

		while (resultado.size() < tamanio) {
			resultado.add(rnd.nextInt(min, max));
		}

		return resultado;
	}

	private static List<Integer> restar(List<Integer> minuendo, List<Integer> sustraendo) {
		if (minuendo == null) {
			throw new IllegalArgumentException("El minuendo no puede ser nulo");
		}
		if (sustraendo == null) {
			throw new IllegalArgumentException("El sustraendo no puede ser nulo");
		}

		List<Integer> resultado = new ArrayList<Integer>();

		for (Integer numero : minuendo) {
			if (!sustraendo.contains(numero)) {
				resultado.add(numero);
			}
		}

		return resultado;
	}

	private static List<Integer> restarSinRepetidos(List<Integer> minuendo, List<Integer> sustraendo) {
		if (minuendo == null) {
			throw new IllegalArgumentException("El minuendo no puede ser nulo");
		}
		if (sustraendo == null) {
			throw new IllegalArgumentException("El sustraendo no puede ser nulo");
		}

		List<Integer> resultado = new ArrayList<Integer>();

		for (Integer numero : minuendo) {
			if (!sustraendo.contains(numero)) {
				if (!resultado.contains(numero)) {
					resultado.add(numero);
				}
			}
		}

		return resultado;
	}

}
