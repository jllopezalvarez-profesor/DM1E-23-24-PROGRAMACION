package es.jllopezalvarez.programacion.ut09.ejercicios.ejercicio03;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Coche coche = new Coche(120,22);
		int opcion = -1;
		do {
			try {
				mostrarMenu();
				System.out.println("Elige la opción");
				opcion = Integer.parseInt(scanner.nextLine());
				
				switch (opcion) {
				case 1:
					coche.arrancar();
					break;
				case 2:
					coche.detener();
					break;
				case 3:
					coche.ponerMarchaAtras();
					break;
				case 4:
					coche.quitarMarchaAtras();
					break;
				case 5:
					System.out.println("¿Cuánto quieres acelerar?");
					int cuanto = Integer.parseInt(scanner.nextLine());
					coche.acelerar(cuanto);
					break;
				case 6:
					System.out.println("¿Cuánto quieres frenar?");
					cuanto = Integer.parseInt(scanner.nextLine());
					coche.frenar(cuanto);
					break;
				case 0:
					System.out.println("Gracias por usar este programam tan inutil");
					break;
				default:
					System.out.println("La opción no es válida");
					break;
				}
				System.out.println(coche);
			} catch (NumberFormatException e) {
				System.out.println("El valor introducido no es un número.");
			} catch (IllegalStateException e) {
				System.out.printf("Error: %s\n", e.getMessage());
			}

		} while (opcion != 0);

	}

	private static void mostrarMenu() {
		System.out.println("""

				    ◦ 1 – Arrancar
				    ◦ 2 – Detener
				    ◦ 3 – Poner marcha atrás
				    ◦ 4 – Quitar marcha atrás
				    ◦ 5 – Acelerar
				    ◦ 6 – Frenar
				    ◦ 0 – Fin
				""");
		// TODO Auto-generated method stub

	}

}
