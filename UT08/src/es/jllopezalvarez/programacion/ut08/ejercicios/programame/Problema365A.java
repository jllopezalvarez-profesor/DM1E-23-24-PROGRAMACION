package es.jllopezalvarez.programacion.ut08.ejercicios.programame;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Versión "adaptada" del problema 365 de "Acepta el Reto" En lugar de buscar el
 * tiempo que tarda en pasar el hermano de Aitor, vamos a calcular el tiempo que
 * tarda en procesarse toda la cola. Esto se puede calcular sin usar colas, pero
 * lo hacemos con cola para practicar.
 */
public class Problema365A {

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
		
		// Ahora procesamos la cola para contar cuantos regalos hay
		int numTotalRegalos = 0;
		while (!cola.isEmpty()) {
			Integer numRegalosPrimero = cola.poll(); 
			// Nunca es null porque hemos comprobado que no esté vacía
			numTotalRegalos++;
			numRegalosPrimero--;
			if (numRegalosPrimero > 0) {
				cola.offer(numRegalosPrimero);
			}
		}
		int tiempoTotal = numTotalRegalos * 2;
	
		System.out.printf("El tiempo total invertido por Papa Noel es de %d minutos.\n", tiempoTotal);
	}
}
