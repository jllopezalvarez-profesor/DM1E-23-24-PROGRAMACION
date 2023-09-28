package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos02string;

public class Ejemplo03StringsInmutabilidad {

	public static void main(String[] args) {
		// En Java los objetos de la clase String son innmutables:

		// Ejemplo: el método toUpperCase no cambia una cadena:
		String cadenaOriginal = "Esta es la cadena original";
		// Mostramos la cadena original, llamamos a toUpperCase y volvemos a mostrarla
		System.out.printf("Cadena antes de toUpperCase: '%s'\n", cadenaOriginal);
		cadenaOriginal.toUpperCase();
		System.out.printf("Cadena después de toUpperCase: '%s'. No ha cambiado.\n", cadenaOriginal);
		// Para usar el valor "transformado" recogemos el valor devuelto por el método
		String cadenaTransformada = cadenaOriginal.toUpperCase();
		System.out.printf("Cadena después de llamar de nuevo a toUpperCase: '%s'\n", cadenaOriginal);
		System.out.printf("Cadena transformada, devuelta por toUpperCase: '%s'\n", cadenaTransformada);
		System.out.println("La cadena transformada sí es diferente a la original");

	}

}
