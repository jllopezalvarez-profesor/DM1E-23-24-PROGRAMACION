package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Ejercicio12 {

	private static Random rnd = new Random();

	private static final int[] DIVISORES = { 2, 3, 5, 7 };

	public static void main(String[] args) {
		List<Integer> numeros = crearAleatorios(20, 1, 50);
		System.out.println(numeros.size());

		Map<Integer, List<Integer>> mapa = new TreeMap<Integer, List<Integer>>();

		for (Integer numero : numeros) {
			for (Integer divisor : DIVISORES) {
				if (numero % divisor == 0) {
					if (mapa.containsKey(divisor)) {
						var listaDivisibles = mapa.get(divisor);
						listaDivisibles.add(numero);
						// mapa.put(divisor, listaDivisibles);
					} else {
						// Esto hace lo mismo que la línea única de abajo
						// List<Integer> nuevosDivisibles = new ArrayList<>();
						// nuevosDivisibles.add(numero);
						// mapa.put(numero, nuevosDivisibles);
						mapa.put(divisor, new ArrayList<Integer>(List.of(numero)));
					}
				}
			}
		}
		
		for (Map.Entry<Integer, List<Integer>> entry : mapa.entrySet()) {
			Integer divisor = entry.getKey();
			List<Integer> listaDivisibles = entry.getValue();
			
			System.out.printf("Divisibles por %s: %s\n", divisor, listaDivisibles);
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
