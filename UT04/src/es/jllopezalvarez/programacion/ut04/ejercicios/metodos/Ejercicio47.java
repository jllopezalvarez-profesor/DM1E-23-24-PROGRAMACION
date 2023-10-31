package es.jllopezalvarez.programacion.ut04.ejercicios.metodos;

public class Ejercicio47 {

	public static void main(String[] args) {

		
		System.out.println(getNumCifras(123456));
	}

	private static int getNumCifras(int numero) {
		int numeroCifras = 0;
		
		String numComoString = "";
		
		numComoString = String.valueOf(numero);

		if (numero >0) {
			numeroCifras = 4;
		}
		return numeroCifras;
	}

}
