package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo05StringBuilderB {

	public static void main(String[] args) {

		// Aplicación muy habitual de StringBuilder
		// Construir cadenas en iteraciones (bucles)
		// Ejemplo: mostrar todos los elementos de un array
		// y la posición en la que está cada uno de ellos
		int[] numeros = generaArrayNumerosAleatorios(100);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numeros.length; i++) {
			sb.append("En la posición ");
			sb.append(i);
			sb.append(" está el valor ");
			sb.append(numeros[i]);
			sb.append("\n");
		}
		// Mostramos el resultado:
		System.out.println(sb.toString());
	}
	
	/**
	 * Crea un array con números aleatorios del 1 al 100.
	 * @param cantidadNumeros tamaño del array que queremos generar
	 * @return el array generado
	 */
	public static int[] generaArrayNumerosAleatorios(int cantidadNumeros) {
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ((int) (Math.random() * 100)) + 1;
		}
		return numeros;
	}

}
