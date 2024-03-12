package es.jllopezalvarez.programacion.ut09.ejemplos;

public class Ejemplo04Error {
	public static void main(String[] args) {
		provocarStackOverflow();
	}

	private static void provocarStackOverflow() {
		provocarStackOverflow();

	}

}
