package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribe un programa que pida tres números y los muestre ordenados (de mayor a menor);
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Pedimos por teclado tres números, se comparan para mostrarlos ordenados.
 * Datos de entrada: num1, num2, num3 (entero)
 * Información de salida: Los tres número ordenados de mayor a menor
 *   
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer num1,num2,num3
 * 2. Si num1>num2>num3 mostrar num1,num2,num3
 * 3. Si no, si num2>num1>num3 mostrar num2,num1,num3
 * 4. Si no, si num2>num3>num1 mostrar num2,num3,num1
 * 5. Si no, si num3>num2>num1 mostrar num3,num2,num1
 * 6. Si no, si num3>num1>num2 mostrar num3,num1,num2
 *  
 * ################################################################################
 */
public class Ejercicio08A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();
		System.out.print("Introduce el tercer número: ");
		int tercerNumero = scanner.nextInt();

		if ((primerNumero >= segundoNumero) && (primerNumero >= tercerNumero) && (segundoNumero >= tercerNumero)) {
			System.out.printf("Números ordenados: %d %d %d", primerNumero, segundoNumero, tercerNumero);
		} else if ((primerNumero >= segundoNumero) && (primerNumero >= tercerNumero)
				&& (segundoNumero < tercerNumero)) {
			System.out.printf("Números ordenados: %d %d %d", primerNumero, tercerNumero, segundoNumero);
		} else if ((segundoNumero >= primerNumero) && (segundoNumero >= tercerNumero)
				&& (primerNumero >= tercerNumero)) {
			System.out.printf("Números ordenados: %d %d %d", segundoNumero, primerNumero, tercerNumero);
		} else if ((segundoNumero >= primerNumero) && (segundoNumero >= tercerNumero)
				&& (primerNumero < tercerNumero)) {
			System.out.printf("Números ordenados: %d %d %d", segundoNumero, tercerNumero, primerNumero);
		} else if ((tercerNumero >= primerNumero) && (tercerNumero >= segundoNumero)
				&& (primerNumero >= segundoNumero)) {
			System.out.printf("Números ordenados: %d %d %d", tercerNumero, primerNumero, segundoNumero);
		} else if ((tercerNumero >= primerNumero) && (tercerNumero >= segundoNumero)
				&& (primerNumero < segundoNumero)) {
			System.out.printf("Números ordenados: %d %d %d", tercerNumero, segundoNumero, primerNumero);
		}

	}
}
