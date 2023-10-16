package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;





/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Escribe un programa que pida una fecha (día, mes y año, por separado) y diga si 
 * es correcta. Ten en cuenta que hay años bisisestos. En un problema anterior 
 * hicimos una comprobación de si un año es bisiesto o no.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * Pedir un día,mes y año y comprobar si corresponde a una fecha correcta.
 * Para que una fecha sea correcta:
 * - El año no puede ser cero.
 * - El mes indicado debe ser mayor o igual que 1 y menor o igual a 12.
 * - El día debe ser mayor que 1 y menor que los días que tiene el mes indicado.
 * - Los días del mes de febrero dependerán de si el año es bisiesto o no.
 * Datos de entrada: una fecha, separada en tres componentes: día,mes y año (enteros)
 * Información de salida: Si la fecha es correcta o no.
 *   
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer dia,mes,anio
 * 2. Si el anio es cero, mensaje de fecha incorrecta
 * 3. Si el mes es distinto de 1 - 12, mensaje de fecha incorrecta
 * 4. Si el mes es 1,3,5,7,8,10,12 los dias_del_mes=31
 * 4.1. Si el dia del mes no está entre 1 y 31 a.i., mensaje de fecha incorrecta. 
 * 4.2. Si está, mensaje de fecha correcta
 * 5. Si el mes es 2,4,6,9,11 los dias_del_mes=30
 * 5.1. Si el dia del mes no está entre 1 y 30 a.i., mensaje de fecha incorrecta. 
 * 5.2. Si está, mensaje de fecha correcta
 * 6. Si el mes es 2 los dias_del_mes dependen del año.
 * 6.1 Si es año bisiesto, los días del mes son 29, si no, 28
 * 6.2. Si el dia del mes no está entre 1 y 28/29 a.i., mensaje de fecha incorrecta. 
 * 6.3. Si está, mensaje de fecha correcta
 *  
 * ################################################################################
 */
public class Ejercicio11A {

	private static final int DIAS_EN_MES_LARGO = 31;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dia: ");
		int dia = scanner.nextInt();
		System.out.print("Mes: ");
		int mes = scanner.nextInt();
		System.out.print("Año: ");
		int anio = scanner.nextInt();

		// Comprobar año
		if (anio == 0) {
			System.out.println("El año no es correcto");
		} else {
			// Comprobar mes
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				// Comprobar 31 días
				if (dia < 1 || dia > DIAS_EN_MES_LARGO) {
					System.out.println("El día no es correcto.");
				} else {
					System.out.println("La fecha es correcta.");
				}
				break;
			case 4, 6, 9, 11:
				// Comprobar 30 días
				if (dia < 1 || dia > 30) {
					System.out.println("El día no es correcto.");
				} else {
					System.out.println("La fecha es correcta.");
				}
				break;
			case 2:
				// Comprobar 28/29 días
				boolean esBisiesto = ((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0);
				final int diasFebrero = esBisiesto ? 29 : 28;
				if (dia < 1 || dia > diasFebrero) {
					System.out.println("El día no es correcto.");
				} else {
					System.out.println("La fecha es correcta.");
				}

				break;
			default:
				// Mes no válido
				System.out.println("El mes no es correcto");
				break;
			}
		}

	}

}
