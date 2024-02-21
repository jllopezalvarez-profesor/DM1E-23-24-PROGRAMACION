package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio02.solucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Programa {
	private static final List<String> OPCIONES_VALIDAS = List.of("A", "B", "C", "D", "S");

	private static final int LONGITUD_DNI = 9;

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
//		Alumno a = new Alumno("121312", "Nombre", "Apellido", CicloFormativo.ASIR, Curso.PRIMERO, LocalDate.parse("2000-05-01"));
//		Alumno b = new Alumno("121312", "Nombre", "Apellido", CicloFormativo.ASIR, Curso.PRIMERO, LocalDate.parse("2000-05-01"));
//		System.out.println(a.equals(b));
//		b= a;
//		System.out.println(a.equals(b));
		

		List<Alumno> alumnos = new ArrayList<>();

		String opcion;

		do {
			opcion = pedirOpcionMenu();
			procesarOpcionMenu(alumnos, opcion);
		} while (!opcion.equals("S"));

	}

	private static void procesarOpcionMenu(List<Alumno> alumnos, String opcion) {
		String dni;
		Alumno alumno;

		switch (opcion) {
		case "A":
			// TODO Listar los alumnos en la lista. Mostrar sólo DNI, nombre y apellidos, no
			// todos los datos. Crear método si se considera que será más claro.
			listarAlumnos(alumnos);
			break;
		case "B":
			alumno = pedirAlumnoUsuario();
			// TODO Añadir alumno a la lista de alumnos. Antes comprobar si el alumno
			// existe. Si existe avisar del problema, y no añadirlo. Se considera que existe
			// si hay otro alumno con el mismo DNI, aunque otros atributos no sean iguales.
			if (alumnos.contains(alumno)) {
				System.out.println("Ya hay un alumno con este DNI en la lista.");
			} else {
				alumnos.add(alumno);
			}
			break;
		case "C":
			System.out.print("Introduce el DNI del alumno que quieres eliminar: ");
			dni = pedirDni();
			// TODO Eliminar el alumno de la lista. Si no existía el alumno con ese DNI,
			// avisar del problema. Se considera que existe si hay otro alumno con el mismo
			// DNI, aunque otros atributos no sean iguales.
			alumno = new Alumno(dni);
			if (!alumnos.remove(alumno)) {
				System.out.printf("La lista no contiene al alumno con DNI %s\n", dni);
			}
			
			// Versión comprobando con contains.
//			if (!alumnos.contains(alumno)) {
//				System.out.printf("La lista no contiene al alumno con DNI %s\n", dni);
//			}else {
//				alumnos.remove(alumno);
//			}
			
		
			
			break;
		case "D":
			System.out.print("Introduce el DNI del alumno que quieres mostrar: ");
			dni = pedirDni();
			// TODO Mostrar TODOS los datos del alumno indicado. Si no existía el alumno con
			// ese DNI, avisar del problema. Se considera que existe si hay otro alumno con
			// el mismo DNI, aunque otros atributos no sean iguales.
			alumno = new Alumno(dni);
			int posAlumno = alumnos.indexOf(alumno);
			if (alumnos.indexOf(alumno) < 0) {
				System.out.printf("La lista no contiene al alumno con DNI %s\n", dni);
			}else
			{
				alumno = alumnos.get(posAlumno);
				System.out.println(alumno);
			}
			break;
		case "S":
			System.out.println("Gracias por usar el programa de gestión de alumnos.");
			break;
		default:
			// No debería pasar nunca. Lanzamos excepción si ocurre.
			throw new IllegalArgumentException("El valor de la opción seleccionada no es válido.");
		}
	}

	private static void listarAlumnos(List<Alumno> alumnos) {
		if (alumnos.isEmpty()) {
			System.out.println("La lista de alumnos está vacía");
		} else {
			System.out.println("Alumos en la lista:");
			for (Alumno alumno : alumnos) {
				System.out.printf("\t%s - %s %s\n", alumno.getDni(), alumno.getNombre(), alumno.getApellidos());
			}
		}
	}

	private static Alumno pedirAlumnoUsuario() {
		Alumno alumno;
		// TODO Pedir datos de alumno, crear y devolver nuevo objeto Alumno con los
		// datos recogidos.
		System.out.println("Introduce los datos del nuevo alumno:");
		System.out.print("\t DNI: ");
		String dni = pedirDni();
		System.out.print("\t Nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("\t Apellidos: ");
		String apellidos = scanner.nextLine();
		System.out.print("\t Ciclo (" + getNombresCiclos() + "): ");
		CicloFormativo ciclo = CicloFormativo.valueOf(scanner.nextLine().toUpperCase());
		System.out.print("\t Ciclo (" + getNombresCursos() + "): ");
		Curso curso = Curso.valueOf(scanner.nextLine().toUpperCase());
		System.out.print("\t Fecha de nacimiento (YYYY-DD-MM): ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		alumno = new Alumno(dni, nombre, apellidos, ciclo, curso, fechaNacimiento);

		return alumno;
	}

	private static String getNombresCursos() {
		return String.join(", ", Arrays.stream(Curso.values()).map(Enum::toString).toList());
	}

	private static String getNombresCiclos() {
		return String.join(", ", Arrays.stream(CicloFormativo.values()).map(Enum::toString).toList());
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
