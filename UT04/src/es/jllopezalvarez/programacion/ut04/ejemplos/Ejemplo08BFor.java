package es.jllopezalvarez.programacion.ut04.ejemplos;

public class Ejemplo08BFor {

	public static void main(String[] args) {
		// Demo de for para mostrar los números del 0 al 100 ambos incluidos, pero en
		// orden inverso, empezando en 100 y terminando en cero

		// Vamos a usar una variable externa al bucle para demostrar que al salir el
		// valor que tiene es el que provocó la salida del bucle
		int numero; // No se inicializa aquí, lo hacemos en el for

		// En este caso tenemos que ajustar tres cosas:
		// - La inicialización. En lugar de empezar en 0 empezamos en 100.
		// - La condición. Como vamos hacia abajo queremos terminar al llegar a cero.
		// - La iteración. En lugar de ir sumando 1 queremos que se reste uno
		// La variable ya estaba declarada, así que simplemente le damos valor inicial.
		for (numero = 100; numero >= 0; numero--) {
			// Mostramos el mensaje.
			System.out.printf("El número dentro del bucle vale ahora %d\n", numero);
		}

		// Cuando la variable "numero" es menor que cero, se continúa.
		// La variable en este caso sí es accesible desde fuera del bucle, porque la declaramos fuera.
		System.out.printf("El número tras salir del bucle vale %d\n", numero);
		System.out.println("Fin del programa...");

	}

}
