package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio02.solucion;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellidos;
	private CicloFormativo cicloFormativo;
	private Curso curso;
	private LocalDate fechaNacimiento;

	public Alumno(String dni, String nombre, String apellidos, CicloFormativo cicloFormativo, Curso curso,
			LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cicloFormativo = cicloFormativo;
		this.curso = curso;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Alumno(String dni) {
		this.dni = dni;
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

	public CicloFormativo getCicloFormativo() {
		return cicloFormativo;
	}

	public Curso getCurso() {
		return curso;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(dni);
		builder.append(" - ");
		builder.append(nombre);
		builder.append(" ");
		builder.append(apellidos);
		builder.append(" - ");
		builder.append(curso);
		builder.append(" ");
		builder.append(cicloFormativo);
		builder.append(" - ");
		builder.append(fechaNacimiento);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	
	

}
