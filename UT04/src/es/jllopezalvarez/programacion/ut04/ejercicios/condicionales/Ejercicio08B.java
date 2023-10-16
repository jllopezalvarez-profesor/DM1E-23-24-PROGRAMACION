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
 * Esta versión usa ifs dentro de ifs, y variables para almacenar los valores 
 * ordenados, y así no tener que escribir tantos System.out.printf.
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer num1,num2,num3
 * 2. Crear variables para el mayor, el número medio y el menor
 * 3. Si num1>num2 y num1>num3, num1 es el mayor. Entonces:
 * 3.1. Si num2>num3, num2 es el medio y num3 es el menor, si no, al revés, num3 es 
 * el medio y num2 es el menor.
 * 4. Si no (3), si num2>num1 y num2>num3, num2 es el mayor. Entonces:
 * 4.1. Si num1>num3, num1 es el medio y num3 es el menor, si no, al revés, num3 es 
 * el medio y num1 es el menor.
 * 5. Si no (4), si num3>num1 y num3>num3, num3 es el mayor. Entonces:
 * 4.1. Si num1>num2, num1 es el medio y num2 es el menor, si no, al revés, num2 es 
 * el medio y num1 es el menor.
 * 5. Mostrar el mensaje con las variables que habáimos creado para los valores ordenados.
 * ################################################################################
 */
public class Ejercicio08B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = scanner.nextInt();
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = scanner.nextInt();
		System.out.print("Introduce el tercer número: ");
		int tercerNumero = scanner.nextInt();

		int mayor = 0, medio = 0, menor = 0;

		if ((primerNumero >= segundoNumero) && (primerNumero >= tercerNumero)) {
			mayor = primerNumero;
			if (segundoNumero >= tercerNumero) {
				medio = segundoNumero;
				menor = tercerNumero;
			} else {
				medio = tercerNumero;
				menor = segundoNumero;
			}
		} else if ((segundoNumero >= primerNumero) && (segundoNumero >= tercerNumero)) {
			mayor = segundoNumero;
			if (primerNumero >= tercerNumero) {
				medio = primerNumero;
				menor = tercerNumero;
			} else {
				medio = tercerNumero;
				menor = primerNumero;
			}
		} else if ((tercerNumero >= primerNumero) && (tercerNumero >= segundoNumero)) {
			mayor = tercerNumero;
			if (primerNumero >= segundoNumero) {
				medio = primerNumero;
				menor = segundoNumero;
			} else {
				medio = segundoNumero;
				menor = primerNumero;
			}
		}
		System.out.printf("Números ordenados: %d %d %d", mayor, medio, menor);
	}
}
