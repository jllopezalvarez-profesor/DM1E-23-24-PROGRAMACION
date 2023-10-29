package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Arrays;

public class Ejemplo10Metodos {
	public static void main(String[] args) {

		// System.out.println(Arrays.toString(args));

		int a = 3;
		int b = 5;

		int c = a + b;

		sumarDosNumerosYMostrarresultado(a, b);
		sumarDosNumerosYMostrarresultado(3, 7);

		int resultado = sumarDosNumerosPorDosYDevolverResultado(3, 7);
		
		
		System.out.println(resultado);
		
//		String valor = sumarDosNumerosPorDosYDevolverResultado(a, b);

	}

	private static void sumarDosNumerosYMostrarresultado(int numeroA, int numeroB) {
		
		System.out.println(numeroA + numeroB);
	}

	private static int sumarDosNumerosPorDosYDevolverResultado(int numeroA, int numeroB) {
		int num = numeroA + numeroB;
		num *= 2;
		return num;
	}

	private static double sumarDosNumerosPorDosYDevolverResultado(double numeroA, int numeroB) {
		double num = numeroA + numeroB;
		num *= 2;
		return num;
	}
	
	private static double sumarDosNumerosPorDosYDevolverResultado(int numeroA, double numeroB) {
		double num = numeroA + numeroB;
		num *= 2;
		return num;
	}

	
	private static void muestraNumSiParMayorQue3YMenorQue7(int numero) {
		// Muestra el número en consola sólo si es par, mayor que tres y menor que
		// siete, todo a la vez;
		
		if (numero%2 == 0) {
			if (numero >3) {
				if (numero <7) {
					System.out.println(numero);
				}
			}
		}
		
		if (numero % 2 != 0) {
			return;
		}
		if (numero <= 3) {
			return;
		}
		if (numero >= 7) {
			return;
		}
		System.out.println(numero);
	}

}
