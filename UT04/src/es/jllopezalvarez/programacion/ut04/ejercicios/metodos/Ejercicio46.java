package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

public class Ejercicio46 {

	public static void main(String[] args) {

		System.out.println(getNumCifras(123456));
		System.out.println(getNumCifras(23));
		System.out.println(getNumCifras(0));
		System.out.println(getNumCifras(-234));
		

	}

	private static int getNumCifras(int numero) {
		if (numero == 0) {
			return 1;
		}

		int numeroCifras = 0;

		while (numero != 0) {
			numero = numero / 10;
			numeroCifras++;
		}

		return numeroCifras;

	}

}
