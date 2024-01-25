package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos11interfaces.ejemplo05anonimas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Programa01 {

	private static Random rnd = new Random();

	public static void main(String[] args) {

		List<Persona> personas = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			personas.add(new Persona(rnd.nextInt(1, 10), "Persona " + i));
		}
		
		System.out.println(personas);
		
		//Collections.sort(personas, new ByIdPersonaComparator());
		personas.sort(new ByIdPersonaComparator());

		System.out.println(personas);
		
		
		
		
	}
}
