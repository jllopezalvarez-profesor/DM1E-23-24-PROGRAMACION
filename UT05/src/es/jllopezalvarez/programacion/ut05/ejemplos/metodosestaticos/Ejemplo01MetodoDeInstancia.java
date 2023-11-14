package es.jllopezalvarez.programacion.ut05.ejemplos.metodosestaticos;

/**
 * 
 * Ejemplo de declaración y uso de un método de instancia. Un método de
 * instancia es el que se declara en una clase "X", y para poder usarlo se tiene
 * que instanciar un objeto de la clase en cuestión. En este ejemplo, se crea
 * una clase "Metodos", donde se define un método "mostrarParesMenoresQue". Como
 * este método es un método de instancia, hay que crear un objeto de la clase
 * para llamarlo.
 *
 */
public class Ejemplo01MetodoDeInstancia {

	public static void main(String[] args) {
		// Si intentamos usar el método Metodos.mostrarParesMenoresQue sin
		// instanciar un objeto de la clase Metodos, se produce un error de
		// compilación, porque es un método de instancia. Se necesita una instancia para
		// poder llamar al método.

		// Descomentar la siguiente instrucción para ver el error.
		// Metodos.mostrarParesMenoresQue(10);
		// El error dirá que no se puede hacer una referencia (llamada) estática al
		// método no estático mostrarParesMenoresQue de la clase Metodos.
		// Esto pasa porque el método main es estático (de clase) y desde un método de
		// clase no se puede llamar a un método de instancia sin crear una instancia.

		// Pero sí podríamos crear la clase y llamar al método.
		Metodos objetoMetodos = new Metodos();
		// Y una vez creado, usarlo para llamar al método
		objetoMetodos.mostrarParesMenoresQue(10);

	}

}
