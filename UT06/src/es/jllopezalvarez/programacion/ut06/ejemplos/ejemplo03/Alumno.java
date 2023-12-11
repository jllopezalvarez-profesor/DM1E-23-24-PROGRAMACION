package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.UUID;

public class Alumno {

	private UUID identificador;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;

	public Alumno() {
		this.identificador = UUID.randomUUID();
	}

	
	
	public Alumno(String nombre, String apellido, LocalDate fechaNacimiento) {
		this(UUID.randomUUID(), nombre, apellido, fechaNacimiento);
	}

	public Alumno(String identificador, String nombre, String apellido, LocalDate fechaNacimiento) {
		this(UUID.fromString(identificador), nombre, apellido, fechaNacimiento);
	}

	public Alumno(UUID identificador, String nombre, String apellido, LocalDate fechaNacimiento) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Alumno(String apellido, LocalDate fechaNacimiento) {
		this.identificador = UUID.randomUUID();
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void Rigoberto(LocalDate fechaNacimiento) {
		this.fechaNacimiento=fechaNacimiento;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		LocalDate hoy = this.getFechaActual();
		Period diferencia = Period.between(this.fechaNacimiento, hoy);
		System.out.printf("La diferencia es de %d años %d meses y %d días\n", diferencia.getYears(),
				diferencia.getMonths(), diferencia.getDays());

		return diferencia.getYears();
	}

	private LocalDate getFechaActual() {
		return LocalDate.now();
	}

}
