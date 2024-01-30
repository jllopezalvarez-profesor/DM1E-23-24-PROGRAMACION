package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio141516;

public class Persona implements Comparable<Persona> {
	private int edad;
	private String nombre;
	private String apellido;

	public Persona(int edad, String nombre, String apellido) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return edad + " - " + nombre + " " + apellido;
	}

	@Override
	public int compareTo(Persona other) {
		// Por edad
		return Integer.compare(this.edad, other.edad);
		
//		if (this.edad>other.edad) return 1;
//		if (this.edad<other.edad) return -1;
//		return 0;
		
		
		//return this.edad.com
		
		// Por nombre
//		return this.nombre.compareTo(other.nombre);
	}

}
