package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Iterator;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Realiza un programa que use un bucle while y muestre todos los números del 10 al 
 * 20, sin incluir el 20. Una línea por cada número. 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Usar un while para iterar desde el 10 al 19, porque el 20 no se incluye
 * Datos de entrada:no hay, sólo se usan literales
 * Información de salida: Los números del 10 al 19, uno por línea.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Crear una variable int inicializada a 10
 * 2. Crear un bucle while. La condición del bucle será <= 19 o < 20
 * 3. Dentro del bucle, mostrar el número
 * 4. Se incrementa la variable en 1 en cada ciclo
 *  
 * ################################################################################
 */
public class Ejercicio22 {
	public static void main(String[] args) {
		int num = 10;
		while (num < 20) {
			System.out.println(num);
			num++;
		}
	}

}
