package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos11interfaces.ejemplo05anonimas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Programa02 {

	private static Random rnd = new Random();

	public static void main(String[] args) {

		List<Persona> personas = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			personas.add(new Persona(rnd.nextInt(1, 10), "Persona " + i));
		}

		System.out.println(personas);

//		personas.sort(new Comparator<Persona>() {
//			@Override
//			public int compare(Persona o1, Persona o2) {
//				return Integer.compare(o1.getId(), o2.getId());
//			}
//		});

		personas.sort(Persona::compararPersonas);
		
		
		System.out.println(personas);
		
		personas.sort(Persona.getByNombreComparator());
		
		System.out.println(personas);
		
		LocalDateTime d1 = LocalDateTime.now();
		LocalDateTime d2 = LocalDateTime.now();
		
		String a = "Hola";
		String b = "Hola";
		
		System.out.println( a == b);

	}
}
