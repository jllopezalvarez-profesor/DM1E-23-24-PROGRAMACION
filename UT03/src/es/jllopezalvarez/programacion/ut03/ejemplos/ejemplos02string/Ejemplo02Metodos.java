package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos02string;

public class Ejemplo02Metodos {

	public static void main(String[] args) {


		// Ejemplo de uso de métodos de un objeto
		// Creamos el objeto. Se usa la palabra reservada new, y el constructor
		String cadena = new String("Esto es una cadena creada con new.");
		// Se llama al método usando el punto (.) y el nombre del método
		// Los métodos pueden devolver valores, como este caso.
		// Este método cuenta el número de caracteres en la cadena
		int tamanioCadena = cadena.length();
		// Mostramos la información obtenida
		System.out.println("La longitud de la cadena es " + tamanioCadena);
		
		String vacia = "";
		System.out.println("Longitud de una cadena vacía: " + vacia.length());
		
		// CharAt
		System.out.println("El caracter en la posición 5 es " + cadena.charAt(5));
		// La siguiente línea falla, porque 65 se "sale" por la derecha
		// System.out.println("El caracter en la posición 65 es " + cadena.charAt(65));

		// Hay métodos que reciben necesitan datos para hacer su trabajo.
		// Estos datos se denominan parámetros o argumentos
		String inicio = cadena.substring(0, 10);
		// Mostramos la subcadena obtenida
		System.out.println("Los primeros 10 caracteres son: " + inicio);
		System.out.println("La cadena después de substring queda: " + cadena);

		// Hay métodos que tienen más de una versión.
		// El método substring, por ejemplo, tiene una versión que no recibe posicion de
		// inicio y fin de la cadena, sino sólo la posición de inicio, y devuelve
		// siempre hasta el final de la cadena.
		String del10AlFinal = cadena.substring(10);
		// Mostramos la subcadena obtenida
		System.out.println("La cadena desde la posición 10 es: " + del10AlFinal);

		// Concat: concatena cadenas
		String cadena2 = cadena.substring(0, 20); // Primeros 20 de cadena
		String cadena3 = cadena2.concat(" - Esto es lo añadido");
		System.out.println("cadena2 tiene como valor: " + cadena2);
		System.out.println("cadena3 tiene como valor: " + cadena3);
		
		
		
		
		
		
		
		
//		// Más ejemplos de sobrecargas. El método indexOf de String
//		// Sirve para encontrar la posición de una cadena o de un caracter en una
//		// cadena.
//		// Primera sobrecarga: buscar una cadena en otra:
//		int posicion = cadena.indexOf("ad");
//		System.out.println("La primera posición de la cadena buscada es " + posicion);
//		// Segunda sobrecarga: buscar un caracter (un solo caracter) en una cadena:
//		posicion = cadena.indexOf('o');
//		System.out.println("La primera posición del caracter buscado es " + posicion);
//		// Tercera sobrecarga: buscar una cadena en otra, pero a partir de cierto punto:
//		posicion = cadena.indexOf("ad", 15);
//		System.out.println("La primera posición de la cadena buscada (empezando a buscar en la 15) es " + posicion);
//		// Segunda sobrecarga: buscar un caracter (un solo caracter) en una cadena, pero
//		// a partir de cierto punto:
//		posicion = cadena.indexOf('o', 10);
//		System.out.println("La primera posición del caracter buscado (empezando a buscar en la 10) es " + posicion);

	}

}
