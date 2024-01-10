package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo04claseanidada;

import java.time.LocalDate;

import es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo04claseanidada.Persona.Fecha;

public class Programa {

	public static void main(String[] args) {
		// Podemos crear personas. Esto creará automáticamente un objeto de tipo Fecha
		// por cada persona

		// Esto crea una persona con el día 1/1/2020 como fecha de creación
		Persona persona1 = new Persona("José Luis");
		System.out.println(persona1);

		// Esto crea una persona con el día de hoy como fecha de creación
		LocalDate hoy = LocalDate.now();
		Persona persona2 = new Persona("Carlos", hoy.getDayOfMonth(), hoy.getMonthValue(), hoy.getYear());
		System.out.println(persona2);

		// Como la clase interna es pública podemos crear objetos, pero de una forma un
		// poco extraña. Como la clase interna es miembro de los objetos de tipo
		// Persona, necesitamos un objeto de tipo persona para crear un objeto de la
		// clase interna
		Fecha fecha = persona1.new Fecha(1, 1, 2029);
		System.out.println(fecha);

		// Esto de usar objeto.new puede evitarse si declaramos la clase interna como
		// estática, porque los miembros estáticos están disponibles cuando no se tienen
		// objetos de la clase:
		// public static class Fecha....
		// Ya se podría hacer:
		// Fecha fecha1 = new Fecha(2, 2, 2025);
	}

}
