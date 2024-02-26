package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos08viewcollwctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo08ViewCollections2 {
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
		List<String> palabrasSync = Collections.synchronizedList(palabras);
		
		// Esto crea una nueva lista, independiente, que COPIA la vista generada por subList
		// List<String> algunasPalabras = new ArrayList<>( palabras.subList(2, 5));
		
		System.out.println("Vista -------------");		
		System.out.println(palabrasSync);
		palabrasSync.add(1, "añadido");
		System.out.println(palabrasSync);
		
		System.out.println("Subyacente -------------");
		System.out.println(palabras);
		
		palabras.add("3, a");
		palabras.add("3, clase");

		System.out.println("Vista -------------");		
		System.out.println(palabrasSync);

		
		
		System.out.println("Subyacente -------------");
		System.out.println(palabras);
	}
}
