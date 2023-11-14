package es.jllopezalvarez.programacion.ut05.ejemplos;

/**
 * 
 * Crear un método "sumar" que suma dos números Recibe (parámetros): numero a y
 * número b que son enteros Devuelve: la suma de los dos números
 *
 *
 * Hacer pruebas del métedo en el programa principal
 */
public class PruebaMetodos {
	public static void main(String[] args) {
		
		int v;
		v = sumar(3, restar(2, 8));

		System.out.println(v);

	}

	public static int sumar(int a, int b) {
		int valorSuma = a + b;
		return valorSuma;
	}
	private static int restar(int a, int b) {
		int valorResta = a - b;
		return valorResta;
	}

}
