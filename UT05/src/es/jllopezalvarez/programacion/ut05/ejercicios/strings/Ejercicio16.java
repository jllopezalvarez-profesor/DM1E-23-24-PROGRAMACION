package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

/**
 * 
 * Crea un método buscaYPasaMayusculas que: • Recibe dos cadenas de caracteres •
 * Devuelve la primera cadena, pero transformando en mayúsculas la parte que
 * coincide con la segunda cadena introducida. Por ejemplo, si se introducen las
 * cadenas “Este es mi amigo Juan” y “amigo”, devolverá “Este es mi AMIGO Juan”.
 * • Usa StringBuilder. • Si la primera cadena es null, devolverá null • Si la
 * segunda cadena de caracteres es null, devuelve la primera cadena sin
 * modificar.
 *
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		System.out.println(buscaYPasaMayusculas("Este es mi amigo Juan", "amigo"));

	}

	public static String buscaYPasaMayusculas(String cadena, String buscada) {
		if (cadena == null) {
			return null;
		}
		if (buscada == null) {
			return cadena;
		}

		StringBuilder sb = new StringBuilder(cadena);

		int posicionBuscada = sb.indexOf(buscada);
		while (posicionBuscada >= 0) {
			// Quitar los caracteres "originales" en cadena
			sb.delete(posicionBuscada, posicionBuscada + buscada.length());
			sb.insert(posicionBuscada, buscada.toUpperCase());
			posicionBuscada = sb.indexOf(buscada, posicionBuscada + buscada.length());
		}

		return sb.toString();
	}

}
