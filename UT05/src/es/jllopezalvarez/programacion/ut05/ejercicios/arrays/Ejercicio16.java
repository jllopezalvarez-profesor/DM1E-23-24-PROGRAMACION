package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

/**
 * 
 * <pre>
 * 	Crea un programa que 
    	• Cree un array de 10 números aleatorios entre 1000 y 2000.
    	• Invierta el array, de forma que el primer elemento se intercambie por el último, el segundo por el penúltimo, etc.
    	• Mostrará el array antes y después de invertirlo.
	Utiliza métodos en tu programa. Al menos:
    	• Un método para generar un número entero aleatorio entre dos valores (ambos incluidos) que recibe como parámetro. 
    	• Un método para generar el array de números aleatorios. Recibe la cantidad de números a generar, y devuelve un nuevo array con los números generados. Usa el método anterior para generar los números
    	• Un método para invertir el contenido del array. Este método devuelve void, por lo que modifica el array, no devuelve un nuevo array.
    	• Un método para mostrar el contenido del array. 
	Ejemplo: un array (los números en el ejemplo son menores que 10 por simplicidad):
		[1, 2, 5, 7, 8, 6, 5, 6, 8, 3]
	Se invierte y debe quedar 
		[3, 8, 6, 5, 6, 8, 7, 5, 2, 1]
 * </pre>
 *
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		int[] numeros = generarAleatorios(9, 5, 10);
		mostrarArray(numeros);
		invertirArray(numeros);
		mostrarArray(numeros);
	}

	public static void invertirArray(int[] numeros) {
		// Comprueba si es null. Los arrays son objetos, y pueden tener valor "null".
		// Si es null, al llamar, por ejemplo, al atributo "length", se produciría una
		// excepción NullPointerException
		if (numeros != null) {
			// Empieza por la izquierda al principio del array
			int izquierda = 0;
			// Por la derecha desde el final del array
			int derecha = numeros.length - 1;
			// Mientras que no se crucen...
			while (izquierda < derecha) {
				// Permutamos los valores de las dos posiciones.
				int aux = numeros[izquierda];
				numeros[izquierda] = numeros[derecha];
				numeros[derecha] = aux;
				// La izquierda avanza hacia delante y la derecha hacia atrás
				izquierda++;
				derecha--;
			}

			// Se puede hacer con un for, más compacto:
//			for (int izq = 0, dch = numeros.length - 1; izq < dch; izq++, dch--) {
//				// Permutamos los valores de las dos posiciones.
//				int aux = numeros[izq];
//				numeros[izq] = numeros[dch];
//				numeros[dch] = aux;
//			}
		}
	}

	public static void mostrarArray(int[] numeros) {
		// Muestra todos los números del array separándolos con espacio.
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}
		System.out.println();
	}

	public static int[] generarAleatorios(int cantidadNumeros, int minimo, int maximo) {
		// Crear el array del tamaño adecuado
		int[] numeros = new int[cantidadNumeros];
		// Recorrer el array (con un índice, porque si no no se puede cambiar)
		for (int i = 0; i < numeros.length; i++) {
			// En cada posición, poner el valor aleatorio usando el método que hemos creado
			// para obtener un número aleatorio
			numeros[i] = generaAleatorio(minimo, maximo);
		}
		// Devuelve el array generado
		return numeros;
	}

	public static int generaAleatorio(int minimo, int maximo) {
		// Esta es otra forma de generar números aleatorios en un rango.
		// Sería el equivalente a llamar al método nextInt de Random:
		// rnd.nextInt(minimo, maximo+1)
		int rango = maximo - minimo + 1;
		int numero = (int) (Math.random() * rango) + minimo;
		return numero;
	}

}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
