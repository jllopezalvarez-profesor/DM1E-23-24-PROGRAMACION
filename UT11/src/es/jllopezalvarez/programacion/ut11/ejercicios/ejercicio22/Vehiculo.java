package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public abstract class Vehiculo {
	private String nombrePropietario;

	public Vehiculo(String nombrePropietario) {
		if (nombrePropietario == null || nombrePropietario.isBlank()) {
//		if (nombrePropietario.isBlank() || nombrePropietario == null) {
			throw new IllegalArgumentException("El nombre del propieratio no puede ser nulo o cadena en blanco.");
		}

		this.nombrePropietario = nombrePropietario;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

}
