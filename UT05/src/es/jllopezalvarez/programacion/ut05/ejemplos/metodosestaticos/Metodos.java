package es.jllopezalvarez.programacion.ut05.ejemplos.metodosestaticos;

/**
 * 
 * Clase que define un método mostrarParesMenoresQue, que recibe un número como
 * parametro, y muestra los números pares menores que ese número, y mayores que
 * cero. Lo definimos como un método de instancia, por lo que si queremos usarlo
 * tendremos que instanciar un objeto de esta clase. También se define un método
 * mostrarImparesMenoresQue. En este caso el método es estático (o de clase), lo
 * que quiere decir que se puede llamar al método sin crear un objeto de la
 * clase.
 *
 */
public class Metodos {

	/**
	 * Método de instancia
	 */
	public void mostrarParesMenoresQue(int numero) {
		for (int i = 1; i < numero; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}

	/**
	 * Método de clase o estático
	 */
	public static void mostrarImparesMenoresQue(int numero) {
		for (int i = 1; i < numero; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}

}
