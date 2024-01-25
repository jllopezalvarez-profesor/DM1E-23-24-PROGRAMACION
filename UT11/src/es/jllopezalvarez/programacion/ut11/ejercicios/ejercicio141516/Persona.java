package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio141516;

public class Persona {
	private String nombre;
	private String apellido;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return nombre + " " + apellido;
	}

}
