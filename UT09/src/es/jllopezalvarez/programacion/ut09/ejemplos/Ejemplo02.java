package es.jllopezalvarez.programacion.ut09.ejemplos;

public class Ejemplo02 {
	public static void main(String[] args) {
		System.out.println("En main antes");
		metodoA();
		System.out.println("En main después");
	}

	private static void metodoA() {
		System.out.println("En A antes");
		metodoB();
		System.out.println("En A después");
	}

	private static void metodoB() {
		System.out.println("En B antes");
		try {
			metodoC();
		} catch (Exception e) {
			System.out.println("Se ha producido una excepción al llamar a metodoC");
		}
		System.out.println("En B después");
	}

	private static void metodoC() {
		System.out.println("En C antes");
		int n = Integer.valueOf("Hola");
		System.out.println("En C después");
		
	}

}
