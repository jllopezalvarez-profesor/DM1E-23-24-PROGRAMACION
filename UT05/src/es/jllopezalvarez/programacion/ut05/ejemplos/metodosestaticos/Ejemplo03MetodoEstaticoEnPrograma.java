package es.jllopezalvarez.programacion.ut05.ejemplos.metodosestaticos;

/**
 * 
 * Ejemplo de declaración y uso de un método estático dentro de la misma clase
 * que el programa principal (método main). Esto permite crear y probar métodos
 * sin tener que crear nuevas clases. Desde el método estático "main" llamamos
 * al método estático "factorial". Como están los dos métodos en la misma clase,
 * puede omitirse el nombre de la clase, en este caso
 * "Ejemplo03MetodoEstaticoEnPrograma".
 *
 */
public class Ejemplo03MetodoEstaticoEnPrograma {

	public static void main(String[] args) {

		// Podemos llamar al método estático con el nombre de clase.
		int resultado = Ejemplo03MetodoEstaticoEnPrograma.factorial(3);
		System.out.printf("El factorial de 3 es %d.\n", resultado);

		// Pero como main y el método están en la misma clase, no es necesario usar el
		// nombre de clase
		resultado = factorial(4);
		System.out.printf("El factorial de 4 es %d.\n", resultado);
		
		System.out.println(sumar(3, 5));
	}

	/**
	 * Calcula el factorial de un número entero.
	 * 
	 * @param numero valor del que queremos calcular el factorial
	 * @return el factorial de número.
	 */
	public static int factorial(int numero) {
		int producto = 1;
		while (numero > 0) {
			producto *= numero--;
		}
		return producto;
	}

	public static int sumar(int a, int b) {
		return a + b;
	}

}
