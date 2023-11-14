package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos02arrays;

/**
 * 
 * Ejemplo de uso del atributo público length.
 * 
 */
public class Ejemplo02Longitud {

	public static void main(String[] args) {
		// Declaración de un array de enteros para guardar la edad de los alumnos.
		// El tamaño o longitud del array no se establece al declarar el array, sin al
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
		nombresAlumnos = new String[20];

		// Mostramos las longitudes de los arrays usando el atributo público length
		System.out.printf("La longitud del array de edades es: %d\n", edadesAlumnos.length);
		System.out.printf("La longitud del array de saldos es: %d\n", saldosCuentas.length);
		System.out.printf("La longitud del array de nombres es: %d\n", nombresAlumnos.length);
		System.out.println();
		System.out.println();
		
		int[] numeros = new int[10];
		System.out.printf("Longitud del array: %d\n", numeros.length);
		
		
		
		
	}

}
