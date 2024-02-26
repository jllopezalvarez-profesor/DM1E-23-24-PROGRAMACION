package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos09unmodifiablecollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		
		
		List<String> palabras = List.of("Hola", "a", "todos");
		
		
		System.out.println("La posición de 'a' es: " + palabras.indexOf("a") );

		// Falla, porque no se puede añadir
		// palabras.add("los");
		
		List<String> otraLista = new ArrayList<>(palabras);
		
		otraLista.add("los");
		System.out.println(otraLista);
		System.out.println(palabras);
		
		
		String[] palabrasVarArgs = {"Uno", "Dos", "Tres"};
		
		mostrarPalabras(palabrasVarArgs);
		
		mostrarPalabras2(palabrasVarArgs);
		mostrarPalabras2("a", "b", "c", "d");
	
	}
	
	private static void mostrarPalabras(String[] palabras) {
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}
	private static void mostrarPalabras2(String... palabras) {
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
	}	
	
	
}
