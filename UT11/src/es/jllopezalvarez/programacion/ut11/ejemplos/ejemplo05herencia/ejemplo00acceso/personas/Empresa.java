package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo00acceso.personas;

import java.time.LocalDate;

public class Empresa {
	private Persona[] personas;

	public Empresa(int numeroDePersonas) {
		this.personas = new Persona[numeroDePersonas];
	}
	
	public void cambiarNombreATodos(String nuevoNombre) {
		for (Persona persona : personas) {
			persona.setNombre(nuevoNombre);
		}
	}
	
	public void cambiarFechaATodos(LocalDate fechaNacimiento) {
		for (Persona persona : personas) {
			persona.setFechaNacimiento(fechaNacimiento);
		}
	}
	
	

}
