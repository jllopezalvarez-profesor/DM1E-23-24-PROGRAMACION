package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos12enum.ejemplo03uso;

public class Ejemplo02 {

	enum Potencia {
		BAJA, MEDIA, ALTA;
	}

	public static void main(String[] args) {

		Potencia p1 = Potencia.ALTA;
		Potencia p2 = Potencia.BAJA;

		if (p1.compareTo(p2) == 0) {
			System.out.printf("%s y %s son iguales\n", p1, p2);
		} else if (p1.compareTo(p2) < 0) {
			System.out.printf("%s está antes en la enumeración que %s\n", p1, p2);
		} else {
			System.out.printf("%s está después en la enumeración que %s\n", p1, p2);
		}

	}
}
