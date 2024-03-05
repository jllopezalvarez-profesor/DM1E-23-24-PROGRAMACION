package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio07;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Programa {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedList<String> nombres = new LinkedList<>();

		mostrarMenu();
		int opcionUsuario = pedirOpcionUsuario();
		while (opcionUsuario != 0) {
			switch (opcionUsuario) {
			case 1:
				System.out.println(nombres);
				break;
			case 2:
				System.out.print("Introduce el nombre: ");
				nombres.push(scanner.nextLine());
				// nombres.add(0, scanner.nextLine());
				break;
			case 3:
				String nombre = nombres.poll();
				if (nombre == null) {
					System.out.println("La pila está vacía");
				} else {
					System.out.printf("Nombre eliminado: '%s'\n", nombre);
				}
				break;
			case 4:
				System.out.print("Introduce el nombre a eliminar: ");
				nombre = scanner.nextLine();
				if (!nombres.removeFirstOccurrence(nombre)) {
					System.out.printf("No se ha encontrado '%s' en la pila\n", nombre);
				}
				break;
			case 5:
				nombres.clear();
			case 6:
				// Alternativa:
				// Collections.sort(nombres);
				nombres.sort(null);
				break;
			case 7:
				nombres.sort(Comparator.reverseOrder());
				break;
			default:
				break;
			}

			mostrarMenu();
			opcionUsuario = pedirOpcionUsuario();

		}
		System.out.println("Hasta luego.");

	}

	private static int pedirOpcionUsuario() {
		while (true) {
			try {
				System.out.print("¿Qué operación quieres realizar (1-5, 0 para salir)? ");
				int opcion = Integer.parseInt(scanner.nextLine());
				return opcion;
			} catch (NumberFormatException e) {
				System.out.println("La opción elegida no es válida.");
			}
		}
	}

	private static void mostrarMenu() {
		System.out.print("""
				1.- Listar nombres
				2.- Añadir nombre
				3.- Extraer nombre
				4.- Eliminar nombre
				5.- Eliminar todos
				6.- Ordenar ascendente
				7.- Ordenar descendente
				0.- Salir
				""");
	}

}
