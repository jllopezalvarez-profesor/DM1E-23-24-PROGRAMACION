package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y 
 * muestre el mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es 
 * mayor o igual a dieciocho y el sexo es ‘F’. 
 * En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe imprimir ‘POSIBLE’. 
 * Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Pedimos por teclado dos números: nota y edad y un carácter sexo.
 * Se muestra "ACEPTADA" si nota>=5, edad>=18 y el sexo es femenino.
 * Si se cumple las mismas condiciones pero con el sexo masculino -> "POSIBLE"
 * En caso contrario se muestra "NO ACEPTADA"
 * Datos de entrada: nota(entero o doble), edad (entero) y sexo (cadena)
 * Información de salida: Mensaje de información
 *   
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer la nota, la edad y el sexo
 * 2. Si nota>=5, la edad>=18, y el sexo=="F" mostrar "ACEPTADA"
 * 3. Si no, si la nota>=5, la edad>=18, y el sexo=="M" mostrar "POSIBLE"
 * 4. En caso contrario, mostrar "NO ACEPTADA"
 *  
 * ################################################################################
 */
public class Ejercicio07A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce tu nota: ");
		int nota = scanner.nextInt();
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		scanner.nextLine(); // Hacemos nextLine para consumir el \n que no consume nextInt
		System.out.print("Introduce tu sexo: ");
		String sexo = scanner.nextLine();

		if ((edad >= 18) && (nota >= 5) && sexo.equals("F")) {
			System.out.println("ACEPTADA");
		} else if ((edad >= 18) && (nota >= 5) && sexo.equals("M")) {
			System.out.println("POSIBLE");
		} else {
			System.out.println("NO ACEPTADA");
		}

	}
}
