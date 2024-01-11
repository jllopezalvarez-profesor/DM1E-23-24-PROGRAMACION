package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo00acceso.personas;

import java.time.LocalDate;

public class Empleado extends Persona {

	private String puesto;
	private String departamento;

	public Empleado(int id, String nombre, LocalDate fechaNacimiento, String puesto, String departamento) {
		super(id, nombre, fechaNacimiento);
		this.puesto = puesto;
		this.departamento = departamento;
	}

//	public Empleado(int id, String nombre, LocalDate fechaNacimiento, String puesto, String departamento) {
//		super(id, nombre, fechaNacimiento);
//		this.puesto = puesto;
//		this.departamento = departamento;
//	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return super.toString() + "\n"
				+ String.format("Empleado [id=%s, nombre=%s, fechaNacimiento=%s, puesto=%s, departamento=%s]", getId(),
						getNombre(), getFechaNacimiento(), puesto, departamento);
	}
	

}
