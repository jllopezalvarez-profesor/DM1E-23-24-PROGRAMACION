package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		leerNumerosUsuario(numeros);
		System.out.println(numeros);

		System.out.printf("Se han cargado %d valores en la colección.\n", numeros.size());

		System.out.printf("La media de los valores es %.2f\n", calcularMedia(numeros));
		int minimo = calcularMinimo(numeros);
		System.out.printf("El mínimo de los valores es %d\n", minimo);
		System.out.printf("El mínimo está en la posición %d\n", numeros.indexOf(minimo));
		int maximo = calcularMaximo(numeros);
		int posMaximo = numeros.indexOf(maximo);
		System.out.printf("El máximo de los valores es %d\n", maximo);
		System.out.printf("El máximo está en la posición %d\n", posMaximo);
		System.out.printf("El valor antes del máximo es %d\n", numeros.get(posMaximo-1) );
		System.out.printf("El valor después del máximo es %d\n", numeros.get(posMaximo+1) );

	}

	private static int calcularMaximo(Iterable<Integer> numeros) {
		int maximo = Integer.MIN_VALUE;
		for (Integer numero : numeros) {
			if (numero > maximo) {
				maximo = numero;
			}
		}
		return maximo;
	}

	private static int calcularMinimo(ArrayList<Integer> numeros) {
		int minimo = Integer.MAX_VALUE;
		for (Integer numero : numeros) {
			if (numero < minimo) {
				minimo = numero;
			}
		}
		return minimo;
	}

	private static double calcularMedia(List<Integer> numeros) {
		double suma = 0;		
		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}
		return suma / numeros.size();
	}

	
	private static double calcularMedia(Collection<Integer> numeros) {
		
		
		double suma = 0;
		for (Integer numero : numeros) {
			suma += numero;
		}
		return suma / numeros.size();
	}

	private static double calcularMedia(Iterable<Integer> numeros) {
		double suma = 0;
		int size = 0;
		for (Integer numero : numeros) {
			suma += numero;
			size++;
		}
		return suma / size;
	}

	private static void leerNumerosUsuario(Collection<Integer> numeros) {
		Integer numero;
		do {
			System.out.print("Introduce un número, -9999 para terminar.");
			numero = Integer.parseInt(scanner.nextLine());
			if (numero != -9999) {
				numeros.add(numero);
			}
		} while (numero != -9999);
	}

}
