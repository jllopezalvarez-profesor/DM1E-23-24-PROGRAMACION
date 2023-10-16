package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo06BWhile {

	public static void main(String[] args) {
		// Demo de while para preguntar al usuario un número hasta que sea cero
		// O lo que es lo mismo, mientras sea distinto de cero
		int numero;
		Scanner sc = new Scanner(System.in);

		// Preguntamos al usuario el número. Mientras que el usuario no introduzca un
		// cero, seguiremos preguntando y mostrando el número introducido.
		// Tenemos que preguntar al usuario antes de llegar al while para que la
		// variable "numero" tenga valor. Esto se denomina a veces "lectura adelantada".
		System.out.print("Introduce un número. Cero para terminar: ");
		numero = sc.nextInt();
		// En el while se evalúa el valor de número. Si el usuario había introducido un
		// cero no se llega a entrar en el bucle, pero si es otro valor se entra.
		while (numero != 0) {
			// Mostramos el mensaje.
			System.out.printf("El número introducido es %d\n", numero);
			// Antes de volver al principio del bucle tenemos que vovler a preguntar al
			// usuario el siguiente número, para cambiar el valor de la variable, porque si
			// no, no cambia la condición y entramos en un bucle infinito.
			System.out.print("Introduce un número. Cero para terminar: ");
			numero = sc.nextInt();
		}
		// Cuando el usuario haya introducido un cero, llegaremos a este punto. 
		System.out.println("Fin del programa...");

	}

}
