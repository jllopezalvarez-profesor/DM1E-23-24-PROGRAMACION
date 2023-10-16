package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribir un programa que pida los puntos centrales x1, y1, x2, y2 y los 
 * radios r1, r2 de dos circunferencias y las clasifique en uno de estos estados:
 * - exteriores
 * - tangentes exteriores
 * - secantes
 * - tangentes interiores
 * - interiores
 * - concéntricas
 * Necesitarás calcular la distancia entre los dos centros. Lo hicimos en un ejercicio de la UT 03.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Estudiar la página http://mimosa.pntic.mec.es/clobo/geoweb/circun3.htm 
 * Obtener los valores adecuados para las condiciones de esta página 

 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer x1,y1,r1
 * 2. Leer x2,y2,r2
 * 3. Calcular distancia entre los centros (ver ejercicio UT 03)
 * 4. Si distancia > suma de los radios mostrar "Las circunferencias son exteriores"
 * 5. Si distancia < suma de los radios Y distancia> que el valor absoluto de la 
 * resta de los radios mostrar "Las circunferencias son secantes"
 * 6. Si distancia > 0 y distancia < que el valor absoluto de la resta de los 
 * radios mostrar "Las circunferencias son interiores"
 * 7. Si distancia = suma de los radios mostrar "Las circunferencias son tangentes exteriores"
 * 8. Si distancia = que el valor absoluto de la resta de los radios mostrar 
 * "Las circunferencias tangentes interiores"
 * 9. Si distancia = 0 (mismo centro) mostrar "Las circunferencias son concéntricas"
 * 
 * ################################################################################
 * Valores de prueba para los distintos casos
 * ################################################################################
 * 	   Exteriores:
 *	       Circunferencia 1: Centro (0, 0), Radio 3
 *	       Circunferencia 2: Centro (8, 0), Radio 4
 *	   Secantes:
 *	       Circunferencia 1: Centro (0, 0), Radio 4
 *	       Circunferencia 2: Centro (8, 0), Radio 5
 *	   Interiores:
 *	       Circunferencia 1: Centro (0, 0), Radio 5
 *	       Circunferencia 2: Centro (3, 0), Radio 1
 *	   Tangentes Exteriores:
 *	       Circunferencia 1: Centro (0, 0), Radio 3
 *	       Circunferencia 2: Centro (5, 0), Radio 2
 *	   Tangentes Interiores:
 *	       Circunferencia 1: Centro (0, 0), Radio 4
 *	       Circunferencia 2: Centro (2, 0), Radio 2
 *	   Concéntricas:
 *	       Circunferencia 1: Centro (0, 0), Radio 4
 *	       Circunferencia 2: Centro (0, 0), Radio 6
 *	   Superpuestas (o la misma circunferencia):
 *	       Circunferencia 1: Centro (0, 0), Radio 5
 *	       Circunferencia 2: Centro (0, 0), Radio 5
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce X1: ");
		int x1 = scanner.nextInt();
		System.out.print("Introduce Y1: ");
		int y1 = scanner.nextInt();
		System.out.print("Introduce R1: ");
		int r1 = scanner.nextInt();

		System.out.print("Introduce X2: ");
		int x2 = scanner.nextInt();
		System.out.print("Introduce Y2: ");
		int y2 = scanner.nextInt();
		System.out.print("Introduce R2: ");
		int r2 = scanner.nextInt();

		double distanciaCentros = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double sumaRadios = r1 + r2;
		double diferenciaRadios = Math.abs(r2 - r1);

		if (distanciaCentros > sumaRadios) {
			System.out.println("Las circunferencias son exteriores");
		}
		if ((distanciaCentros < sumaRadios) && (distanciaCentros > diferenciaRadios)) {
			System.out.println("Las circunferencias son secantes");
		}
		if ((distanciaCentros > 0) && (distanciaCentros < diferenciaRadios)) {
			System.out.println("Las circunferencias son interiores");
		}
		if (distanciaCentros == sumaRadios) {
			System.out.println("Las circunferencias son tangentes exteriores");
		}
		if (distanciaCentros == diferenciaRadios) {
			System.out.println("Las circunferencias son tangentes interiores");
		}
		if (distanciaCentros == 0) {
			System.out.println("Las circunferencias son concéntricas");
		}
	}
}
