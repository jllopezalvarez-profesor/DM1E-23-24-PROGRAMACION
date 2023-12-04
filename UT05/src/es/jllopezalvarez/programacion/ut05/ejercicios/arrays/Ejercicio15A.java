package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Scanner;

public class Ejercicio15A {
	private static final int CANTIDAD_NUMEROS = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creamos el array
		int[] numeros = new int[CANTIDAD_NUMEROS];

		// Variable para pedir el número al usuario.
		// Se define fuera del bucle porque hay que usarla en la condición del do-while
		int numero;
		do {
			// Leemos el número del usuario.
			// Como es do-while siempre se leerá al menos una vez.
			System.out.print("Introduce un número. Cero o menor que cero para terminar: ");
			numero = scanner.nextInt();
			// Si el número es menor o igual a cero hay que salir del bucle.
			// Así que sólo lo procesamos si el número es > 0
			if (numero > 0) {
				// Mostramos array antes de insertar el número.
				System.out.printf("Antes de insertar un %d\n", numero);
				mostrarNumeros(numeros);
				// Insertamos el número
				insertar(numeros, numero);
				// Mostramos array después de insertar
				System.out.printf("Despuésde insertar un %d\n", numero);
				mostrarNumeros(numeros);
			}

		} while (numero > 0);

	}

	private static void insertar(int[] numeros, int numUsuario) {
		// En esta versión se recorre el array hasta que se produce cualquiera de estas
		// situaciones:
		// A: El número que hay en la posición es cero. Eso quiere decir que está vacía.
		// En este caso se pone el nuevo número en esta posición. No hace falta
		// desplazar nada porque el resto del array son ceros (posiciones vacías).
		// B: El número que hay en la posición es mayor que el número que tenemos que
		// insertar. Esto quiere decir que hay que insertar en esa posición. Para esto,
		// hay que hacer antes un "hueco", desplazando todos los números hasta el final
		// del array una posición a la derecha.
		// C: Se llega al final del array sin que se cumpla ninguna de las anteriores.
		// Esto quiere decir que el array está lleno de números que son todos menores
		// que el que queremos insertar, así que hay que descartarlo.
		// En las situaciones A y B, una vez insertado, cambiamos un flag para que no se
		// siga recorriendo el array. Si siguiéramos sería un error porque insertaríamos
		// el nuevo número en todos los elementos del array desde la posición
		// encontrada.

		// Flag para que cuando se termine (A o B) se salga.
		boolean terminado = false;
		// Recorremos todo el array buscando una posición donde insertar
		for (int i = 0; i < numeros.length && !terminado; i++) {
			if (numeros[i] == 0) {
				// Encontrado un cero. Se cambia el cero por el valor que insertamos.
				numeros[i] = numUsuario;
				// Marcamos terminado a true para no seguir con el resto de posiciones.
				terminado = true;
			} else if (numeros[i] > numUsuario) {
				// Encontrado un número mayor que el que insertamos. Desplazamos todos los
				// valores desde esta posición hasta el fin del array una posición a la derecha.
				desplazaADerecha(numeros, i);
				// Una vez desplazados, ponemos el nuevo valor en su posición
				numeros[i] = numUsuario;
				// Marcamos terminado a true para no seguir con el resto de posiciones.
				terminado = true;
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
		// Recorremos el array mostrando cada número con un espacio a su derecha, para
		// que no se "peguen"
		for (int num : numeros) {
			System.out.printf("%d ", num);
		}
		System.out.println();
	}
	
	
	
}
