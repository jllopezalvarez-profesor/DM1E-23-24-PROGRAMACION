package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * El director de una escuela está organizando un viaje de estudios, y requiere
 * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
 * de viajes por el servicio. La forma de cobrar es la siguiente: si son 100
 * alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos,
 * el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el
 * costo de la renta del autobús es de 4000 euros, sin importar el número de
 * alumnos. Realice un algoritmo que permita determinar el pago a la compañía de
 * autobuses y lo que debe pagar cada alumno por el viaje.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * El precio final del autobús depende del número de alumnos que participan.
 * - Si son 100 o más alumnos cada alumno paga 65 euros. 
 * - Si son entre 50 y 99 alumnos, cada alumno paga 70 euros. 
 * - Si son entre 30 y 49 alumnos, cada alumno paga 95.
 * 
 * El precio del autobús será lo que paga cada alumno * el número de alumnos. Si
 * son menor de 30 alumnos, el autobús vale 4000 euros, divido por el número de
 * alumnos sabemos cuanto paga cada uno. Datos de entrada: número de alumnos
 * (entero) Información de salida: Precio del autobús (entero), precio por
 * alumno (real) Variables: num_alumnos (entero), coste_autobus (entero),
 * coste_por_alumno (real)
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer número de alumnos 
 * 2. Si el número>=100 coste por alumno = 65 
 * 3. Si el número>=50 y <=99 coste por alumno = 70 
 * 4. Si el número>=30 y <=49 coste por alumno = 95 
 * 5. Si el número<30 coste por alumno = 4000 / número de alumnos 
 * 6. Si el número de alumnos > 0 (valor correcto) calculo 
 * coste_autobus=número alumnos * coste por alumno y 
 * muestro coste_autobus coste  por alumnos. 
 * 7. Si el número de alumno <= 0 mostrar mensaje de error
 * 
 * En esta versión, en lugar de ifs independientes se usa else.
 */

public class Ejercicio13B {
	private static final int COSTE_AUTOCAR_MENOS_30_ALUMNOS = 4000;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Leer número de alumnos
		System.out.println("Introduce la cantidad de alumnos en la excursión");
		int numAlumnos = scanner.nextInt();

		// Si el número de alumnos es mayor que cero, hacemos el cálculo y mostramos el
		// coste por alumno y el importe total. Si es menor o igual a cero, mostramos
		// error. Lo hacemos aquí porque si lo hacemos después del cálculo, se dividirá
		// por cero en el cálculo.
		if (numAlumnos > 0) {

			// Definimos varible para coste por alumno. La definimos double porque puede que
			// sea un cálculo con decimales, si son menos de 30.
			// En este diseño no hace falta dar un valor inicial al coste, porque siempre se
			// pasa por un if o por el else en el que se inicializa la variable.
			double costePorAlumno;

			// Miramos en qué rango cae el número de alumnos para calcular el coste/alumno
			// En esta versión se simplifican los if, porque cada else tiene implícito que
			// es lo contrario al if anterior, no hay que incluir esa condición.
			if (numAlumnos >= 100) {
				costePorAlumno = 65;
			} else if (numAlumnos >= 50) {
				costePorAlumno = 70;
			} else if (numAlumnos >= 30) {
				costePorAlumno = 95;
			} else {
				costePorAlumno = COSTE_AUTOCAR_MENOS_30_ALUMNOS / numAlumnos;
			}

			System.out.printf("El coste por alumno es %.2f\n", costePorAlumno);
			System.out.printf("El importe total es %.2f\n", costePorAlumno * numAlumnos);
		} else {
			System.out.println("El número de alumnos tiene que ser mayor que cero.");
		}

	}
}
