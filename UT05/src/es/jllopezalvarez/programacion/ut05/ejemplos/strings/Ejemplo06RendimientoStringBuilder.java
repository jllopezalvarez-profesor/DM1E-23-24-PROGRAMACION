package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo06RendimientoStringBuilder {

	public static void main(String[] args) {
		String c1 = construirCadenaConNumeros(10);
		System.out.println(c1);

		String c2 = construirCadenaConNumerosBuilder(10);
		System.out.println(c2);

		String c3 = construirCadenaConNumerosBuffer(10);
		System.out.println(c3);

		probarRendimiento(1000, 1000);

	}

	private static void probarRendimiento(int numero, int cantidadRepeticiones) {
		long inicio, fin;
		String s;

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidadRepeticiones; i++)
			s = construirCadenaConNumeros(numero);
		fin = System.currentTimeMillis();
		System.out.printf("Concatenación: %d veces (%d núms): %d ms.\n", cantidadRepeticiones, numero, fin - inicio);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidadRepeticiones; i++)
			s = construirCadenaConNumerosBuilder(numero);
		fin = System.currentTimeMillis();
		System.out.printf("StringBuilder: %d veces (%d núms): %d ms.\n", cantidadRepeticiones, numero, fin - inicio);

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidadRepeticiones; i++)
			s = construirCadenaConNumerosBuffer(numero);
		fin = System.currentTimeMillis();
		System.out.printf("StringBuffer: %d veces (%d núms): %d ms.\n", cantidadRepeticiones, numero, fin - inicio);

	}

	/**
	 * Crea una cadena de texto con todos los números desde 1 hasta el recibido como
	 * parámetro, separados por comas. Usa concatenación de cadenas para acumular el
	 * resultado
	 * 
	 * @param numero el mayor número que queremos incluir en la cadena
	 * @return la cadena de texto
	 */
	private static String construirCadenaConNumeros(int numero) {
		String resultado = "";
		for (int i = 1; i <= numero; i++) {
			if (i > 1)
				resultado += ", ";
			resultado += i;
		}
		return resultado;
	}

	/**
	 * Crea una cadena de texto con todos los números desde 1 hasta el recibido como
	 * parámetro, separados por comas. Usa StrignBuilder.
	 * 
	 * @param numero el mayor número que queremos incluir en la cadena
	 * @return la cadena de texto
	 */
	private static String construirCadenaConNumerosBuilder(int numero) {
		StringBuilder resultado = new StringBuilder();
		for (int i = 1; i <= numero; i++) {
			if (i > 1)
				resultado.append(", ");
			resultado.append(i);
		}
		return resultado.toString();
	}

	/**
	 * Crea una cadena de texto con todos los números desde 1 hasta el recibido como
	 * parámetro, separados por comas. Usa StringBuffer.
	 * 
	 * @param numero el mayor número que queremos incluir en la cadena
	 * @return la cadena de texto
	 */
	private static String construirCadenaConNumerosBuffer(int numero) {
		StringBuffer resultado = new StringBuffer();
		for (int i = 1; i <= numero; i++) {
			if (i > 1)
				resultado.append(", ");
			resultado.append(i);
		}
		return resultado.toString();
	}

}
