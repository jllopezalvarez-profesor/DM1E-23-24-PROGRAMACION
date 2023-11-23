package es.dm1e.examenes.parcial1evaluacion;

import java.util.Scanner;

public class Ejercicio03A02B {

	private static final int OPCION_SUMAR = 1;
	private static final int OPCION_RESTAR = 2;
	private static final int OPCION_MULTIPLICAR = 3;
	private static final int OPCION_DIVIDIR = 4;
	private static final int OPCION_POTENCIA = 5;
	private static final int OPCION_SALIR = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int operacion;

		do {
			operacion = pedirOpcionUsuario(scanner);
			if (operacion != OPCION_SALIR) {
				realizarOperacion(scanner, operacion);
			}

		} while (operacion != OPCION_SALIR);

		System.out.println("Gracias por usar la calculadora. Hasta la próxima.");

	}

	private static void realizarOperacion(Scanner scanner, int operacion) {
		System.out.print("Primer número: ");
		int operando1 = scanner.nextInt();
		System.out.print("Segundo número: ");
		int operando2 = scanner.nextInt();

		switch (operacion) {
		case OPCION_SUMAR:
			System.out.printf("%d + %d = %d\n", operando1, operando2, operando1 + operando2);
			break;
		case OPCION_RESTAR:
			System.out.printf("%d - %d = %d\n", operando1, operando2, operando1 - operando2);
			break;
		case OPCION_MULTIPLICAR:
			System.out.printf("%d x %d = %d\n", operando1, operando2, operando1 * operando2);
			break;
		case OPCION_DIVIDIR:
			if (operando2 == 0) {
				System.out.println("No se puede dividir por cero");
			} else {
				System.out.printf("%d / %d = %.2f\n", operando1, operando2, (double) operando1 / operando2);
			}
			break;
		case OPCION_POTENCIA:
			System.out.printf("%d elevado a %d = %d\n", operando1, operando2, (int) Math.pow(operando1, operando2));
			break;
		default:
			System.out.println("Error. El código de operación no se ha reconocido.");
		}
	}

	private static int pedirOpcionUsuario(Scanner scanner) {
		int opcionElegida;
		do {
			mostrarMenu();
			opcionElegida = scanner.nextInt();
			if (opcionElegida < OPCION_SALIR || opcionElegida > OPCION_POTENCIA) {
				System.out.println("Opción no válida, vuelva a intentarlo.");
			}
		} while (opcionElegida < OPCION_SALIR || opcionElegida > OPCION_POTENCIA);
		return opcionElegida;
	}

	private static void mostrarMenu() {
		System.out.println("""
				1.- Sumar (A+B)
				2.- Restar (A-B)
				3.- Multiplicar (A*B)
				4.- Dividir (A/B)
				5.- Potencia (A elevado a B)
				0.- Salir""");
	}

}
