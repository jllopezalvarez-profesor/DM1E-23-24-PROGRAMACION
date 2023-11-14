package es.jllopezalvarez.programacion.ut05.ejemplos;

public class EjemploReferencias {

	public static void main(String[] args) {

		int numero = 5;
		System.out.printf("Número antes de llamar a método: %d\n", numero);
		sumarDos(numero);
		System.out.printf("Número después de llamar a método: %d\n", numero);

		int numero2 = 8;
		System.out.printf("Número antes de llamar a método: %d\n", numero2);
		numero2 = sumarDosB(numero2);
		System.out.printf("Número después de llamar a método y usar el valor para cambiar numero2: %d\n", numero2);

		int[] numeros = { 2, 4, 3, 7, 8, 1, 9, 10 };
		System.out.println("Antes de sumar 2:");
		mostrarArray(numeros);
		sumarDos(numeros);
		System.out.println("Después de sumar 2:");
		mostrarArray(numeros);

	}

	// Este método no cambia realmente el valor que se pasa como parámetro.
	// En main "numero" sigue valiendo lo mismo que antes
	private static void sumarDos(int numero) {
		System.out.printf("Número dentro del método antes de sumar: %d\n", numero);
		numero = numero + 2;
		System.out.printf("Número dentro del método después de sumar: %d\n", numero);
	}

	private static void sumarDos(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] += 2;
		}
	}

	// Este método tapoco cambia realmente el valor que se pasa como parámetro.
	// En main "numero" sigue valiendo lo mismo que antes, a no ser, que usemos
	// lo que devuelve el método para cambiar su valor
	private static int sumarDosB(int numero) {
		System.out.printf("Número dentro del método antes de sumar: %d\n", numero);
		numero = numero + 2;
		System.out.printf("Número dentro del método después de sumar: %d\n", numero);
		return numero;
	}

	private static void mostrarArray(int[] array) {
		for (int numero : array) {
			System.out.printf("%s ", numero);
		}
		System.out.println();
	}

}
