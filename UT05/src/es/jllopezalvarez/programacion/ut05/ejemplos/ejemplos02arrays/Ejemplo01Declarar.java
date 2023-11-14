package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos02arrays;

/**
 * 
 * Ejemplo de declaración e instanciación de arrays. No manipula los arrays
 * creados. Simplemente los crea.
 * 
 * @author jllopezalvarez
 *
 */
public class Ejemplo01Declarar {

	public static void main(String[] args) {
		// Declaración de un array de enteros para guardar la edad de los alumnos.
		// El tamaño o longitud del array no se establece al declarar el array, sino al
		// instanciarlo.
		int[] edadesAlumnos;

		// Declaración de un array de dobles para guardar el saldo de cuentas.
		double[] saldosCuentas;

		// Declaración de un array de cadenas para guardar los nombres de los alumnos.
		String[] nombresAlumnos;

		// Instanciación del array para las edades de los alumnos.
		// en este momento es cuando le damos tamaño al array.
		edadesAlumnos = new int[30];

		// Instanciación del array para los saldos.
		saldosCuentas = new double[100];

		// Instanciación del array para los nombres de los alumnos.
		nombresAlumnos = new String[30];

	}

}
