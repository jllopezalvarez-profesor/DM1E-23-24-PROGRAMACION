package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * La asociación de vinicultores tiene como política fijar un precio inicial al
 * kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
 * Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se
 * requiere determinar cuánto recibirá un productor por la uva que entrega en un
 * embarque, considerando lo siguiente: si es de tipo A, se le cargan 20
 * céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de
 * tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50
 * céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la
 * ganancia obtenida.
 *
 * ################################################################################
 * Análisis
 * ################################################################################
 * El incremento o decremento del precio por kilo se calcula según el tamaño y
 * el tipo de la uva.
 * Datos de entrada: tipo,tamaño (una letra), kilos (entero) 
 * Información de salida: Incremento o decremento sobre el precio inicial (en euros).
 * Mostrará error si el usuario introduce algo incorrecto.
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer kilos del envío.
 * 2. Leer tipo
 * 3. Leer el tamaño
 *  4. Si tipo no es "A" o "B" devolver mensaje de error.
 *  5. Si el tamaño no es "1" o "2" devolver mensaje d error.
 *  6. Si tipo es "A" y tamaño es "1" el incremento es de 20 céntimos.
 *  7. Si tipo es "A" y tamaño es "2" el incremento es de 30 céntimos.
 *  8. Si tipo es "B" y tamaño es "1" el incremento es de -30 céntimos (se resta).
 *  9. Si tipo es "B" y tamaño es "2" el incremento es de -50 céntimos (se resta).
 *  10. Beneficio final = kilos * incremento. Puede ser negativo ( en los tipos B) 
 *  11. Muestro precio final/100 euros (se sumaban céntimos)
 * ################################################################################
 */

public class Ejercicio12 {

	// Trabajamos sólo con el concepto de beneficio y las pérdidas las consideramos
	// beneficios negativos. Así no duplicamos código
	private static final int INCREMENTO_A_TAM_1 = 20;
	private static final int INCREMENTO_A_TAM_2 = 30;
	private static final int INCREMENTO_B_TAM_1 = -30;
	private static final int INCREMENTO_B_TAM_2 = -50;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántos kilos hay en el emabarque? ");
		int kilos = scanner.nextInt();
		scanner.nextLine(); // Consumir el \n que queda en el buffer

		System.out.print("¿Qué tipo de uva (A/B)? ");
		String tipoUva = scanner.nextLine().toUpperCase(); // Pasamos a mayúsculas para que el switch funcione con
															// minúsculas
		System.out.print("¿Qué tamaño (1/2)? ");
		int tamanioUva = scanner.nextInt();

		// Validamos tipo de uva.
		if (!(tipoUva.equals("A") || tipoUva.equals("B"))) {
			System.out.println("El tipo de uva no es correcto");
			// Validamos tamaño
		} else if (tamanioUva != 1 && tamanioUva != 2) {
			System.out.println("El tamaño de la uva no es correcto");
		} else {
			int incremento = 0;
			// Primero bifurcamos código en función del tipo de uva.
			switch (tipoUva) {
			case "A":
				// Después en función del tamaño.
				incremento = (tamanioUva == 1) ? INCREMENTO_A_TAM_1 : INCREMENTO_A_TAM_2;
				break;
			case "B":
				// En función del tamaño
				incremento = (tamanioUva == 1) ? INCREMENTO_B_TAM_1 : INCREMENTO_B_TAM_2;
				break;
			}

			// Hacemos el cálculo y dividimos por 100 para pasar de céntimos a euros.
			int beneficio = (kilos * incremento) / 100;

			System.out.printf("El beneficio / pérdida en el envío es %d euros\n", beneficio);

		}
	}
}