package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio15B {

	private static final int CANTIDAD_NUMEROS = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creamos el array
		int[] numeros = new int[CANTIDAD_NUMEROS];

		// En esta versión hacemos "lectura adelantada"
		// Leemos el número del usuario antes del while.
		System.out.print("Introduce un número mayor que cero: ");
		int numero = Integer.parseInt(scanner.nextLine());
		// Mientras que el usuario haya escrito un número mayor que cero...
		while (numero > 0) {
			// Mostramos array antes de insertar el número.
			System.out.printf("Antes  de  insertar %d: ", numero);
			mostrarNumeros(numeros);
			// Insertamos el número
			insertarNumero(numero, numeros);
			// Mostramos array después de insertar
			System.out.printf("Despues de insertar %d: ", numero);
			mostrarNumeros(numeros);
			// Volvemos a preguntar al usuario el siguiente número.
			// Si no es mayor que cero se saldrá del bucle.
			System.out.print("Introduce un número mayor que cero: ");
			numero = Integer.parseInt(scanner.nextLine());
		}
	}

	private static void insertarNumero(int numero, int[] numeros) {
		// En esta versión se busca primero la posición del array en la que insertar el
		// número. Se hace con un bucle que no tiene código dentro. Simplemente interesa
		// iterar hasta que se cumple una de las condiciones:
		// A: se encuentra un cero
		// B: se encuentra un número mayor que el que se quiere insertar
		// C: se llega al final del array.
		// Una vez localiaza la posición, dependiendo de esta y de por qué se salió del
		// bucle "vacío":
		// Si se ha llegado al final (C) no se hace nada.
		// Si no, si se ha llegado a una posición vacía, con valor cero (A), se coloca
		// en esta el valor.
		// Por último, si se ha encontrado un valor mayor que el que queremos insertar,
		// se desplazan a la derecha los números, para hacer sitio, y luego se coloca el
		// valor en esa posición

		int posicionAInsertar = 0;

		// Bucle vacío para encontrar donde se inserta el valor.
		for (posicionAInsertar = 0; (posicionAInsertar < numeros.length) && (numeros[posicionAInsertar] != 0)
				&& (numeros[posicionAInsertar] <= numero); posicionAInsertar++)
			;

		// Si he llegado al final no hacemos nada, se descarta el número, así que sólo
		// hacemos algo si la posición a insertar es menor que la longitud del array, si
		// no nos hemos salido de él a recorrerlo.
		if (posicionAInsertar < numeros.length) {
			if (numeros[posicionAInsertar] == 0) {
				// Si hay un cero, estaba libre y puedo usar la posición
				numeros[posicionAInsertar] = numero;
			} else {
				// Si no había cero, es que es mayor y hay que desplazar para hacer sitio
				desplazaADerecha(numeros, posicionAInsertar);
				// Y tras desplazar se guarda el número.
				numeros[posicionAInsertar] = numero;
			}
		}
	}

	private static void desplazaADerecha(int[] numeros, int desdeDonde) {
		// Recorremos el array desde la última posición hasta la inicial que queremos
		// mover. Desde el final hacia el principio. Si no lo hacemos así no se puede,
		// se perderían valores al ir sobrescribiéndolos.
		for (int i = numeros.length - 1; i > desdeDonde; i--) {
			// En cada posición i sobrescribo el valor con el de la posición anterior, a su
			// izquierda, el de la posición i-1.
			numeros[i] = numeros[i - 1];
		}
	}

	private static void mostrarNumeros(int[] numeros) {
		// Recorremos el array mostrando cada número, y separándolos con una coma, para
		// que no se "peguen". Como no queremos que aparezca una coma al principio o al
		// final, mostramos comas delante de cada número, excepto el primer número en el
		// array
		for (int i = 0; i < numeros.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(numeros[i]);
		}
		System.out.println();
	}

}
