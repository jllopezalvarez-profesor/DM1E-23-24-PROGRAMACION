package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo06equals;

import java.util.Arrays;
import java.util.Comparator;

public class Programa {
	public static void main(String[] args) {
		Persona p1 = new Persona("12345678X", "Nombre", "Apellidos");
		Persona p2 = new Persona("12345678X", "Nombre", "Apellidos");
		
		System.out.println("P1 " + p1);
		System.out.println("P2 " + p2);
		System.out.println("¿P1 es igual a P2? " + p1.equals(p2));
		
//		Persona p3 = p1;
//
//		System.out.println("P1 " + p1);
//		System.out.println("P3 " + p3);
//		System.out.println("¿P1 es igual a P3? " + p1.equals(p3));

		System.out.println("HashCode de P1 " + p1.hashCode());
		System.out.println("HashCode de P2 " + p2.hashCode());
		
		
	}
}
