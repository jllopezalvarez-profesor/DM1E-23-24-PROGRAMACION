package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Amplía el programa del ejercicio anterior para que pida también el año y mostrará:
 * - Si el año es menor que cero, o el mes no es un número entre 1 y 12 a.i., 
 * mostrará un error.
 * - El número de días del mes. Teniendo en cuenta que el año puede ser bisiesto.
 *  
 * ################################################################################
 * Análisis
 * ################################################################################
 * Leer un mes y año como entero e indicar los días que tiene el mes.
 * Para febrero tenemos que calcular si el año es bisiesto para usar 28 o 29.
 * Si el año es menor que cero mostramos error. Aañadimos "o igual" porque el cero
 * no es un año válido.
 * Si el número de mes introducido es incorrecto mostrar mensaje de error.
 * Datos de entrada: año (entero) y mes (entero)
 * Información de salida: cantidad de días del mes indicado o mensaje de error
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer número que representa el año.
 * 2. Si el número del año no es correcto, mostrar error.
 * 3. Leer número que representa el mes. Según el valor del mes:
 * 4. Si es el 1,3,5,7,8,10,12: tiene 31 días
 * 5. Si es el 4,6,9,11: tiene 30 días
 * 6. Si es el 2: depende del año. 
 * 6.1 Si es bisiesto tiene 29 días.
 * 6.2 Si no es bisiesto tiene 28 días.
 * 7. Si es otro número, mostrar mensaje de error
 * 
 * ################################################################################
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos el año
		System.out.print("Por favor, dime el año: ");
		int anio = scanner.nextInt();

		// Comprobamos si es un año válido
		if (anio <= 0) {
			System.out.println("ERROR: año incorrecto.");
		} else {
			// Preguntamos el mes
			System.out.print("¿De qué mes quieres saber el número de días (1 al 12)? ");
			int mes = scanner.nextInt();

			// Evaluamos los casos posibles
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("31 días");
				break;
			case 4, 6, 9, 11:
				System.out.println("30 días");
				break;
			case 2:
				// Calculamos si el año es bisisesto
				boolean esBisiesto = ((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0);
				// Usamos el operador ternario o asignación condicional para mostrar el
				// resultado.
				System.out.printf("%d días", esBisiesto ? 29 : 28);
				break;
			default:
				System.out.println("ERROR: mes incorrecto.");
				break;
			}
		}
	}
}
