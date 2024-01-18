package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio07;

import java.util.Locale;
import java.util.Random;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio04.*;
import net.datafaker.Faker;

public class Programa {
	private static Random rnd = new Random();
	private static Faker faker = new Faker(new Locale("es"));

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[15];

		for (int i = 0; i < empleados.length; i++) {
			empleados[i] = generarEmpleadoAleatorio();
		}

		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}

		System.out.println("\nTecnicos");
		for (Empleado empleado : empleados) {
//			if (empleado instanceof Tecnico) {
			if (empleado.getClass() == Tecnico.class) {
				System.out.println(empleado);
			}
		}
		System.out.println("\nOficial");
		for (Empleado empleado : empleados) {
//			if (empleado instanceof Oficial) {
			if (empleado.getClass() == Oficial.class) {
				System.out.println(empleado);
			}
		}
		System.out.println("\nOperario");
		for (Empleado empleado : empleados) {
//			if (empleado instanceof Operario) {
			if (empleado.getClass() == Operario.class) {
				System.out.println(empleado);
			}
		}
		System.out.println("\nDirectivo");
		for (Empleado empleado : empleados) {
//			if (empleado instanceof Directivo) {
			if (empleado.getClass() == Directivo.class) {

				System.out.println(empleado);
			}
		}
		System.out.println("\nEmpleado");
		for (Empleado empleado : empleados) {
//			if (empleado instanceof Empleado) {
			if (empleado.getClass() == Empleado.class) {

				System.out.println(empleado);
			}
		}

	}

	private static Empleado generarEmpleadoAleatorio() {
		switch (rnd.nextInt(5)) {
		case 1:
			return new Empleado(faker.name().fullName());
		case 2:
			return new Operario(faker.name().fullName());
		case 3:
			return new Tecnico(faker.name().fullName());
		case 4:
			return new Oficial(faker.name().fullName());
		default:
			return new Directivo(faker.name().fullName());
		}
	}
}
