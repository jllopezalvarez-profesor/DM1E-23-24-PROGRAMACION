package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo02;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
	private int identificador;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;

	public int getIdentificador() {
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
