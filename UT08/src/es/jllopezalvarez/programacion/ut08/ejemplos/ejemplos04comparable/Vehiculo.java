package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos04comparable;

import java.util.Objects;

public class Vehiculo {
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
		return Objects.hash(marca, matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula);
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(color, marca, matricula);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof Vehiculo))
//			return false;
//		Vehiculo other = (Vehiculo) obj;
//		return color == other.color && Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula);
//	}

	
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) return true;
//		if (other == null) return false;
//		if (this.getClass() != obj.getClass()) return false;
//		Vehiculo other = (Vehiculo)obj;
//		return this.matricula.equals(other.matricula);
//	}
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(this.matricula);
//	}
//	
	
}
