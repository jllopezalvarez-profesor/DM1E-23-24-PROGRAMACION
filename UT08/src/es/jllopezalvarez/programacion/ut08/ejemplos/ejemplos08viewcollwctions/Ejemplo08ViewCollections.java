package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos08viewcollwctions;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo08ViewCollections {
	public static void main(String[] args) {
		List<String> palabras = new ArrayList<>();
		
		palabras.add("Hola");
		palabras.add("a");
		palabras.add("todos");
		palabras.add("los");
		palabras.add("que");
		palabras.add("hoy");
		palabras.add("han");
		palabras.add("venido");
		
		System.out.println("Original -------------");
		System.out.println(palabras);

		// Esto crea una vista de "palabras"
		List<String> algunasPalabras = palabras.subList(2, 5);
		
		// Esto crea una nueva lista, independiente, que COPIA la vista generada por subList
		// List<String> algunasPalabras = new ArrayList<>( palabras.subList(2, 5));
		
		System.out.println("Vista -------------");		
		System.out.println(algunasPalabras);
		algunasPalabras.add(1, "añadido");
		System.out.println(algunasPalabras);
		
		System.out.println("Subyacente -------------");
		System.out.println(palabras);

		// Si hacemos esto falla porque no podemos modificar la subyacente
//		palabras.add("3, a");
//		palabras.add("3, clase");

		System.out.println("Vista -------------");		
		System.out.println(algunasPalabras);

		
		
		System.out.println("Subyacente -------------");
		System.out.println(palabras);
	}
}
