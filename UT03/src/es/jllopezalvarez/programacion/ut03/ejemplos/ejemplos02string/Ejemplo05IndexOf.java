package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos02string;

public class Ejemplo05IndexOf {
	public static void main(String[] args) {
		String frase = "Este es el grupo DM1E y estamos en la clase de programación";

		char letraBuscada = 'l';

		// Primera vez que aparece en la frase
		int primeraAparicion = frase.indexOf(letraBuscada);
		System.out.printf("La primera aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
				primeraAparicion);
		int segundaAparicion = frase.indexOf(letraBuscada, primeraAparicion + 1);
		System.out.printf("La segunda aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
				segundaAparicion);
		int terceraAparicion = frase.indexOf(letraBuscada, segundaAparicion + 1);
		System.out.printf("La segunda aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
				terceraAparicion);
		int cuartaAparicion = frase.indexOf(letraBuscada, terceraAparicion + 1);
		System.out.printf("La segunda aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
				cuartaAparicion);

		
		int ultimaAparicion = frase.lastIndexOf(letraBuscada);
		System.out.printf("La última  aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
				ultimaAparicion);
//		int segundaAparicion = frase.indexOf(letraBuscada, primeraAparicion + 1);
//		System.out.printf("La segunda aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
//				segundaAparicion);
//		int terceraAparicion = frase.indexOf(letraBuscada, segundaAparicion + 1);
//		System.out.printf("La segunda aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
//				terceraAparicion);
//		int cuartaAparicion = frase.indexOf(letraBuscada, terceraAparicion + 1);
//		System.out.printf("La segunda aparición de '%s' en '%s' es en la posición %d\n", letraBuscada, frase,
//				cuartaAparicion);

		
	}
}
