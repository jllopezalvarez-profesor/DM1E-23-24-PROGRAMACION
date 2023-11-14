package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo01CrearStrings {

	public static void main(String[] args) {
		// Crear un String sin valor inicial.
		// Tendrá el valor NULL. Veremos el valor null más adelante.
		String cadena01;
		// Java no nos deja usar la variable sin inicializarla:
		// System.out.println(cadena01);

		// Si creamos un array de Strings, como en los arrays se toma el valor por
		// defecto para los objetos, cada cadena del array tendrá valor null
		String[] cadenas = new String[5];
		for (String cadena : cadenas) {
			System.out.println(cadena);
		}
		cadenas[1] = "null";
		System.out.println(cadenas[1].length());
		//int longitud = cadenas[0].length();

		// Crear un String con un valor inicial, usando un literal
		String cadena02 = "Esta es la cadena 02";
		System.out.println(cadena02);
		System.out.println("Su longitud es " + cadena02.length());
		
		System.out.println("x".concat(".".repeat(30)).concat("x"));

		// Creación de String a partir de otro objeto String, copiándo el valor del
		// objeto
		String cadena03 = cadena02;
		System.out.printf("Cadena 02: %s - Cadena 03: %s.\n", cadena02, cadena03);

		// Creación de String vacía usando new String
		String cadena04 = new String();
		System.out.printf("Valor de cadena 04: '%s'.\n", cadena04);

		// Creación de String con valor inicial usando new String
		String cadena05 = new String("Valor inicial de la cadena 05");
		System.out.printf("Valor de cadena 05: '%s'.\n", cadena05);

		// Creación de String con new String, copiando el valor de otro objeto
		String cadena06 = new String(cadena05);
		System.out.printf("Valor de cadena 06: '%s'.\n", cadena06);

//		// Creación de String a partir de un array de caracteres
//		char[] caracteres = { 'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5' };
//		String cadena07 = new String(caracteres);
//		System.out.printf("Valor de cadena 07: '%s'.\n", cadena07);
//		
//		// Usar valueOf
//		String cadenaEntero = String.valueOf(5);
//		String cadenaDoble = String.valueOf(345.232);
//		String cadenaBoolean = String.valueOf(3>5);
//		System.out.printf("int: '%s' - double: '%s' - boolean: '%s' ", cadenaEntero, cadenaDoble, cadenaBoolean);
		
	}

}
