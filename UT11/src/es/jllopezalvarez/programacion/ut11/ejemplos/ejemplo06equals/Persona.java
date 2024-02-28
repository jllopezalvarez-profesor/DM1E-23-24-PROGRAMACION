package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo06equals;

import java.util.Objects;

public class Persona   {
	private String dni;
	private String nombre;
	private String apellidos;

	public Persona(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true; 	// Son dos referencias al mismo objeto. 
		if (obj == null) return false;	// x.equals(null) siempre false.
		if (getClass() != obj.getClass()) return false; // No son del mismo tipo
		Persona other = (Persona) obj;	// Se hace cast para poder comparar
		return Objects.equals(dni, other.dni); // Comparamos los DNI
	}
}
