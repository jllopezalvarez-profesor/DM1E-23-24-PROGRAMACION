package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplo05wrappers;

public class Ejemplo05Wrappers {

	public static void main(String[] args) {
		int numero = 3;
		
		
		Integer otroNumero = numero;
		
		System.out.println(otroNumero);
		
		
		procesarNumero(5);
		procesarNumero(numero);
	
		Integer otroOtroNumero = 3;
		
		int elUltimoNumero = otroOtroNumero;
		

		
		
		
		
	}
	
	private static void procesarNumero (Integer num) {
		
		System.err.println(num/2);
	}
	
}
