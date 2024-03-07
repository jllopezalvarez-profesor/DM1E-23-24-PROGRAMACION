package es.jllopezalvarez.programacion.ut08.ejercicios.programame;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Versión más parecida al problema 365 de "Acepta el Reto". Se busca
 * específicamente el tiempo que tardará en pasar por la cola (todas las veces
 * que sea necesario) una persona que empieza en cierta posición. Usamos un
 * objeto para controlar quién es el hermano de Aitor
 */
public class Problema365C {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos la cola (linkedList)
		LinkedList<Ninio> cola = new LinkedList<>();

		System.out.print("Número de niños en la cola: ");
		int numNinios = scanner.nextInt();
		System.out.println("Introduce los regalos que tiene cada niño...");
		for (int i = 1; i <= numNinios; i++) {
			System.out.printf("Número de regalos de niño en posición %d (mayor que cero): ", i);
			cola.add(new Ninio(scanner.nextInt()));
		}
		System.out.printf("Posición inicial del hermano de Aitor (entre 1 y %d): ", cola.size());
		int posicionHermano = scanner.nextInt() - 1; // Ajustamos el índice porque en Java enpieza en cero

		// Cambiar al ninio de la posicion posicionHermano para que sea el hermano de
		// Aitor
		cola.get(posicionHermano).setHermanoAitor(true);

		// Ahora procesamos la cola para contar cuantos regalos hay
		int numTotalRegalos = 0;
		boolean terminado = false;
		while (!cola.isEmpty() && !terminado) {
			Ninio primeroEnLaCola = cola.poll();
			// Nunca es null porque hemos comprobado que no esté vacía
			primeroEnLaCola.decrementarNumRegalos();
			numTotalRegalos++;
			if (primeroEnLaCola.tieneRegalosPendientes()) {
				cola.offer(primeroEnLaCola);
			} else if (primeroEnLaCola.esHermanoAitor()) {
				terminado = true;
			}
		}
		int tiempoTotal = numTotalRegalos * 2;

		System.out.printf("El tiempo total invertido por el hermano de Aitor es de %d minutos.\n", tiempoTotal);
	}

	private static class Ninio {
		private int numRegalosPendientes;
		private boolean hermanoAitor;

		public Ninio(int numRegalosPendientes) {
			this.numRegalosPendientes = numRegalosPendientes;
			this.hermanoAitor = false;
		}

		public boolean tieneRegalosPendientes() {
			return this.numRegalosPendientes > 0;
		}

		public int getNumRegalosPendientes() {
			return numRegalosPendientes;
		}

		public void setNumRegalosPendientes(int numRegalosPendientes) {
			this.numRegalosPendientes = numRegalosPendientes;
		}

		public boolean esHermanoAitor() {
			return hermanoAitor;
		}

		public void setHermanoAitor(boolean hermanoAitor) {
			this.hermanoAitor = hermanoAitor;
		}
		
		public void decrementarNumRegalos() {
			this.numRegalosPendientes--;
		}

	}
}
