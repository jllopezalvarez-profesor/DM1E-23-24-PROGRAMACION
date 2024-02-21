package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio03;

import java.time.LocalDate;

public class Cliente {
	private String id;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String email;

	public Cliente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String email) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}

	/* Constructor "de copia" */
	public Cliente(Cliente cliente) {
		this.id = cliente.id;
		this.nombre = cliente.nombre;
		this.apellidos = cliente.apellidos;
		this.fechaNacimiento = cliente.fechaNacimiento;
		this.email = cliente.email;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return String.format("%d - %s %s - %s - Nacido %d", this.id, this.nombre, this.apellidos, this.email,
				this.fechaNacimiento);
	}

}
