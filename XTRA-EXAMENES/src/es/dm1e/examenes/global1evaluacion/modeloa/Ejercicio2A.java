package es.dm1e.examenes.global1evaluacion.modeloa;

import java.util.Scanner;

public class Ejercicio2A {

	private static final int MIN_NOTAS = 0;
	private static final int MAX_NOTAS = 10;
	private static final int LIMITE_SOBRESALIENTE = 9;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántos alumnos hay en clase? ");
		int numAlumnos = scanner.nextInt();

		int[] notas = pedirNotasTodosAlumnos(numAlumnos, scanner);
		int notaMasAlta = buscarNotaMasAlta(notas);
		int notaMasBaja = buscarNotaMasBaja(notas);
		double notaMedia = calcularNotaMedia(notas);
		int numSobresalientes = contarSobresalientes(notas);

		System.out.printf("Mejor nota: %d\n", notaMasAlta);
		System.out.printf("Peor nota: %d\n", notaMasBaja);
		System.out.printf("Nota media: %.2f\n", notaMedia);
		System.out.printf("Número de sobresalientes: %d\n", numSobresalientes);

	}

	private static int pedirNotaAlumno(Scanner scanner) {
		int nota;

		do {
			System.out.printf("Introduce la nota del alumno (%d - %d): ", MIN_NOTAS, MAX_NOTAS);
			nota = scanner.nextInt();
			if (nota < MIN_NOTAS || nota > MAX_NOTAS) {
				System.out.println("Nota no válida. Vuelve a intentarlo.");
			}
		} while (nota < MIN_NOTAS || nota > MAX_NOTAS);
		return nota;
	}

	private static int[] pedirNotasTodosAlumnos(int numAlumnos, Scanner scanner) {
		int[] notas = new int[numAlumnos];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = pedirNotaAlumno(scanner);
		}
		return notas;
	}

	private static int buscarNotaMasAlta(int[] notas) {
		int notaMasAlta = notas[0];
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			if (nota > notaMasAlta) {
				notaMasAlta = nota;
			}
		}
		return notaMasAlta;
	}

	private static int buscarNotaMasBaja(int[] notas) {
		int notaMasBaja = notas[0];
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			if (nota < notaMasBaja) {
				notaMasBaja = nota;
			}
		}
		return notaMasBaja;
	}

	private static double calcularNotaMedia(int[] notas) {
		int suma = 0;
		int cuenta = 0;
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			suma += nota;
			cuenta++;
		}
		return (double) suma / cuenta;
	}

	private static int contarSobresalientes(int[] notas) {
		int cuenta = 0;
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			if (nota >= LIMITE_SOBRESALIENTE) {
				cuenta++;
			}
		}
		return cuenta;
	}

}
