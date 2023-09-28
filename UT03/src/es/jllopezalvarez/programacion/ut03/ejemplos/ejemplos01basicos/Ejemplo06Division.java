package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 * Ejemplo de división entera
 */
public class Ejemplo06Division {
	public static void main(String[] args) {
		// El dividendo no es divisible por el divisor
		int dividendo = 9;
		int divisor = 2;

		// Esta operación, al ser entre enteros es una división entera, así que 9/2
		// tiene como cociente 4, y habrá un resto
		int cociente = dividendo / divisor;

		// PAra calcular el resto se usa el operador módulo o resto de división entera
		int resto = dividendo % divisor;

		// Mostramos los valores
		System.out.println("Dividendo: " + dividendo);
		System.out.println("Divisor: " + divisor);
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);

		// Aunque asignemos el resultado de la división entera a un doble, seguiremos
		// sin tener decimales. Esto es porque java hace las operaciones en este orden:
		// 1.- Hace la división ENTERA de dividendo entre divisor, y almacena el
		// resultado, que no tiene decimales en un sitio oculto, que no vemos en nuestro
		// código
		// 2.- El resultado sin decimales, se asigna (se guarda) en la variable doble.
		// Al hacerlo, Java hace una conversión (cast) automática a doble. Por eso, al
		// mostrar el resultado apare con .0, porque los double tienen decimales.
		double cocienteDoble = dividendo / divisor;
		System.out.println("Cociente doble: " + cocienteDoble);

	}
}
