package es.jllopezalvarez.programacion.ut05.ejercicios.arrays;

import java.util.Scanner;

/*
 * 	Escribe un programa que:
    • Preguntará la cantidad de números que vamos a procesar. Esta cantidad tiene que ser mayor que cero. Si el usuario introduce un número menor o igual a cero se mostrará un mensaje de error y se volverá a pedir el número. Se repetirá el proceso hasta que se introduzca un valor correcto.
    • Creará un array del tamaño especificado.
    • Pedirá al usuario que introduzca los números uno a uno, y los irá almacenando en el array.
    • Tomará los números que el usuario introdujo, y los mostrará en la consola. Primero desde el primero al último (el mismo orden en que los introdujo el usuario) y luego desde el último al primero.
	Usa al menos los siguientes métodos:
    • pedirCantidadNumeros. Pide al usuario la cantidad de números que se van a procesar. Se encarga de controlar que es un valor mayor que cero, y de repetir la pregunta hasta que el usuario introduzca el valor adecuado.
    • pedirNumeros. Dos opciones:
        ◦ Recibe un array y pide números al usuario para rellenarlo.
        ◦ Recibe el tamaño del array que queremos crear, y devuelve un array, de ese tamaño, lleno de números que se preguntan al usuario.
    • mostrarNumerosOrdenNormal. Muestra los números del array en el orden en que se introdujeron.
    • mostrarNumerosOrdenInverso. Muestra los números del array en el orden inverso al que se introdujeron.
    
    En esta versión  el método pedirNumeros devuelve un nuevo array creado con los valores
 * */

public class Ejercicio03B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pido al usuario cuántos números vamos a procesar
		int numElementos = pedirCantidadNumeros(scanner);

		// Pido los números al usuario y el resultado se
		// guarda en el array
		int[] numeros = pedirNumeros(numElementos, scanner);

		// Muestro en orden de inserción
		mostrarNumerosOrdenNormal(numeros);

		// Muestro en orden inverso
		mostrarNumerosOrdenInverso(numeros);
	}

	private static void mostrarNumerosOrdenInverso(int[] numeros) {
		for (int i = numeros.length - 1; i >= 0; i--) {
			int numero = numeros[i];
			System.out.printf("%d ", numero);
		}
		System.out.println();
	}

	private static void mostrarNumerosOrdenNormal(int[] numeros) {
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}
		System.out.println();
	}

//	private static void pedirNumeros(int[] numeros, Scanner scanner) {
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.printf("Introduce el número para la posición %d: ", i + 1);
//
//			numeros[i] = scanner.nextInt();
//		}
//	}

	private static int[] pedirNumeros(int numElementos, Scanner scanner) {
		int[] numeros = new int[numElementos];
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Introduce el número para la posición %d: ", i + 1);

			numeros[i] = scanner.nextInt();
		}
		return numeros;
	}

	private static int pedirCantidadNumeros(Scanner scanner) {
		int cantidad;
		do {
			System.out.print("¿Cuántos números quieres procesar? ");
			cantidad = scanner.nextInt();
			if (cantidad <= 0) {
				System.out.println("La cantidad no puede ser menor o igual a cero.");
			}
		} while (cantidad <= 0);

		return cantidad;
	}
}
