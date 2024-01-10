package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio02;

import java.util.Scanner;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio01.Fecha;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// se leen las personas y se introducen en el array
		Persona[] personas = leerPersonas(sc);

		if (numeroDePersonas(personas) > 0) {

			// se muestran todas las personas introducidas
			System.out.println("\nPersonas introducidas: ");
			mostrarPersonas(personas);

			// se muestra la persona de mayor edad
			System.out.println("\nPersona de mayor edad: ");
			System.out.println(personaMayorEdad(personas));

			// se muestran todas las personas que viven en Elche
			System.out.println("\nNúmero de personas que viven en Elche: " + cuantasPersonasVivenEn("Elche", personas));

			// se muestra el número de personas mayores de edad
			System.out.println("\nNúmero de personas mayores de edad : " + cuantasPersonasMayoresDeEdad(personas));
		}
		sc.close();
	}

	private static int cuantasPersonasMayoresDeEdad(Persona[] personas) {
		int cuantos = 0;
		for (Persona persona : personas) {
			if (persona.esMayorDeEdad())
				cuantos++;
		}
		return cuantos;
	}

	private static int cuantasPersonasVivenEn(String ciudadBuscada, Persona[] personas) {
		int cuantos = 0;

		for (Persona persona : personas) {
			if (persona.getCiudad().trim().equalsIgnoreCase(ciudadBuscada.trim()))
				cuantos++;
		}

		return cuantos;
	}

	private static Persona personaMayorEdad(Persona[] personas) {
		// Esto falla si personas es null o si es un array vacío, de longitud cero.
		Persona candidato = personas[0];
		for (Persona persona : personas) {
			if (candidato.getFechaNacimiento().esMayorQue(persona.getFechaNacimiento())) {
				candidato = persona;
			}
		}

		return candidato;
	}

	private static void mostrarPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			System.out.println(persona);
		}

	}

	private static int numeroDePersonas(Persona[] personas) {
		return personas.length;
	}

	private static Persona[] leerPersonas(Scanner sc) {
		System.out.println("¿Cuántas personas vas a introducir?");
		int numPersonas = Integer.parseInt(sc.nextLine());
		Persona[] personas = new Persona[numPersonas];
		for (int i = 0; i < personas.length; i++) {
			personas[i] = leerUnaPersona(sc);
		}
		return personas;
	}

	private static Persona leerUnaPersona(Scanner sc) {
		System.out.println("Nombre:");
		String nombre = sc.nextLine();
		System.out.println("Dirección:");
		String direccion = sc.nextLine();
		System.out.println("Código postal:");
		String codPostal = sc.nextLine();
		System.out.println("Ciudad:");
		String ciudad = sc.nextLine();
		System.out.println("Día de nacimiento:");
		int diaFechaNacimiento = Integer.parseInt(sc.nextLine());
		System.out.println("Mes de nacimiento:");
		int mesFechaNacimiento = Integer.parseInt(sc.nextLine());
		System.out.println("Año de nacimiento:");
		int anioFechaNacimiento = Integer.parseInt(sc.nextLine());

		Persona nuevaPersona = new Persona(nombre, direccion, codPostal, ciudad,
				new Fecha(diaFechaNacimiento, mesFechaNacimiento, anioFechaNacimiento));
		return nuevaPersona;
	}
}
