package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos03equalsherencia;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo> {
	private String matricula;
	private String marca;
	private Color color;

	public Vehiculo(String matricula, String marca, Color color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public int compareTo(Vehiculo other) {
		return this.matricula.compareTo(other.matricula);
	}	
}
