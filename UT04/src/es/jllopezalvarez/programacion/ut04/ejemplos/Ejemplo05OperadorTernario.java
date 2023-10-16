package es.jllopezalvarez.programacion.ut04.ejemplos;

import java.util.Scanner;

public class Ejemplo05OperadorTernario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedimos un número, y preguntamos al usuario dos mensajes: uno para cuando
		// el número es mayor o igual que cero, y otro para cuando es menor que cero.
		System.out.print("Dime un número: ");
		int numero = scanner.nextInt();
		System.out.print("¿Qué mensaje quieres que muestre si el número es positivo o cero? ");
		String mensajePositivos = scanner.nextLine();
		System.out.print("¿Y si el número es negativo? ");
		String mensajeNegativos = scanner.nextLine();

		// Ahora, en función del valor del número, asignamos a una variable uno u otro
		// mensaje
		String mensajeMostrado = (numero >= 0) ? mensajePositivos : mensajeNegativos;
		
		// Y podemos usarlo
		System.out.println(mensajeMostrado);

	}

}
