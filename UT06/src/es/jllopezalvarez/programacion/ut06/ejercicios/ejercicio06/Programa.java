package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		Persona p = crearPersona(sc);
		
		System.out.println(p);
		System.out.println(p.calcularImc());


	}

	private static Persona crearPersona(Scanner sc) {
		System.out.print("Introduce el nombre de la persona: ");
		String nombre = sc.nextLine();
		System.out.print("Introduce el DNI: ");
		String dni = sc.nextLine();
		System.out.print("Introduce la edad: ");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el peso: ");
		double peso = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la estatura: ");
		int estatura = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el sexo (HOMBRE/MUJER): ");
		Sexo s = Sexo.valueOf(sc.nextLine());
		Persona persona = new Persona(nombre, edad, dni, s, peso, estatura);
		return persona;
	}

}
