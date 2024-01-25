package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos20arraylist;

import java.util.ArrayList;

/**
 * Ejemplos de ArrayList
 */
public class Programa {

	public static void main(String[] args) {
		// ArrayList "A la antigua"
		ArrayList arrayList = new ArrayList();
		arrayList.add(3);
		arrayList.add("Hola");
		arrayList.add(new Persona("dsasda", "sdfsdf"));

		// ArrayList parametrizado
		ArrayList<Integer> numeros = new ArrayList<>();

		ArrayList<Persona> personas = new ArrayList<Persona>();

		numeros.add(4443);
		numeros.add(123);
		numeros.add(0, 2323);
		numeros.add(2323);
		numeros.add(4, 2323);

		System.out.println(numeros);
		numeros.sort(null);
		System.out.println(numeros);

		numeros.add(1, 10000);
		System.out.println(numeros);

		numeros.remove(0);
		System.out.println(numeros);
		
		numeros.removeIf(n -> n==2323);
		System.out.println(numeros);
		
		numeros.remove(Integer.valueOf(2323));
		System.out.println(numeros);
		
		
		



		ArrayList<Persona> alumnos = new ArrayList<>();
		alumnos.add(new Persona("1", "1"));
		alumnos.add(new Persona("2", "2"));
		alumnos.add(new Persona("3", "3"));
		alumnos.add(new Persona("4", "4"));
		alumnos.add(new Persona("5", "5"));
		
		
		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("Hola");
		System.out.println(palabras);
		for(int n=1; n<10;n++) {
			palabras.add(0, String.format("Palabra %d", n));
		}
		System.out.println(palabras);
		
		
		for (int i = 0; i < palabras.size(); i++) {
			
			
		}
		
		for (String string : palabras) {
			
		}
		
		
		System.out.println(palabras.indexOf("Palabra 4"));
		palabras.remove(palabras.indexOf("Palabra 4"));
		System.out.println(palabras);
		
		

//		System.out.println(alumnos);

//		alumnos.sort(null);

	}

}
