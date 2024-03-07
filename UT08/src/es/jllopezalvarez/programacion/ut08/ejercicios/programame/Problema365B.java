package es.jllopezalvarez.programacion.ut08.ejercicios.programame;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Versión más parecida al problema 365 de "Acepta el Reto". Se busca
 * específicamente el tiempo que tardará en pasar por la cola (todas las veces
 * que sea necesario) una persona que empieza en cierta posición
 */
public class Problema365B {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos la cola (linkedList)
		Queue<Integer> cola = new LinkedList<>();

		System.out.print("Número de niños en la cola: ");
		int numNinios = scanner.nextInt();
		System.out.println("Introduce los regalos que tiene cada niño...");
		for (int i = 1; i <= numNinios; i++) {
			System.out.printf("Número de regalos de niño en posición %d (mayor que cero): ", i);
			cola.add(scanner.nextInt());
		}
		System.out.printf("Posición inicial del hermano de Aitor (entre 1 y %d): ", cola.size());
		int posicionHermano = scanner.nextInt() - 1; // Ajustamos el índice porque en Java enpieza en cero

		// Ahora procesamos la cola para contar cuantos regalos hay
		int numTotalRegalos = 0;
		boolean terminado = false;
		while (!cola.isEmpty() && !terminado) {
			Integer numRegalosPrimero = cola.poll();
			// Nunca es null porque hemos comprobado que no esté vacía
			numTotalRegalos++;
			numRegalosPrimero--;
			if (posicionHermano == 0) {
				// Es el hermano de Aitor.
				if (numRegalosPrimero == 0) {
					// Hemos terminado
					terminado = true;
				} else {
					cola.offer(numRegalosPrimero);
					posicionHermano = cola.size() - 1;
				}
			} else {
				posicionHermano--;
				if (numRegalosPrimero > 0) {
					cola.offer(numRegalosPrimero);
				}
			}
		}
		int tiempoTotal = numTotalRegalos * 2;

		System.out.printf("El tiempo total invertido por el hermano de Aitor es de %d minutos.\n", tiempoTotal);
	}
}
