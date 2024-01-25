package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo12copiadefensiva;

import java.util.Objects;

public class Monitor {
	private String marca;
	private String modelo;
	private int numeroSerie;

	public Monitor(String marca, String modelo, int numeroSerie) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie=numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monitor other = (Monitor) obj;
		return numeroSerie == other.numeroSerie;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) return true;
//		if (obj == null) return false;
//		if (!this.getClass().equals(obj.getClass())) return false;
//		Monitor otro = (Monitor)obj;
//		return this.numeroSerie == otro.numeroSerie;
//	}
	

	

}
