package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio02;

import java.time.LocalDate;
import java.time.Period;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio01.Fecha;

public class Persona {
	private String nombre;
	private String direccion;
	private String codPostal;
	private String ciudad;
	private Fecha fechaNacimiento;

	public Persona(String nombre, String direccion, String codPostal, String ciudad, Fecha fecha) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fecha) {
		this.fechaNacimiento = fecha;
	}

	public boolean esMayorDeEdadB() {
		LocalDate fechaActual = LocalDate.now();
		int anioActual = fechaActual.getYear();
		int mesActual = fechaActual.getMonthValue();
		int diaActual = fechaActual.getDayOfMonth();

		int diferenciaAnios = anioActual - this.fechaNacimiento.getAnio();
		if (diferenciaAnios < 18)
			return false;
		if (diferenciaAnios > 18)
			return true;
		int diferenciaMeses = mesActual - this.fechaNacimiento.getMes();
		if (diferenciaMeses > 0)
			return true;
		if (diferenciaMeses < 0)
			return false;
		int diferenciaDias = diaActual - this.fechaNacimiento.getDia();
		if (diferenciaDias >= 0)
			return true;

		return false;
	}

	public boolean esMayorDeEdad() {
		LocalDate hoy = LocalDate.now();
		LocalDate fechaNac = LocalDate.of(this.fechaNacimiento.getAnio(), this.fechaNacimiento.getMes(),
				this.fechaNacimiento.getDia());
		Period tiempoVida = Period.between(fechaNac, hoy);
		return tiempoVida.getYears() >= 18;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre: ");
		builder.append(nombre);
		builder.append("\nFecha de nacimiento: ");
		builder.append(fechaNacimiento);	
		builder.append("\nDirección: ");
		builder.append(direccion);
		builder.append("\n");
		builder.append(codPostal);
		builder.append(" ");
		builder.append(ciudad);
		return builder.toString();
	}	

}
