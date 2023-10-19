package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Random;

public class Ejercicio31 {
	public static void main(String[] args) {
		Random rnd = new Random();

		for (int n = 0; n < 20; n++) {
			int numeroSecreto = rnd.nextInt(1, 100);

			System.out.println(numeroSecreto);
		}
	}

}
