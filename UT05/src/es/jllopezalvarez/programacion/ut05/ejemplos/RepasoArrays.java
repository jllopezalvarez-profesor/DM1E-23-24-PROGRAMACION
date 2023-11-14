package es.jllopezalvarez.programacion.ut05.ejemplos;

public class RepasoArrays {

	public static void main(String[] args) {
//		int[] numeros = new int[100];
//
//		for (int i = 0; i < numeros.length; i++)
//			;
//
//		for (int i = numeros.length - 1; i >= 0; i--)
//			;
//
//		int contador = 0;
//		int sumador = 0;
//		int multiplicador = 1;
//
//		int numeroBuscado = 3;
//		for (int numero : numeros) {
//			if (numero == numeroBuscado) {
//				// Contar
//				contador++;
//				// Acumular
//				sumador += numero;
//				multiplicador *= numero;
//
//				// Dentro de un método buscar algo
//				// return numero;
//
//			}
//
//		}
//
//		int posicionNumeroEncontrado;
//		BuscarPosicionNumero(numeros, numeroBuscado);


//		for (int i = 0; i < cadena.length(); i++) {
//			System.out.println(cadena.charAt(i));
//		}
		
//		char[] caracteres = cadena.toCharArray();
//		for (char c : caracteres) {
//			System.out.println(c);
//		}
		
		//Buscar en un String
		char caracterBuscado = 'e';
//		System.out.printf("La letra e aparece en la posición %d\n", cadena.indexOf(caracterBuscado));
//		System.out.printf("La letra e aparece en la posición %d\n", cadena.lastIndexOf(caracterBuscado));
//		
//		String cadenaBuscada = " e";
//		System.out.printf("La letra e aparece en la posición %d\n", cadena.indexOf(cadenaBuscada));
//		System.out.printf("La letra e aparece en la posición %d\n", cadena.lastIndexOf(cadenaBuscada));
//
//		
		String cadena = "Mañana es el examen";

		int posicionEncontrada = cadena.indexOf(caracterBuscado);
		
		while (posicionEncontrada >= 0) {
			System.out.printf("La letra %s aparece en la posición %d\n", caracterBuscado, posicionEncontrada);
			posicionEncontrada = cadena.indexOf(caracterBuscado, posicionEncontrada+1);
		}
		
		String cadenaConEspacios = "   fdsfsadjf    asdfaslkdjflka   adf   ads f   ";
		System.out.println(cadenaConEspacios);
		System.out.println(cadenaConEspacios.trim());
		System.out.println(cadenaConEspacios);
		
		
		
		
		
	}
	
	
	

	private static int BuscarPosicionNumero(int[] numeros, int numeroBuscado) {
		// buscar la posición de un elemento
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroBuscado)
				return i;
		}
		return -1;
	}

}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
