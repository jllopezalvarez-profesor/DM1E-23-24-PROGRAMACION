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
 * 3. Extraer el primer (y único) caracter de la cadena de texto. Usar el 
 * método charAt de la clase String.
 * 4. Comprobar si el caracter extraído es una letra mayúscula. Usar el método 
 * isUpperCase de la clase Character. Este método devuelve false para números y
 * para caracteres especiales. Mostrar un mensaje indicando si es mayúscula.
 * 5.- Si no lo es, mostrar un mensaje indicándolo.
 *  
 * Este diseño soluciona el problema de la versión A, que no terminaba de funcionar 
 * correctamente con los números y caracteres especiales. 
 * 
 * ################################################################################
 */
public class Ejercicio06B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce una letra mayúscula: ");
		String cadena = scanner.nextLine();
		// Comprobar la longitud de la cadena (tiene que ser 1)
		if (cadena.length() != 1) {
			System.out.println("Tienes que escribir sólo una letra mayúscula, ni más ni menos.");
			System.out.printf("Lo que has escrito tiene %d caracteres.", cadena.length());
		} else {
			// Extraer el primer caracter
			char primeraLetra = cadena.charAt(0);
			// Comprobar si el caracter es una letra mayúscula.
			if (Character.isUpperCase(primeraLetra)){
				System.out.println("Gracias por escribir la letra en mayúsculas");
			} else {
				System.out.println("Lo que has escrito no está en mayúsculas");
			}
		}

	}

}
