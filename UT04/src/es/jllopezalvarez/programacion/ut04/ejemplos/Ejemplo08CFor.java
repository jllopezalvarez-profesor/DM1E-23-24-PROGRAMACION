package es.jllopezalvarez.programacion.ut04.ejemplos;

public class Ejemplo08CFor {

	public static void main(String[] args) {
		// Demo de for para mostrar los números del 0 al 100 ambos incluidos, pero en
		// esta ocasión de siete en siete. Empezamos en 0, luego 7, luego 14, y así
		// hasta pasar de 100. Volvemos a declarar la variable fuera del for para poder
		// comprobar el valor tras la salida.
		int numero;
		
		// En este caso la iteración cambia, y se suman siete en cada paso.
		for (numero = 0; numero <= 100; numero += 7) {
			// Mostramos el mensaje.
			System.out.printf("El número dentro del bucle vale ahora %d\n", numero);
		}

		// Cuando la variable "numero" supera el valor 100, se continúa.
		// El valor de salida estará por encima de 100.
		System.out.printf("El número tras salir del bucle vale %d\n", numero);
		System.out.println("Fin del programa...");

	}

}
