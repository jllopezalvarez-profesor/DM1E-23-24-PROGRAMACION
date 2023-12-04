package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * Crea un método contarVocales que:
    • Recibe una cadena de caracteres (String)
    • Devuelve un entero con el número de vocales en la cadena.
    • Para hacerlo use sólo métodos de la clase String (no use arrays)
    • Se contarán vocales minúsculas y mayúsculas, con o sin tilde. El resto de las vocales (con diéresis, con acento circunflejo, etc., no se tienen en cuenta). Es decir, las vocales válidas son a,e,i,o,u,A,E,I,O,U,á,é,í,ó,ú,Á,É,Í,Ó,Ú.
    • Si la cadena es null, devolverá cero.
   Ejemplo:
    • contarVocales(“Hoy es SÁBADO”) devolvería el valor 5
 * </pre>
 *
 */
public class Ejercicio06 {

	public static void main(String[] args) {

		System.out.println(contarVocales("Hola, hoy es jueves"));
		
		
	}

	public static int contarVocales(String cadena) {
		if (cadena == null) {
			return 0;
		}

		String vocales= "aeiouAEIOUÁÉÍÓÚáéíóú";
		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
			// Primer enfoque: usar if
//			if ( caracter == 'a' || caracter == 'e' || caracter == 'i') {
//				// Este if se tendría que hacer con todas las vocales
//				contador++;
//			}

			// Segundo enfoque: usar switch
//			switch (caracter) {
//			case 'a', 'e', 'i', 'o', 'u': // Irían todas la vocales
//				contador++;
//			}
			
			// Tercer enfoque: buscar en otra cadena
			if (vocales.indexOf(caracter) >= 0) {
				contador++;
			}
		}

		return contador;
	}

}
