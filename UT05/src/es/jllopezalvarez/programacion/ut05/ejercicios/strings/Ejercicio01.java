package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

public class Ejercicio01 {
	public static void main(String[] args) {

//		char[] caracteres = { 'h', 'o', 'l', 'a' };
//		for (int i = 0; i < caracteres.length; i++) {
//			System.out.println(caracteres[i]);
//		}
//
//		String cadena = "hola";
//		for (int i = 0; i < cadena.length(); i++) {
//			System.out.println(cadena.charAt(i));
//		}

		muestraDoble(4);

		int doble = calculaDoble(5);
		System.out.println(doble);
	}

	// Método que muestra el doble de un número que recibe como parámetro por la
	// consola
	public static void muestraDoble(int numero) {
		System.out.println(numero * 2);
	}

	// Método que devuelve el doble de un número que recibe como parámetro
	public static int calculaDoble(int numero) {
		return numero * 2;
	}

}
