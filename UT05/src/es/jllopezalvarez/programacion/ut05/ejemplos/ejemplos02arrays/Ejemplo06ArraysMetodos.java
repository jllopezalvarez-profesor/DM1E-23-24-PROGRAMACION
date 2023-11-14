package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos02arrays;

/**
 * 
 * Ejemplo de cómo pasar un array como parámetro a un método.
 * 
 */
public class Ejemplo06ArraysMetodos {

	public static void main(String[] args) {

		// Creación de un array e inicialización en una sóla línea
		int[] array1 = { 15, 98, 67 };

		// Llamamos a método estático para mostrar el array
		muestraContenidoArray(array1);
		
		// Creación de array llamando a un método que lo crea
		int[] array2 = generaArrayNumerosAleatorios(10);
		muestraContenidoArray(array2);

	}

	/**
	 * Muestra el contenido de un array escribiendo los valores seoparados por
	 * espacio
	 * 
	 * @param array Array de números que queremos mostrar
	 */

	public static void muestraContenidoArray(int[] array) {
		for (int numero : array) {
			System.out.printf("%d ", numero);
		}
		System.out.println();
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
