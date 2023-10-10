package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo04Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dime el número de mes: ");
		int mes = scanner.nextInt();



		switch (mes) {
		case 1:
			// Si el usuario ha escrito 1, se ejecuta este bloque de sentencias
			System.out.println("Enero");
			// Al llegar al break, se salta al final del switch. El resto de casos se
			// ignoran.
			break;

		case 2:
			// Si el usuario ha escrito 2, se ejecuta este bloque de sentencias
			System.out.println("Febrero");
			// Como no hay break, se continúa con el siguiente caso.

		case 3:
			// Este bloque se ejecuta en dos situaciones:
			// - Que el usuario escriba 3
			// - Que el usuario escriba 2 y se llegue aquí porque no hay break en el 2
			System.out.println("Marzo");
			break;

		case 4:
		case 5:
			// Este bloque se ejecuta cuando el usuario ha escrito 4 o 5.
			// En realidad es igual que con el 2 y 3, solo que en este caso el bloque del 4
			// está totalmente vacío
			System.out.println("Pues abril o mayo, no estoy seguro");
			break;

		case 6, 7:
			// Este se ejecuta si el usuario ha escrito 6 o 7. Es funcionalmente equivalente
			// a cuando teníamos 4 o 5
			System.out.println("Pues junio o julio, no estoy seguro");
			break;

		default:
			// Este bloque se ejecuta si el usuario pone cualquier valor que no esté
			// controlado en otro caso del switch.
			// No necesita break porque ya es la última opción del switch. Si sigue llega al
			// final.
			System.out.println("Otro mes");
		}

	}

}
