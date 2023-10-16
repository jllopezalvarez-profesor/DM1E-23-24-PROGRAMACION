package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Programa que lea una cadena de texto por teclado y compruebe si es una letra 
 * mayúscula. Debe comprobar que es de longitud 1 (sólo una letra), y que esta 
 * es mayúscula.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Pedimos por teclado una cadena y hay que comprobar que su longitud es de 1 
 * caracter, y que este caracter es una letra mayúscula
 * Datos de entrada: cadena (cadena)
 * Información de salida: Mensajes de longitud incorrecta o de que es mayúscula 
 * o no es mayúscula. 
 *   
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer la cadena
 * 2. Si la longitud es distinta de 1, mostrar un mensaje indicando que no 
 * ha escrito una sóla letra. En caso contrario, seguimos con paso 3.
 * 3. Si la cadena es igual a la cadena convertida en mayúsculas, indicar que 
 * la cadena está en mayúsculas. En caso contrario se mostará que no es correcta.
 * 
 * Este diseño, en el que comparamos una cadena con otra en mayúsculas, tiene un 
 * posible problema: ¿Y si el usuario introduce un número o un símbolo (porcentaje,
 * dólar, división, etc.)? En este caso lo que introduce no es una letra, así que 
 * estríctamente hablando el programa no sería correcto. Esto lo resolvemos en la 
 * versión B de este problema. 
 * 
 * ################################################################################
 */
public class Ejercicio06A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una letra mayúscula: ");
		String cadena = scanner.nextLine();

		// Comprobar la longitud de la cadena (tiene que ser 1)
		if (cadena.length() != 1) {
			System.out.println("Tienes que escribir sólo una letra mayúscula, ni más ni menos");
		} else {
			String cadenaEnMayusculas = cadena.toUpperCase();
			if (cadena.equals(cadenaEnMayusculas)) {
				System.out.println("Gracias por escribir la letra en mayúsculas");
			} else {
				System.out.println("Lo que has escrito no está en mayúsculas");
			}
		}

	}

}
