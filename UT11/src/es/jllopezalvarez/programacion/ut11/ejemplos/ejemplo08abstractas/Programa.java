package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo08abstractas;

import java.util.Arrays;
import java.util.Random;

public class Programa {

	private static Random rnd = new Random();

	public static void main(String[] args) {
		Animal[] animales = new Animal[10];

		for (int i = 0; i < animales.length; i++) {
			animales[i] = generaAnimalAleatorio();
		}

		System.out.println(Arrays.toString(animales));

		for (Animal animal : animales) {
			animal.desplazarse(10);
			animal.engordar(-1);
		}

	}

	private static Animal generaAnimalAleatorio() {
		switch (rnd.nextInt(4)) {
		case 1:
			return new Reptil(rnd.nextInt(20));
		case 2:
			return new Perro(rnd.nextInt(20));
		case 3:
			return new Gato(rnd.nextInt(20));
		default:
			return new Ave(rnd.nextInt(20));
		}
	}
}
