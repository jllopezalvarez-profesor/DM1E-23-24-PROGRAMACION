package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos06errorforeach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplos06ErrorForEach {
	public static void main(String[] args) {

		List<String> palabras = new ArrayList<>();

		palabras.add("Hola");
		palabras.add("a");
		palabras.add("todos");

		System.out.println(palabras);

		for (String palabra : palabras) {
			System.out.println(palabra);
		}

		for (Iterator<String> iterator = palabras.iterator(); iterator.hasNext();) {
			String palabra = iterator.next();
			System.out.println(palabra);
		}

		// Eliminar del List<String> las palabras que tengan tamaño menor que 3
		for (String palabra : palabras) {
			if (palabra.length() < 3) {
				palabras.remove(palabra);
			}
		}
		System.out.println("-".repeat(100));
		System.out.println(palabras);

		List<Integer> numeros = new ArrayList<>(List.of(1, 3, 2, 4, 3, 2, 5, 7, 8, 5, 4, 3));

		System.out.println(numeros);
		
		for (Iterator<Integer> iterator = numeros.iterator(); iterator.hasNext();) {
			Integer numero = iterator.next();
			if (numero % 2 == 0) {
				iterator.remove();
			}
		}
		
		System.out.println(numeros);

//		for (Integer numero : numeros) {
//			if ((numero % 2) == 0) {
//				numeros.remove(numero);
//			}
//		}

	}

}
