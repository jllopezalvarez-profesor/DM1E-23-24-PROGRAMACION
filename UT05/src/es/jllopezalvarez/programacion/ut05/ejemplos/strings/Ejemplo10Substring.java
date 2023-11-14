package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo10Substring {

	public static void main(String[] args) {

		String s = "Esto es una cadena de texto";
		System.out.println(s);
		System.out.println(eliminarPalabraUnaVez(s, "una"));

		s = "Esto es una cadena de texto en la que la palabra 'una' se repite más de una vez";
		System.out.println(s);
		System.out.println(eliminarPalabraUnaVez(s, "una"));

		s = "Esto es una cadena de texto en la que la palabra 'una' se repite más de una vez";
		System.out.println(s);
		System.out.println(eliminarPalabra(s, "una"));

		
	}

	public static String eliminarPalabraUnaVez(String frase, String palabraEliminar) {

		int posicionPalabra = frase.indexOf(palabraEliminar);

		if (posicionPalabra == -1) { // No encontrado
			return frase;
		}

		String salida = frase.substring(0, posicionPalabra);
		salida += frase.substring(posicionPalabra + palabraEliminar.length());

		return salida;

	}

	public static String eliminarPalabra(String frase, String palabraEliminar) {

		int posicionPalabra = frase.indexOf(palabraEliminar);
		while (posicionPalabra > 0) {
			frase = frase.substring(0, posicionPalabra) + frase.substring(posicionPalabra + palabraEliminar.length());
			posicionPalabra = frase.indexOf(palabraEliminar);
		}
		return frase;

	}

}
