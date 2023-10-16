package es.jllopezalvarez.programacion.ut04.ejemplos;

public class Ejemplo07ADoWhile {

	public static void main(String[] args) {
		// Demo de while para mostrar los números del 0 al 100 ambos incluidos, pero
		// esta vez con do-while. La diferencia sólo se apreciará si se inicializa
		// número con un valor por encima de 100

		// Damos un valor inicial a la variable que vamos a ir cambiando en el bucle.
		int numero = 200;

		do {
			// En este caso no se evalúa el valor de número al entrar en el bucle, sino
			// al final del bucle. Así, si se hubiera inicializado con un valor mayor que
			// 100, en este caso sí entra en el bucle, a diferencia de lo que ocurre con
			// while.

			// Mostramos el mensaje.
			System.out.printf("El número dentro del bucle vale ahora %d\n", numero);
			// De nuevo, antes de volver al principio del bucle tenemos que cambiar el valor
			// de número. Si no, no cambia la condición y entramos en un bucle infinito.
			// En este caso incrementamos el valor en 1
			numero++;

			// Y ahora es cuando se evalúa la condición del bucle
		} while (numero <= 100); // Esto hay que terminarlo con un punto y coma

		// Cuando la variable "numero" supera el valor 100, se continúa.
		// La variable tendrá el valor que provocó la salida del bucle:
		System.out.printf("El número tras salir del bucle vale %d\n", numero);
		System.out.println("Fin del programa...");

	}

}
