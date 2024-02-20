package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio02.materiales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	private static final List<String> OPCIONES_VALIDAS = List.of("A", "B", "C", "D", "S");

	private static final int LONGITUD_DNI = 9;

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		List<Alumno> alumnos = new ArrayList<>();

		String opcion;

		do {
			opcion = pedirOpcionMenu();
			procesarOpcionMenu(alumnos, opcion);
		} while (!opcion.equals("S"));

	}

	private static void procesarOpcionMenu(List<Alumno> alumnos, String opcion) {
		String dni;

		switch (opcion) {
		case "A":
			// TODO Listar los alumnos en la lista. Mostrar sólo DNI, nombre y apellidos, no
			// todos los datos. Crear método si se considera que será más claro.
			break;
		case "B":
			Alumno alumno = pedirAlumnoUsuario();
			// TODO Añadir alumno a la lista de alumnos. Antes comprobar si el alumno
			// existe. Si existe avisar del problema, y no añadirlo. Se considera que existe
			// si hay otro alumno con el mismo DNI, aunque otros atributos no sean iguales.
			break;
		case "C":
			System.out.print("Introduce el DNI del alumno que quieres eliminar: ");
			dni = pedirDni();
			// TODO Eliminar el alumno de la lista. Si no existía el alumno con ese DNI,
			// avisar del problema. Se considera que existe si hay otro alumno con el mismo
			// DNI, aunque otros atributos no sean iguales.
			break;
		case "D":
			System.out.print("Introduce el DNI del alumno que quieres mostrar: ");
			dni = pedirDni();
			// TODO Mostrar TODOS los datos del alumno indicado. Si no existía el alumno con
			// ese DNI, avisar del problema. Se considera que existe si hay otro alumno con
			// el mismo DNI, aunque otros atributos no sean iguales.
			break;
		case "S":
			System.out.println("Gracias por usar el programa de gestión de alumnos.");
			break;
		default:
			// No debería pasar nunca. Lanzamos excepción si ocurre.
			throw new IllegalArgumentException("El valor de la opción seleccionada no es válido.");
		}
	}

	private static Alumno pedirAlumnoUsuario() {
		Alumno alumno = null;
		// TODO Pedir datos de alumno, crear y devolver nuevo objeto Alumno con los
		// datos recogidos.
		return alumno;
	}

	private static String pedirDni() {

		String dni;
		do {
			dni = scanner.nextLine();
			if (dni.length() != LONGITUD_DNI) {
				System.out.println("El DNI tiene que tener 9 caracteres de longitud.");
			}
		} while (dni.length() != LONGITUD_DNI);

		// TODO Pedir el DNI de un alumno para usarlo en los métodos de borrado o de
		// mostrar alumnos.
		return dni;
	}

	private static String pedirOpcionMenu() {
		String opcion = "";
		mostrarMenu();
		do {
			System.out.println("Elige la opción");
			opcion = scanner.nextLine().toUpperCase();
			if (!esOpcionValida(opcion)) {
				System.out.println("No es una opción váida. Vuelve a intentarlo.");
			}
		} while (!esOpcionValida(opcion));
		return opcion;
	}

	private static boolean esOpcionValida(String opcion) {
		return OPCIONES_VALIDAS.contains(opcion);
	}

	private static void mostrarMenu() {
		System.out.println("""
				A - Listar alumnos
				B - Añadir alumno
				C - Eliminar alumno
				D - Mostrar alumno
				S - Salir
				""");
	}
}
