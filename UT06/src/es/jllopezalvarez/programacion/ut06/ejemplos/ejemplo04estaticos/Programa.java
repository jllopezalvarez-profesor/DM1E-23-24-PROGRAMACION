package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo04estaticos;

public class Programa {
	public static void main(String[] args) {
		Coche c1 = new Coche("1234", "Volvo", Color.ROJO);
		System.out.println(c1);
		Coche c2 = new Coche("4567", "Opel", Color.ROJO);
		System.out.println(c2);
		System.out.println(c1);
		Coche c3 = Coche.crearCocheAleatorio();
		System.out.println(c3);
		System.out.println(c3);
		System.out.println(c3);

		Coche[] coches = new Coche[10];
		for (int i = 0; i < coches.length; i++) {
			coches[i] = Coche.crearCocheAleatorio();
		}
		
		for (Coche coche : coches) {
			System.out.println(coche);
		}

//		System.out.println(Coche.getCuentaCoches());
//		for (int i = 0; i < 5; i++) {
//			Coche c2 = new Coche("1234", "Opel", Color.GRIS, 10);
//			System.out.println(Coche.getCuentaCoches());
//		}
//		
		System.out.printf("Introduce la velocidad del coche (máximo %d): ", Coche.VELOCIDAD_MAXIMA);
//		mostrarCoches(c1, c2);
//		c1.acelerar();
//		c2.frenar();
//		mostrarCoches(c1, c2);
//		c1.acelerar();
//		c2.frenar();	
//		mostrarCoches(c1, c2);

	}

	private static void mostrarCoches(Coche c1, Coche c2) {
		System.out.printf("C1: %d - C2: %d\n", c1.getVelocidad(), c2.getVelocidad());
	}

}
