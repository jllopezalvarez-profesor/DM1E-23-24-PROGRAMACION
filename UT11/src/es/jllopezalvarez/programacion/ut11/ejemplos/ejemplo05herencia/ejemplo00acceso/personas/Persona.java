package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo00acceso.personas;

import java.time.LocalDate;

public  class Persona {
	private int id;
	private String nombre;
	private LocalDate fechaNacimiento;


	
	public Persona(int id, String nombre, LocalDate fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	protected void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public final int getedad() {
		//TODO: hacer el cálculo de la edad y no devover el 40 "a pelo"
		return 40;
	}

	@Override
	public String toString() {
		return String.format("Persona [id=%s, nombre=%s, fechaNacimiento=%s]", id, nombre, fechaNacimiento);
	}

}
