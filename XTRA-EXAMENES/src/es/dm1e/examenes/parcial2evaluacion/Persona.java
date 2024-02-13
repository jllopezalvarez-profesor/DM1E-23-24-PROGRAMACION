package es.dm1e.examenes.parcial2evaluacion;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	private final String dni;
	private final String nombre;
	private final String apellidos;

	public Persona(String dni, String nombre, String apellidos) {
		if (dni == null || dni.isEmpty()) {
			throw new IllegalArgumentException("El DNI no puede ser nulo ni cadena vacía");
		}
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede ser nulo ni cadena vacía");
		}
		if (apellidos == null || apellidos.isEmpty()) {
			throw new IllegalArgumentException("Los apellidos no pueden ser nulo ni cadena vacía");
		}

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni.toLowerCase());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		return this.dni.equalsIgnoreCase(other.dni);
	}

	@Override
	public int compareTo(Persona other) {
		return this.dni.compareToIgnoreCase(other.dni);
	}

}
