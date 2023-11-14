package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos01referencias;

public class Ejemplo01TiposPrimitivos {

	public static void main(String[] args) {

		// Ejemplo de parámetros de tipo primitivo. Muestra el valor antes, durante y
		// después de la invocación del método.
		int numero = 10;
		System.out.printf("El valor de la variable número ANTES de invocar el método: %d.\n", numero);
		
		modificarTipoPrimitivo(numero);
		
		System.out.printf("El valor de la variable número DESPUÉS de llamar al método: %d.\n", numero);


	}

	/**
	 * 
	 * Recibe un número e intenta incrementar su valor dentro del método. Como es un
	 * tipo primitivo, el incremento se aprecia dentro del método, pero cuando
	 * salimos del método la varable que se pasó como parámetro no se ve modificada.
	 * 
	 * @param num el número que se pretencía modificar
	 */
	public static void modificarTipoPrimitivo(int num) {
		System.out.printf("El valor del parámetro DENTRO DEL MÉTODO, ANTES de modificar su valor: %d.\n", num);
		num += 10;
		System.out.printf("El valor del parámetro DENTRO DEL MÉTODO, DESPUÉS de modificar su valor: %d.\n", num);
	}

}
