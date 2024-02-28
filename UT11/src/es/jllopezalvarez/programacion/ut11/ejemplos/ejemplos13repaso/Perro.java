package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

import java.io.EOFException;
import java.util.Objects;

public class Perro extends Animal implements Mamifero, Comparable<Perro> {
	private static final String NOMBRE_ESPECIE = "PERRO";
	private static int MAX_EDAD = 15;

	private String nombre;
	private int edad;

	public Perro(String nombre, int edad) {
		this.nombre = nombre;
		this.setEdad(edad);

	}

	private void setEdad(int edad) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad no puedes ser menor que cero;");
		}
		if (edad > 15) {
			throw new IllegalArgumentException("La edad no puedes ser mayor que 15;");
		}
		this.edad = edad;
	}

	@Override
	public void comer(String alimento) {
		System.out.printf("Soy un %s, me llamo %s y estoy comiendo %s\n", NOMBRE_ESPECIE,
				this.nombre, alimento);
	}

	@Override
	public void amamantar(int numCrias) {
		System.out.printf("Soy un %s, me llamo %s y estoy amamantando %s\n", NOMBRE_ESPECIE,
				this.nombre, numCrias);

	}

	@Override
	public void darALuz(int numCrias) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Perro o) {
		return this.nombre.compareTo(o.nombre);
//		if (this.edad < o.edad) return -1;
//		if (this.edad > o.edad) return 1;
//		return 0;

		// return Integer.compare(this.edad, o.edad);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Perro [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append("]");
		return builder.toString();
	}

	public int getEdad() {
		return edad;
	}
}
