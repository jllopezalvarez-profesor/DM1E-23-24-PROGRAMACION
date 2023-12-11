package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio05Ennum;

public class Programa {

	public static void main(String[] args) {
		Perro perro = new Perro();
		mostrarPerro(perro);

		perro.setNombre("Lassie");
		perro.setRaza("Rough Collie");
		perro.setPropietario("Martin Smith");
		perro.setEdadAnios(7);
		perro.setPesoKg(22.62);

		mostrarPerro(perro);

		perro.setPropietario("Mary Peterson");

		mostrarPerro(perro);

		System.out.printf("Peso del perro antes de empezar: %.4f\n", perro.getPesoKg());
		perro.comer(250);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		perro.jugar(0);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		perro.jugar(15);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		perro.comer(100);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		perro.comer(-5);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		perro.jugar(8);
		System.out.printf("Peso del perro: %.4f\n", perro.getPesoKg());
		perro.comer(250);
		System.out.printf("Peso del perro al final: %.4f\n", perro.getPesoKg());

		System.out.printf("Posición del perro al inicio: %s\n", perro.getPosicion());
		perro.tumbarse();
		System.out.printf("Posición del perro: %s\n", perro.getPosicion());
		perro.ponerseDePie();
		System.out.printf("Posición del perro al final: %s\n", perro.getPosicion().ordinal());
		

	for (Posicion pos : Posicion.values()) {
		System.out.println(pos);
	}
	
	
		
	}

	private static void mostrarPerro(Perro perro) {
		System.out.printf("Referencia: %s\n", perro);
		System.out.printf("Nombre: %s\n", perro.getNombre());
		System.out.printf("Raza: %s\n", perro.getRaza());
		System.out.printf("Propietario; %s\n", perro.getPropietario());
		System.out.printf("Edad: %02d\n", perro.getEdadAnios());
		System.out.printf("Peso: %.2f\n", perro.getPesoKg());
		System.out.printf("Posicion: %s\n", perro.getPosicion());
	}

}
