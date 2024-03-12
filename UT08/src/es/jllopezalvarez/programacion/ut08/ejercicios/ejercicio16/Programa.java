package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoEnColaNoPuedeSalirException;
import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoNoEstacionadoException;
import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoYaEnColaException;
import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoYaEstacionadoException;

public class Programa {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Estacionamiento estacionamiento = new Estacionamiento(20, 4, 20, 1);

		int opcionSeleccionada;
		String matricula;

		do {
			mostrarMenu();
			opcionSeleccionada = pedirOpcionUsuario();
			try {
				switch (opcionSeleccionada) {
				case 1:
					System.out.println("Introduce matrícula del vehículo que quieres aparcar");
					matricula = scanner.nextLine();
					estacionamiento.estacionarVehiculo(matricula);
					break;
				case 2:
					System.out.println("Introduce matrícula del vehículo que quieres retirar");
					matricula = scanner.nextLine();
					double importe = estacionamiento.retirarVehiculo(matricula);
					System.out.printf("El coste del aparcamiento es de %.2f euros\n", importe);

					break;
				case 3:
					System.out.println("Introduce matrícula del vehículo que quiers comprobar");
					System.out.println("Introduce matrícula del vehículo que quieres retirar");
					matricula = scanner.nextLine();
					boolean esta = estacionamiento.estaEstacionado(matricula);
					System.out.println(esta ? "Está estacionado" : "No está estacionado");
					break;
				case 4:
					System.out.println("Vehículos en el estacionamiento:");
					Collection<String> estacionados = estacionamiento.getMatriculasEstacionados();
					estacionados.forEach(System.out::println);
					break;
				default:
					System.out.println("Hasta luego");
					// 0 Salir
					break;
				}
			} catch (VehiculoYaEstacionadoException e) {
				System.out.println("El vehículo ya está estacionado");
			} catch (VehiculoEnColaNoPuedeSalirException e) {
				System.out.println("El vehículo no puede salir porque está en la cola");
			} catch (VehiculoNoEstacionadoException e) {
				System.out.println("El vehículo no está estacionado");
			} catch (VehiculoYaEnColaException e) {
				System.out.println("El vehículo ya está en la cola esperando a estacionar");
			} catch (NumberFormatException e) {
				System.out.println("La has vuelto a liar");
			}
			

		} while (opcionSeleccionada != 0);

	}

	private static void mostrarMenu() {
		System.out.println("Opciones disponibles:");
		System.out.println("\t1 Estacionar");
		System.out.println("\t2 Retirar vehículop");
		System.out.println("\t3 Comprobar si está estacionado");
		System.out.println("\t4 Obtener matrículas");
		System.out.println("\t0 Salir");
	}

	private static int pedirOpcionUsuario() {
		// TODO Evitar que el usuario escriba caracteres no válidos u opciones no
		// válidos
		System.out.print("Intoruce la opción seleccionada: ");
		return Integer.parseInt(scanner.nextLine());
	}
}
