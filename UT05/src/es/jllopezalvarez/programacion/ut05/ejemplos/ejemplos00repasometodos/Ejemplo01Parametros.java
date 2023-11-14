package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos00repasometodos;

import java.util.Iterator;

public class Ejemplo01Parametros {
	public static void main(String[] args) {

		String s = "Hola";
		System.out.println(s);
		metodoConParamString(s);
		System.out.println(s);
//		
//		noDevuelveNiRecibeNada();
//
//		System.out.println("Después de llamar a devuelveElTres");
//
//		int numero = devuelveElTres();
//		System.out.println(numero);
//
//		System.out.println(devuelveElTres());
//
//		System.out.println("Después de llamar a devuelveElTres");
//
//		int[] numeros = devuelveArrayVacio(10);
//		
//		for (int i : numeros) {
//			System.out.println(i);
//		}
//		

	}

	private static int devuelveElTres() {
		return 3;
	}

	private static int[] devuelveArrayVacio(int tamanio) {
		return new int[tamanio];
	}

	private static void noDevuelveNiRecibeNada() {
		System.out.println("No recibo nada ni devuelvo nada");
	}

	private static void metodoConParamString(String s) {
		
		s = s.toLowerCase();
		System.out.println("La cadena tras cambiar dentro del método:");
		System.out.println(s);
		
	}
	
}
