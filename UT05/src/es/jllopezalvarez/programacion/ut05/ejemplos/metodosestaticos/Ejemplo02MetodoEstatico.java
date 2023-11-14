package es.jllopezalvarez.programacion.ut05.ejemplos.metodosestaticos;

/**
 * 
 * Ejemplo de declaración y uso de un método estático o de clase. Un método
 * estático es el que se se declara en una clase "X", pero usando la palabra
 * reservada "static". Para usarlo no es necesario instanciar un objeto de la
 * clase en cuestión. En este ejemplo, se usa el método estático
 * "mostrarImparesMenoresQue" de la clase "Métodos". Como este método es
 * estático, no hay que crear un objeto de la clase para llamarlo.
 *
 */
public class Ejemplo02MetodoEstatico {

	public static void main(String[] args) {
		// En este caso podemos usar el método mostrarImparesMenoresQue sin tener que
		// instanciar un objeto de la clase Metodos. Para llamar métodos estáticos hay
		// que usar el nombre de la clase, sin crear un objeto.

		Metodos.mostrarImparesMenoresQue(10);

		// Si creamos un objeto de la clase Metodos
		Metodos objetoMetodos = new Metodos();
		// Java nos deja llamar al método estático usando el nombre del objeto
		objetoMetodos.mostrarImparesMenoresQue(20);
		// Pero nos aparecerá un warning para que usemos la forma correcta, que es usar
		// el nombre de la clase: 
		Metodos.mostrarImparesMenoresQue(30);

	}

}
