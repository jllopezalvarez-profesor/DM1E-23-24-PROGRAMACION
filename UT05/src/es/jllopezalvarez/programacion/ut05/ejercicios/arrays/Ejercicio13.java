package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Random;

/**
 * <pre>
 * Crea un programa que sirva para comprobar si los números generados con Math.random siguen una distribución uniforme, es decir, que, si generamos muchos números, todos los números se generar más o menos las mismas veces. Para ello, vamos a:
    • Generar un número importante de números aleatorios, entre 0 y 99. Podemos empezar con 10000. Usa una constante para este número, así podremos cambiarlo fácilmente, para probar con más o con menos.
    • Contar cuantas veces aparece cada uno de los números. 
    • Obtener qué número ha aparecido más veces.
    • Obtener qué número ha aparecido menos veces.
	Para contar las apariciones usa un array de enteros de 100 posiciones, inicializado a cero (todas sus posiciones tienen valor cero). Cada vez que se generar un número incrementamos la posición correspondiente del array en uno, para contar cuantas veces ha aparecido ese número. Así, en la posición 0 tendremos cuantas veces ha aparecido el cero, en la uno, cuantas veces el uno, y así sucesivamente.
	Una vez generados y contabilizados, vamos a mostrar los valores del array, y contar cuántas veces aparece el que más veces aparece, y cuantas el que menos. 
	¿Estos valores se separan mucho de lo esperado? Lo esperado sería que cada número apareciera la misma cantidad de veces, que se obtiene al dividir la cantidad total de números generados por la cantidad de números diferentes que generamos.
	Ejemplo: generamos 50000 números aleatorios. Cada número está entre 0 y 99 ambos incluidos. En total tenemos 100 números distintos. Si todos aparecen la misma cantidad de veces cada uno debería aparecer 50000/100 veces = 500 veces.
 * </pre>
 */

public class Ejercicio13 {
	private static final int TAMANIO_MUESTRA = 100_000_000;
	private static final int CANTIDAD_NUMEROS = 100;
	private static final boolean PROBAR_OBJETO_RANDOM = true;

	public static void main(String[] args) {
		Random rnd = new Random();

		// En la posición 0 guardamos cuantas veces se genera un 0,
		// en la 1 cuantas el 1, y así sucesivamente
		int[] contadores = new int[CANTIDAD_NUMEROS];

		// Generamos números y contamos cuantas veces aparecen
		for (int i = 0; i < TAMANIO_MUESTRA; i++) {
			int numero;
			if (PROBAR_OBJETO_RANDOM) {
				numero = rnd.nextInt(CANTIDAD_NUMEROS);
			} else {
				numero = (int) (Math.random() * CANTIDAD_NUMEROS);
			}
			contadores[numero]++;
		}

		// Mostramos la cantidad de veces que se generó cada número.
		for (int i = 0; i < contadores.length; i++) {
			int aparicionesDeI = contadores[i];
			System.out.printf("%2d - %6d\n", i, aparicionesDeI);
		}

		// Llamamos a un método que buscará los extemos,
		// el que más veces se generó y el que menos.
		buscaExtremos(contadores);

	}

	private static void buscaExtremos(int[] numeros) {
		int menor = numeros[0];
		int posMenor = 0;
		int mayor = numeros[0];
		int posMayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			int candidato = numeros[i];
			if (candidato < menor) {
				menor = candidato;
				posMenor = i;
			}
			if (candidato > mayor) {
				mayor = candidato;
				posMayor = i;
			}
		}
		System.out.printf("El número que menos veces aparece es el %d (%d veces)\n", posMenor, menor);
		System.out.printf("El número que más veces aparece es el %d (%d veces)\n", posMayor, mayor);
		System.out.printf("La diferencia entre ellos es de %d veces\n", mayor - menor);

	}
}
