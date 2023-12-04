package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * Crea un método aniadirSeparadores que: 
    • Recibe un número entero. Ejemplo: 34445623.
    • Lo devuelve como un String formateado con puntos para separa las unidades de millar, las unidades de millón, etc. En el caso del ejemplo devolvería 34.445.623
   Para hacerlo:
    • Convierte el número a String.
    • Usa un StringBuilder para insertar los . en las posiciones adecuadas, usando el método insert.
 * </pre>
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		System.out.println(aniadirSeparadores(323423443));
		System.out.println(aniadirSeparadores(22));
		System.out.println(aniadirSeparadores(322));
		System.out.println(aniadirSeparadores(433422));
		System.out.println(aniadirSeparadores(-22));
		System.out.println(aniadirSeparadores(-333622));
		System.out.println(aniadirSeparadores(-3422));

	}

	public static String aniadirSeparadores(int numero) {

		boolean esNegativo = false;
		if (numero < 0) {
			numero = -numero;
			esNegativo = true;
		}
		StringBuilder sb = new StringBuilder(String.valueOf(numero));

		for (int posicionPunto = sb.length() - 3; posicionPunto > 0; posicionPunto -= 3) {
			sb.insert(posicionPunto, '.');
		}

		// return esNegativo ? "-" + sb.toString() : sb.toString();
		return (esNegativo ? "-" : "") + sb.toString();
	}

}
