package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejercicio12B {

	private static Random rnd = new Random();

	private static final int[] DIVISORES = { 2, 3, 5, 7 };

	public static void main(String[] args) {
		List<Integer> numeros = crearAleatorios(20, 1, 50);
		System.out.println(numeros);
		System.out.println("-".repeat(100));

		Map<Integer, List<Integer>> mapa = new TreeMap<Integer, List<Integer>>();

		for (Integer numero : numeros) {
			for (Integer divisor : DIVISORES) {
				if (numero % divisor == 0) {
					var listaDivisibles = mapa.getOrDefault(divisor, new ArrayList<Integer>());
					listaDivisibles.add(numero);
					mapa.put(divisor, listaDivisibles);
				}
			}
		}

		for (Map.Entry<Integer, List<Integer>> entry : mapa.entrySet()) {
			Integer divisor = entry.getKey();
			List<Integer> listaDivisibles = entry.getValue();

			System.out.printf("Divisibles por %s: %s\n", divisor, new TreeSet<Integer>(listaDivisibles));
		}

	}

	private static List<Integer> crearAleatorios(int tamanio, int min, int max) {
		List<Integer> numeros = new ArrayList<>(tamanio);
		while (tamanio-- > 0) {
			numeros.add(rnd.nextInt(min, max));
		}
		return numeros;
	}

}
