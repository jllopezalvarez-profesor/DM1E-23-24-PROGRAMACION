package es.jllopezalvarez.programacion.ut04.ejemplos;

public class Ejemplo06AWhile {

	public static void main(String[] args) {
		// Demo de while para mostrar los números del 0 al 100 ambos incluidos

		// Damos un valor inicial a la variable que vamos a ir cambiando en el bucle.
		int numero = 0;

		// En el while se evalúa el valor de número. Si se hubiera inicializado con un
		// valor mayor que 100 no entraría en el bucle. Usamos menor o igual (<=) porque
		// queremos que el 100 también se muestre.
		while (numero <= 10) {
			// Mostramos el mensaje.
			System.out.printf("El número dentro del bucle vale ahora %d\n", numero);
			// Antes de volver al principio del bucle tenemos que cambiar el valor de
			// número. Si no, no cambia la condición y entramos en un bucle infinito.
			// En este caso incrementamos el valor en 1
			numero++;
			// Ojo, otros cambios de valor también generan un bucle infinito. En este caso,
			// si hacemos numero-- nunca se llega a 100 y también sería un bucle infinito.
		}
		// Cuando la variable "numero" supera el valor 100, se continúa.
		// La variable tendrá el valor que provocó la salida del bucle:
		System.out.printf("El número tras salir del bucle vale %d\n", numero);
		System.out.println("Fin del programa...");

	}

}
