package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos11conjuntos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejemplos11Conjuntos {
	public static void main(String[] args) {
		PruebaHashSet();
		PruebaTreeSet();
		PruebaTreeSetConCustomOrder();
		

	}

	private static void PruebaTreeSetConCustomOrder() {
		Set<String> numeros = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return -Integer.compare(arg0.length(), arg1.length());
			}
		});
		
		Random rnd = new Random();
		for(int n=0; n<1000; n++) {
			numeros.add(String.valueOf(rnd.nextInt(1, 100000)));
		}

		System.out.println(numeros);
	}

	private static void PruebaTreeSet() {
		Set<String> numeros = new TreeSet<>();

		numeros.add("Numero " + 3);
		numeros.add("Numero " + 1);
		numeros.addAll(List.of("Numero " + 2, "Numero " + 5, "Numero " + 7, "Numero " + 2, "Numero " + 5, "Numero " + 9, "Numero " + 0));
		
		Random rnd = new Random();
		for(int n=0; n<1000; n++) {
			numeros.add("Numero " +  rnd.nextInt(1, 100));
		}

		System.out.println(numeros);
	}

	
	private static void PruebaHashSet() {
		Set<String> numeros = new HashSet<>();

		numeros.add("Numero " + 3);
		numeros.add("Numero " + 1);
		numeros.addAll(List.of("Numero " + 2, "Numero " + 5, "Numero " + 7, "Numero " + 2, "Numero " + 5, "Numero " + 9, "Numero " + 0));
		
		Random rnd = new Random();
		for(int n=0; n<1000; n++) {
			numeros.add("Numero " +  rnd.nextInt(1, 100));
		}

		System.out.println(numeros);
	}

}
