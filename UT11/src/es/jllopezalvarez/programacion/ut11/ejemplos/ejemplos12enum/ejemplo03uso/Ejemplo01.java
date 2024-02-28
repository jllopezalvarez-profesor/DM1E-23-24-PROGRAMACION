package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos12enum.ejemplo03uso;

public class Ejemplo01 {

	enum Color {
		ROJO, VERDE, AZUL;
	}

	public static void main(String[] args) {
		Color arrayColores[] = Color.values();
		for (Color color : arrayColores) {
			System.out.printf("%s tiene un ordinal %d\n", color, color.ordinal());
		}
		System.out.println("-".repeat(30));

		System.out.printf("Valor de 'ROJO': %s\n", Color.valueOf("ROJO"));
		System.out.printf("Valor de 'VERDE': %s\n", Color.valueOf("VERDE"));
		System.out.printf("Valor de 'AZUL': %s\n", Color.valueOf("AZUL"));
	}
}


