package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Ejercicio04 {
	private static final int LIMITE_NUMEROS = 10;
	private static final int CANTIDAD_NUMEROS = 20;

	public static void main(String[] args) {
		Random rnd = new Random(34);

		int[] numeros = new int[CANTIDAD_NUMEROS];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(LIMITE_NUMEROS) + 1;
		}

		List<Integer> listaNumeros = new ArrayList<>(CANTIDAD_NUMEROS);

		System.out.println("Tamaño de la lista antes de insertar: " + listaNumeros.size());

		// LLenar usando un while (puede ser un for)
//		int cuantos = CANTIDAD_NUMEROS;
//		while (cuantos > 0) {
//			listaNumeros.add(rnd.nextInt(LIMITE_NUMEROS) + 1);
//			cuantos--;
//		}

		while (listaNumeros.size() < CANTIDAD_NUMEROS) {
			listaNumeros.add(rnd.nextInt(LIMITE_NUMEROS) + 1);
		}
		System.out.println("El tamaño de la lista ddespués de insertar es " + listaNumeros.size());

		// Mostrar lista
		System.out.println(listaNumeros);

		// Copia de la lista
		List<Integer> listaEliminarPrincipio = new ArrayList<>(listaNumeros);
		// Eliminar duplicados al final
		eliminarDuplicadosAlFinal(listaEliminarPrincipio);
		// Mostrar la lista de nuevo
		System.out.println(listaEliminarPrincipio);
		
		// Copia de la lista
		List<Integer> listaEliminarFinal = new ArrayList<>(listaNumeros);
		// Eliminar duplicados al final
		eliminarDuplicadosAlPrincipio(listaEliminarFinal);
		// Mostrar la lista de nuevo
		System.out.println(listaEliminarFinal);

	}

	private static void eliminarDuplicadosAlPrincipio(List<Integer> listaEliminarFinal) {
		List<Integer> yaAparecidos = new ArrayList<>();
		
		ListIterator<Integer> iterator = listaEliminarFinal.listIterator(listaEliminarFinal.size());
		
		while(iterator.hasPrevious()) {
			Integer numero = iterator.previous();
			if (yaAparecidos.contains(numero)) {
				iterator.remove();
			} else {
				yaAparecidos.add(numero);
			}
		}
	}

	private static void eliminarDuplicadosAlFinal(List<Integer> listaEliminarPrincipio) {
		List<Integer> yaAparecidos = new ArrayList<>();
		for (Iterator<Integer> iterator = listaEliminarPrincipio.iterator(); iterator.hasNext();) {
			Integer numero = iterator.next();
			// ¿numero ha aparecido ya?
			if (yaAparecidos.contains(numero)) {
				// SI --> Eliminarlo
				iterator.remove();
			} else {
				// NO --> Guardarlo en algún sitio para poder preguntar luego
				yaAparecidos.add(numero);
			}
		}
	}
	

}
