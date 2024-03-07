package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio09_10_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio09 {

	private static final int CANTIDAD_NUMEROS = 20;
	private static final int MIN = 1;
	private static final int MAX = 50;

	private static Random rnd = new Random();

	public static void main(String[] args) {
		List<Integer> numeros = crearNumerosAleatorios(CANTIDAD_NUMEROS, MIN, MAX);

		System.out.println(numeros);
		
		contarNumerosEjercicio09(numeros);
		
		
	}

	private static List<Integer> crearNumerosAleatorios(int cantidadNumeros, int min, int max) {
		List<Integer> numeros = new ArrayList<>(cantidadNumeros);
		while (cantidadNumeros > 0) {
			numeros.add(rnd.nextInt(min, max));
		}
		return numeros;
	}
}
