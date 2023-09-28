package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos01basicos;

/**
 * Ejemplo de ámbito de variable.
 */
public class Ejemplo03Ambito {

	public static void main(String[] args) {
		// Las variables no se pueden usar antes de ser declaradas.
		// La siguiente línea, si se descomenta, produce errores de compilación.
		// a = b;

		int a = 3; // <- Inicio del ámbito de la variable a
		int b = 0; // <- Inicio del ámbito de la variable b

		// Aunque no hemos visto aún condicionales, esta condición sirve para entender
		// el fin del ámbito de la variable c
		// El ámbito de la variable termina al final del bloque de código donde se ha
		// declarado.

		if (a > 0) {
			int c = 7; // <- Inicio del ámbito de la variable c
			System.out.println(b);
			System.out.println(c);
		} // <- Fin del ámbito de la variable c 
		// La siguiente sentencia no compilaría si la descomentamos, porque c no existe
		// en este punto.
		// System.out.println(c);

	} // <- Fin del ámbito de las variables a y b
}
