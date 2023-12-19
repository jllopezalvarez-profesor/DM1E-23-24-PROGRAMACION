package es.jllopezalvarez.programacion.ut09.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = scanner.nextLine();

		int posicion = -1;
		do {
			try {
				System.out.print("Introduce la posición de la frase que quieres extraer: ");
				// Esto cuando falla entra en bucle porque deja el \n
				// posicion = scanner.nextInt();

				posicion = Integer.valueOf(scanner.nextLine());
				// Alternativa
				// posicion = Integer.parseInt(scanner.nextLine());
				
				if (posicion != 0) {
					char caracter = frase.charAt(posicion - 1);
					System.out.printf("El caracter en la posición %d es '%s'\n", posicion, caracter);
				}
//			} catch(NumberFormatException | StringIndexOutOfBoundsException  e) {
//				System.out.printf("El valor introducido debe ser un número entero válido y debe estar entre %d y %d\n", 1, frase.length());
//			}				
				
			} catch (NumberFormatException e) {
				System.out.println("El valor introducido no es un número entero");
			} catch (StringIndexOutOfBoundsException e) {
				System.out.printf("El valor introducido debe estar entre %d y %d\n", 1, frase.length());
			}

		} while (posicion != 0);
		
		System.out.println("Fin del programa");
	}
}
