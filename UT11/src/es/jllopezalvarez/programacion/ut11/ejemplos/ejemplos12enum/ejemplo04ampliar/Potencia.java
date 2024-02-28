package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos12enum.ejemplo04ampliar;

public enum Potencia {
	ALTA("Más de 1000W"), 
	MEDIA("Entre 300 y 1000W"), 
	BAJA("Menos de 300W");

	private String descripcion;

	private Potencia(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
}
