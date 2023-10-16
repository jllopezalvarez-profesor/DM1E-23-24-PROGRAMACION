package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido al 
 * lanzar un dado de seis caras y muestre por pantalla el número en letras (String)
 * de la cara opuesta al resultado obtenido.
 * - Nota 1: Caras opuestas de un dado de seis caras: 1-6, 2-5 y 3-4.
 * - Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
 * 								  mostrará el mensaje: “ERROR: número incorrecto.”.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Leer la cara del dado como entero y mostrar el número de la cara opuesta con letras.
 * Si el número introducido es incorrecto mostrar mensaje de error.
 * Datos de entrada: número de la cara (entero)
 * Información de salida: número de la cara opuesta (texto, String)
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer número de la cara. Según el valor introducido:
 * 2. Si es = 1 muestro "SEIS"
 * 4. Si es = 2 muestro "CINCO"
 * 5. Si es = 3 muestro "CUATO"
 * 6. Si es = 4 muestro "TRES"
 * 7. Si es = 5 muestro "DOS"
 * 8. Si es = 6 muestro "UNO"
 * 9. Si es otro número, mostrar mensaje de error
 * 
 * Este ejercicio usará un switch, pero en un futuro, cuando aprendamos arrays y 
 * luego colecciones (MAPS), veremos una forma de hacerlo mucho más breve en 
 * cuanto a extensión, y mucho más mantenible y adaptable
 * ################################################################################
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos la cara del dado
		System.out.print("¿Qué cara del dado ha salido? ");
		int cara = scanner.nextInt();

		// Evaluamos los casos posibles
		switch (cara) {
		case 1:
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("CINCO");
			break;
		case 3:
			System.out.println("CUATRO");
			break;
		case 4:
			System.out.println("TRES");
			break;
		case 5:
			System.out.println("DOS");
			break;
		case 6:
			System.out.println("UNO");
			break;
		default:
			System.out.println("ERROR: número incorrecto.");
			break;
		}
	}
}
