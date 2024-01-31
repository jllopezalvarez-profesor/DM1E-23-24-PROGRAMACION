package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio141516;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

import net.datafaker.Faker;

public class Programa {

	private static Faker faker = new Faker(new Locale("es"));

	public static void main(String[] args) {
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = faker.random().nextInt(20);
		}
		
		System.out.println("Números antes de ordenar:");
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros);

		System.out.println("Números después de ordenar:");
		System.out.println(Arrays.toString(numeros));
		
		String[] nombres = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = faker.name().firstName();
		}
		
		System.out.println("Nombres antes de ordenar:");
		System.out.println(Arrays.toString(nombres));
		
		Arrays.sort(nombres);

		System.out.println("Nombres después de ordenar:");
		System.out.println(Arrays.toString(nombres));
		
		
		// Ejercicio 16
		Persona[] personas = new Persona[10];
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona(faker.random().nextInt(20, 23),  faker.name().firstName(),
					faker.name().lastName());
		}
		
		System.out.println(Arrays.toString(personas));

		System.out.println(personas[0].compareTo(personas[1]));
		
		//Comparable<Persona> c = (Comparable<Persona>)personas[0];
		
		
		Arrays.sort(personas);
		System.out.println(Arrays.toString(personas));
		
	}

}
