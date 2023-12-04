package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * Crea un método eliminaCaracteresRepetidos que:
    • Recibe un parámetro de tipo String
    • Devuelve la cadena de texto, pero tras haber eliminado todos los caracteres repetidos. Case-sentive, es decir, considerando que una letra mayúscula (A) es diferente a la letra minúscula (a).
    • Por ejemplo, si se recibe “permanentemente”. Devolvería “permant”
    • Usa StringBuilder.
 * </pre>
 *
 */
public class Ejercicio17 {

	public static void main(String[] args) {

		System.out.println(eliminaCarcteresRepetidos("PermaNentemente"));
	}

	public static String eliminaCarcteresRepetidos(String original) {

		if (original == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();

		for (char caracter : original.toCharArray()) {
			String strCaracter = String.valueOf(caracter);
			if (sb.indexOf(strCaracter) == -1) {
				sb.append(caracter);
			}
		}
		return sb.toString();
	}

}
