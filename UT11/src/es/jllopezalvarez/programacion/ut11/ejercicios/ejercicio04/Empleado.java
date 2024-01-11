package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio04;

public class Empleado {

	private String nombre;

	public Empleado() {
		this.nombre = "";
	}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return String.format("Empleado %s", this.nombre);
	}
}
