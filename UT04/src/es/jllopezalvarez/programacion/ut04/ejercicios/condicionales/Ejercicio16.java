package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
 * correspondiente en letras. Si introducimos otro número nos mostrará un mensaje 
 * indicando que el número no es válido.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Leer un día de la semana como número y mostrar el día que corresponde.
 * Si el número introducido es incorrecto mostrar mensaje de error.
 * Datos de entrada: día (entero)
 * Información de salida: nombre del día
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer número que representa el día de la semana. Según el valor introducido:
 * 2. Si es = 1 muestro "LUNES"
 * 4. Si es = 2 muestro "MARTES"
 * 5. Si es = 3 muestro "MIÉRCOLES"
 * 6. Si es = 4 muestro "JUEVES"
 * 7. Si es = 5 muestro "VIERNES"
 * 8. Si es = 6 muestro "SÁBADO"
 * 9. Si es = 7 muestro "DOMINGO"
 * 10. Si es otro número, mostrar mensaje de error
 * 
 * Prácticamente igual que el 15
 * ################################################################################
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos el día de la semana
		System.out.print("¿Qué día de la semana (1 al 7)? ");
		int diaSemana = scanner.nextInt();

		// Evaluamos los casos posibles
		switch (diaSemana) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIÉRCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SÁBADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("ERROR: día incorrecto.");
			break;
		}
	}
}
