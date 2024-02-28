package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

import java.util.Objects;

public abstract class Componente implements Comparable<Componente> {
	private final String numeroSerie;
	private final String nombre;
	private final String descripcion;
	
	public Componente(String numeroSerie, String nombre, String descripcion) {
		
		this.numeroSerie = numeroSerie;
		this.nombre = nombre;
		this.descripcion = descripcion;
		
		
	}
	
	public abstract double getConsumo();

	public String getNumeroSerie() {
		return numeroSerie;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroSerie.toLowerCase());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Componente other))
			return false;
		//Componente other = (Componente) obj;
		return this.numeroSerie.equalsIgnoreCase(other.numeroSerie);
	}
	
	@Override
	public int compareTo(Componente other) {
		return this.numeroSerie.toLowerCase().compareTo(other.numeroSerie.toLowerCase());
	}
	
	

}
