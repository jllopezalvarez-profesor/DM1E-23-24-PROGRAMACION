package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * Una compañía de transporte internacional tiene servicio en algunos países de 
 * América del Norte, América Central, América del Sur, Europa y Asia. 
 * El costo por el servicio de transporte se basa en el peso del paquete y la zona 
 * a la que va dirigido. Lo anterior se muestra en la tabla:
 * Zona		Ubicación			Costo/gramo
 * 1		América del Norte	24.00 euros
 * 2		América Central		20.00 euros
 * 3		América del Sur		21.00 euros
 * 4		Europa				10.00 euros
 * 5		Asia				18.00 euros
 * Parte de su política implica que los paquetes con un peso superior a 5 kg no 
 * son transportados, por cuestiones de logística y de seguridad. Realice un 
 * algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, 
 * el rechazo de la entrega.
 * 
 * ################################################################################
 * Análisis
 * ################################################################################
 * El costo por el servicio de transporte se basa en el peso del paquete (gramos)
 * y la zona a la que va dirigido.
 * Paquetes de más de 5 kg no se transportan.
 * Datos de entrada:peso en gramos (entero), zona (entero) del 1 al 5
 * Información de salida: Precio del transporte (real), o mensaje indicando que 
 * se rechaza la entrega. 
 *  
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer peso
 * 2. Si no es correcto >0 y <5000 mostrar mensaje de error
 * 3. Si es correcto:
 * 4. Leer zona
 * 5. Según el valor de la zona calculo el coste del transporte.
 * 6. Mostrar el coste de transporte.
 * 
 * ################################################################################
 */
public class Ejercicio19 {
	// Constantes para los importes por zona
	private static int COSTE_GRAMO_ZONA_1 = 24;
	private static int COSTE_GRAMO_ZONA_2 = 20;
	private static int COSTE_GRAMO_ZONA_3 = 21;
	private static int COSTE_GRAMO_ZONA_4 = 10;
	private static int COSTE_GRAMO_ZONA_5 = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos el peso
		System.out.print("¿Peso del paquete (en gramos)?: ");
		int peso = scanner.nextInt();

		// Comprobamos el peso
		if (peso <= 0) {
			System.out.println("El peso no puede ser menor o igual que cero.");
		} else if (peso > 5000) {
			System.out.println("El peso no puede ser mayor que cinco kilos.");
		} else {
			// El peso es válido. Preguntamos la zona.
			System.out.println("Posibles destinos:");
			System.out.println("\t1.- América del Norte");
			System.out.println("\t2.- América Central");
			System.out.println("\t3.- América del Sur");
			System.out.println("\t4.- Europa");
			System.out.println("\t5.- Asia");
			System.out.print("¿Zona de destino (1-5)? ");
			int zona = scanner.nextInt();

			// Hacemos un switch para la zona, y si no es una válida mostramos un mensaje de
			// error.
			switch (zona) {
			case 1:
				System.out.printf("El coste del envío es %d\n", peso * COSTE_GRAMO_ZONA_1);
				break;
			case 2:
				System.out.printf("El coste del envío es %d\n", peso * COSTE_GRAMO_ZONA_2);
				break;
			case 3:
				System.out.printf("El coste del envío es %d\n", peso * COSTE_GRAMO_ZONA_3);
				break;
			case 4:
				System.out.printf("El coste del envío es %d\n", peso * COSTE_GRAMO_ZONA_4);
				break;
			case 5:
				System.out.printf("El coste del envío es %d\n", peso * COSTE_GRAMO_ZONA_5);
				break;
			default:
				System.out.println("Zona no válida");
				break;
			}
		}
	}
}
