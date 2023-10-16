package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Iterator;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Realiza un programa que use un bucle for y muestre todos los números del 10 al 
 * 20, sin incluir el 20. Una línea por cada número.
 *
 * ################################################################################
 * Análisis
 * ################################################################################
 * Usar un for para iterar desde el 10 al 19, porque el 20 no se incluye
 * Datos de entrada:no hay, sólo se usan literales
 * Información de salida: Los números del 10 al 19, uno por línea.
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Crear un bucle for, inicializando la variable iteradora a 1.
 * 	  La condición del bucle será <= 19 o < 20
 *    Se incrementa la variable en 1 en cada ciclo
 * 2. Dentro del bucle, mostrar el número
 *  
 * ################################################################################
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		for (int num = 10; num < 20; num++) {
			System.out.println(num);
		}
	}

}
