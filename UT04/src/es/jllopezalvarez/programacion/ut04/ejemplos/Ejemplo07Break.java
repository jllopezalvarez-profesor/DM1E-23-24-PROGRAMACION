package es.iesclaradelrey.dm1e2223.ut04.ejemplos;

/**
 * 
 * @author jllopezalvarez
 *
 *         Uso de "break" para salir de un bucle a medias (antes de llegar al
 *         valor final), y alternativas para salir usando una variable de
 *         control o "flag".
 */
public class Ejemplo07Break {

	public static void main(String[] args) {
		int i = 0;

		// Bucle normal, que llega hasta 9.
		while (i < 10) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		System.out.println("Valor de i tras salir de while: " + i);

		System.out.println();

		// Bucle que debería llegar a 9, pero que paramos en el 5 con un break
		i = 0;
		while (i < 10) {
			System.out.println("Valor de i: " + i);
			i++;
			if (i == 5)
				break;
		}

		System.out.println();

		// Alternativa al bucle anterior usando una variáble lógica (boolean) para
		// indicar cuándo se ha llegado a la condición para salir
		boolean encontrado = false;
		i = 0;
		while (i < 10 && !encontrado) {
			i++;
			System.out.println("Valor de i: " + i);
			if (i == 5)
				encontrado = true;
		}

		// Igual que el anterior, pero con un for en lugar de un while. Recordad que en
		// los for la condición puede ser la que nos convenga, no es obligatorio que
		// siempre sea del tipo i<n o i<=n o similar.
		encontrado = false;
		for (int j = 0; j < 10 && !encontrado; j++) {
			System.out.println("Valor de i: " + i);
			if (i == 5)
				encontrado = true;
		}

	}

}
