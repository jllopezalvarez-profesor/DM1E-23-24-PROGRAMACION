package es.jllopezalvarez.programacion.ut09.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	private static final int LIMITE_SUPERIOR = 500;
	private static final int LIMITE_INFERIOR = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numMenor;
		int numMayor;

		do {
			numMenor = pedirMenor(scanner, LIMITE_SUPERIOR);
			numMayor = pedirMayor(scanner, LIMITE_INFERIOR);
			if (numMenor > numMayor) {
				System.out.println("El número inferior tiene que ser mayor o igual que el superior.");
			}
		} while (numMenor > numMayor);

		int aleatorio = new Random().nextInt(numMenor, numMayor + 1);

		int numIntentos = jugar(scanner, numMenor, numMayor, aleatorio);

		System.out.printf("Enhorabuena, lo has conseguido en %d intentos", numIntentos);
	}

	/**
	 * 
	 * @param scanner scanner para interactuar con el usuario
	 * @param numMenor
	 * @param numMayor
	 * @param aleatorio
	 * @return número de intentos que ha necesitado el usuario
	 */
	private static int jugar(Scanner scanner, int numMenor, int numMayor, int aleatorio) {
		boolean encontrado = false;
		int numIntentos = 0;
		do {
			System.out.printf("Introduce un número entre %d y %d ambos incluidos\n", numMenor, numMayor);
			try {
				int intento = Integer.parseInt(scanner.nextLine());
				numIntentos++;
				if (intento < numMenor || intento > numMayor) {
					System.out.println("El número no está en el rango establecido.");
				} else {
					if (intento == aleatorio) {
						encontrado = true;
					} else if (intento > aleatorio) {
						System.out.println("El número buscado es menor que el intento");
					} else {
						System.out.println("El número buscado es mayor que el intento");
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("El intento no es un número válido");
				numIntentos++;
			}
		} while (!encontrado);
		return numIntentos;
	}

	private static int pedirMenor(Scanner scanner, int limiteSuperior) {
		int numero;
		do {
			System.out.println("Introduce el menor de los números");
			numero = pedirNumero(scanner);
			if (numero > limiteSuperior) {
				System.out.printf("El número menor no puede ser mayor que %d\n", limiteSuperior);
			}
		} while (numero > limiteSuperior);
		return numero;
	}

	private static int pedirMayor(Scanner scanner, int limiteInferior) {
		int numero;
		do {
			System.out.println("Introduce el mayor de los números");
			numero = pedirNumero(scanner);
			if (numero < limiteInferior) {
				System.out.printf("El número mayor no puede ser menor que %d\n", limiteInferior);
			}
		} while (numero < limiteInferior);
		return numero;
	}

	private static int pedirNumero(Scanner scanner) {
		int numero = 0;
		boolean ok = false;
		do {
			try {
				numero = Integer.valueOf(scanner.nextLine());
				ok = true;

			} catch (Exception e) {
				System.out.println("El número no es correcto, vuelve a intenatarlo.");
			}
		} while (!ok);
		return numero;
	}

}
