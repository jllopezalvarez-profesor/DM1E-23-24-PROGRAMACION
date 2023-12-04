package es.jllopezalvarez.programacion.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * Crea un método contarOcurrencias que:
    • Recibe dos cadenas de texto:
        ◦ Una cadena que queremos buscar (A)
        ◦ Una segunda cadena (B) en la que queremos buscar la segunda cadena.
    • Devuelve el número de veces que la primera cadena (A) aparece en la segunda (B).
    • Si cualquiera de las cadenas es null devolverá cero.
    • No debe tener en cuenta mayúsculas o minúsculas.
Una de las formas de realizar este método es buscar la cadena A en la B tantas veces como sea necesario hasta que no se encuentre. Para esto, nos ayudará la sobrecarga del método indexOf que recibe dos parámetros.
Recuerda que una sobrecarga es una versión distinta de un método que hace un trabajo igual o similar, pero que recibe distintos parámetros.
Ejemplos:
    • contarOcurrencias(“a”, “Albacete") devuelve 2, “A” se considera igual que “a”
    • contarOcurrencias(“i”, “Albacete") devuelve 0
    • contarOcurrencias(“parte”, “la parte contratante de la primera parte”) devuelve 2
    • contarOcurrencias(null, “cadena”) devuelve 0
    • contarOcurrencias(“palabra”, null) devuelve 0
 * </pre>
 *
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		System.out.println(contarOcurrencias("a", "albacete"));
		System.out.println(contarOcurrencias("aa", "abcaabcaacbaaca"));
		System.out.println(contarOcurrencias("aa", "abcaaaaabcaacbaaca"));
		System.out.println(contarOcurrenciasNoSolapadas("aa", "abcaaaaabcaacbaaca"));
		System.out.println(contarOcurrencias("aa", "abcaaaaabcaacbaacaa"));
		System.out.println(contarOcurrenciasNoSolapadas("aa", "abcaaaaabcaacbaacaa"));

	}

	public static int contarOcurrencias(String buscada, String buscarEn) {
		if (buscada == null || buscarEn == null) {
			return 0;
		}

		buscada = buscada.toUpperCase();
		buscarEn = buscarEn.toUpperCase();

		int contador = 0;
		int posicionBusqueda = 0;
		int posicionEncontrada = buscarEn.indexOf(buscada);

		while (posicionEncontrada != -1) {
			contador++;
			posicionBusqueda = posicionEncontrada + 1;
			posicionEncontrada = buscarEn.indexOf(buscada, posicionBusqueda);
		}

		return contador;

	}

	public static int contarOcurrenciasNoSolapadas(String buscada, String buscarEn) {
		if (buscada == null || buscarEn == null) {
			return 0;
		}

		buscada = buscada.toUpperCase();
		buscarEn = buscarEn.toUpperCase();

		int contador = 0;
		int posicionBusqueda = 0;
		int posicionEncontrada = buscarEn.indexOf(buscada);

		while (posicionEncontrada != -1) {
			contador++;
			posicionBusqueda = posicionEncontrada + buscada.length(); // Saltamos la longitud de la cadena buscada
			posicionEncontrada = buscarEn.indexOf(buscada, posicionBusqueda);
		}

		return contador;

	}

}
//
//
//
//
//
//
//
//
//
//
