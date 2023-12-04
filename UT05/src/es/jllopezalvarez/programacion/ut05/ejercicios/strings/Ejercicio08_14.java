package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * Realiza un método espejo que:
    • Recibe una cadena de caracteres
    • Devuelve la cadena como si estuviera reflejada en un espejo. Esto es, la misma cadena a la que se añade la misma cadena invertida, pero compartiendo una letra, que será la última de la cadena original y la primera de la cadena invertida que se añade. Ver ejemplos.
    • Si la cadena es null, devuelve null
    • Este método crea palíndromos, y si usamos el método esPalindromo sobre el resultado de este método, siempre devolverá true.
   Ejemplos:
    • espejo(“año”) devuelve añoña
    • espejo(“bicicleta”) devuelve “bicicletatelcicib”.
    • esPalindromo(espejo(<cualquier cadena>)) siempre devolverá true, salvo si la cadena es null, en cuyo caso devolverá false.
 * 
 * </pre>
 *
 */
public class Ejercicio08_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub(

		System.out.println("Versión con Strings");
		System.out.println(espejo("bicicleta"));
		System.out.println(espejo("Hoy hay examen de LLMM"));
		System.out.println(espejo(""));
		System.out.println(espejo("ABC"));
		System.out.println(espejo(null));

		System.out.println("Versión con StringBuilder");
		System.out.println(espejo2("bicicleta"));
		System.out.println(espejo2("Hoy hay examen de LLMM"));
		System.out.println(espejo2(""));
		System.out.println(espejo2("ABC"));
		System.out.println(espejo2(null));

	}

	public static String espejo(String original) {
		if (original == null) {
			return null;
		}
		String cadenaResultado = original;
		for (int i = original.length() - 2; i >= 0; i--) {
			cadenaResultado += original.charAt(i);
		}
		return cadenaResultado;

	}

	public static String espejo2(String original) {
		if (original == null) {
			return null;
		}
		
		StringBuilder copia = new StringBuilder(original);
		// Opción 1: invertir y eliminar el primero
//		copia.reverse();
//		if (copia.length() > 0) {
//			copia.deleteCharAt(0);
//		}

		// Opción 2: eliminar el último y luego invertir
		if (copia.length() > 0) {
			copia.deleteCharAt(copia.length()-1);
		}
		copia.reverse();

		return original + copia.toString();

	}

}
