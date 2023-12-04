package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio01;

public class Programa {

	public static void main(String[] args) {
		Perro perro = new Perro();
		mostrarPerro(perro);
	}

	private static void mostrarPerro(Perro perro) {
		System.out.printf("Nombre: %s\n", perro.getNombre());
		System.out.printf("Raza: %s\n", perro.getRaza());
		System.out.printf("Propietario; %s\n", perro.getPropietario());
		System.out.printf("Edad: %02d\n", perro.getEdadAnios());
		System.out.printf("Peso: %.2f\n", perro.getPesoKg());
	}

}
