package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos01referencias;

public class Ejemplo03Objetos {

	public static void main(String[] args) {

		// Ejemplo de parámetros de tipo objeto, en concreto un array. Muestra el valor
		// antes, durante y después de la invocación del método. Para mostrar el
		// contenido del array hemos creado un un método.

		// Creamos el array y damos un valor inicial
		int[] numeros = { 1, 3, 5, 7, 9, 3, 2, 4, 5, 6, 7, 2, 6, 8 };

		System.out.println("\n\nPrimera prueba: modificar el contenido de un array.");

		System.out.println("Array ANTES de invocar el método que cambia su contenido:");
		mostrarArray(numeros);

		// Llamamos al método que cambia el CONTENIDO del array
		duplicarValoresArray(numeros);

		System.out.println("Array DESPUÉS de invocar el método que cambia su contenido:");
		mostrarArray(numeros);

		// Prueba 2: cambiar por completo un array (sustituirlo por otro).
		System.out.println("\n\nSegunda prueba: modificar un array, creando uno nuevo.");

		System.out.println("Array ANTES de invocar el método que intenta cambiar el array por completo:");
		mostrarArray(numeros);

		// Llamamos al método que cambia el CONTENIDO del array
		quitarPosicionesImpares(numeros);

		System.out.println("Array DESPUÉS de invocar el método que intenta cambiar el array por completo:");
		mostrarArray(numeros);

		// Prueba 3: cambiar por completo un array (sustituirlo por otro), pero esta vez
		// correctamente.
		System.out.println("\n\nTercera prueba: modificar un array, creando uno nuevo, pero que se devuelve como valor de retorno del método.");

		System.out.println("Array ANTES de invocar el método que intenta cambiar el array por completo:");
		mostrarArray(numeros);

		// Llamamos al método que cambia el CONTENIDO del array
		numeros = quitarPosicionesImparesCorrecto(numeros);

		System.out.println("Array DESPUES de invocar el método que intenta cambiar el array por completo:");
		mostrarArray(numeros);

	}

	/**
	 * Muestra el contenido de un array, separado por comas
	 * 
	 * @param array array de enteros que queremos mostrar
	 */
	public static void mostrarArray(int[] array) {
		for (int num : array) {
			System.out.printf("%d ", num);
		}
		System.out.println();
	}

	/**
	 * Duplica los valores de todas las posiciones del array
	 * 
	 * @param numeros el array de números que queremos duplicar
	 */
	private static void duplicarValoresArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros[i] * 2;
		}
	}

	/**
	 * Recorta un array quitando las posiciones impares (1, 3, 5, etc.)
	 * 
	 * @param numeros el array de números que queremos recortar
	 */
	private static void quitarPosicionesImpares(int[] numeros) {
		// Necesitamos un array que tenga la mitad de posiciones que el array recibido.
		// Si el tamaño del array es impar, necesitaremos una posición más
		int tamanioNuevoArray = (numeros.length % 2 == 0) ? numeros.length / 2 : numeros.length / 2 + 1;
		int[] nuevoArray = new int[tamanioNuevoArray];
		for (int i = 0; i < numeros.length; i += 2) {
			nuevoArray[i / 2] = numeros[i];
		}
		numeros = nuevoArray;
		System.out.println(
				"Array DENTRO del método que intenta cambiar el array por completo, DESPUÉS de habelo modificado, pero antes de salir del método:");
		mostrarArray(numeros);
	}

	/**
	 * Recorta un array quitando las posiciones impares (1, 3, 5, etc.)
	 * 
	 * @param numeros el array de números que queremos recortar
	 * @return un nuevo array con las posiciones impares eliminadas
	 */
	private static int[] quitarPosicionesImparesCorrecto(int[] numeros) {
		// Necesitamos un array que tenga la mitad de posiciones que el array recibido.
		// Si el tamaño del array es impar, necesitaremos una posición más
		int tamanioNuevoArray = (numeros.length % 2 == 0) ? numeros.length / 2 : numeros.length / 2 + 1;
		int[] nuevoArray = new int[tamanioNuevoArray];
		for (int i = 0; i < numeros.length; i += 2) {
			nuevoArray[i / 2] = numeros[i];
		}
		return nuevoArray;
	}

}
