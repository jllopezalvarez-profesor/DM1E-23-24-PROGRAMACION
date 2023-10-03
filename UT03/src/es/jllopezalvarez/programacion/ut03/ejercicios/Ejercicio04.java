package es.jllopezalvarez.programacion.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Variables:
		//double base, altura;

		System.out.print("Introduce la base del rectángulo: ");
		double base = scanner.nextDouble();
		
		System.out.print("Introduce la altura del rectángulo:\t");
		double altura = scanner.nextDouble();

		double perimetro = 2 * (base + altura);
		double area = base * altura;
		
		System.out.println("El perímetro del rectángulo es " + perimetro);
		System.out.println("El área del rectángulo es " + area);
		
	}
}
