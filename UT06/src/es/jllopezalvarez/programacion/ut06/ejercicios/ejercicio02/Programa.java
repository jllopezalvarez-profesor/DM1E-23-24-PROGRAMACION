package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio02;

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
	}

	private static void mostrarPerro(Perro perro) {
		System.out.printf("Referencia: %s\n", perro);
		System.out.printf("Nombre: %s\n", perro.getNombre());
		System.out.printf("Raza: %s\n", perro.getRaza());
		System.out.printf("Propietario; %s\n", perro.getPropietario());
		System.out.printf("Edad: %02d\n", perro.getEdadAnios());
		System.out.printf("Peso: %.2f\n", perro.getPesoKg());
	}

}
