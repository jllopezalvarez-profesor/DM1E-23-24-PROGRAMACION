package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos01referencias;

public class Ejemplo02TiposInmutables {

	public static void main(String[] args) {

		// Ejemplo de parámetros de tipo inmutable. Muestra el valor antes, durante y
		// después de la invocación del método. Hay varias clases en Java que son
		// inmutables, pero la más común es String
		String nombre = "José Luis";
		System.out.printf("El valor de la variable número ANTES de invocar el método: %s.\n", nombre);

		modificarTipoInmutable(nombre);

		System.out.printf("El valor de la variable número DESPUÉS de llamar al método: %s.\n", nombre);

	}

	/**
	 * 
	 * Recibe una palabra e intenta modificarla, pasándola a mayúsculas. Como es un
	 * tipo inmutable, el cambio a mayúscuals se aprecia dentro del método, pero
	 * cuando salimos del método la varable que se pasó como parámetro no se ve
	 * modificada.
	 * 
	 * @param palabra La palabra que se pretende modificar
	 */
	public static void modificarTipoInmutable(String palabra) {
		System.out.printf("El valor del parámetro DENTRO DEL MÉTODO, ANTES de modificar su valor: %s.\n", palabra);
		palabra = palabra.toUpperCase();
		System.out.printf("El valor del parámetro DENTRO DEL MÉTODO, DESPUÉS de modificar su valor: %s.\n", palabra);
	}

}
