package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos11interfaces.ejemplo05anonimas;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Persona implements Comparable<Persona> {
	private int id = new Random().nextInt();
	private String nombre;

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]\n");
		return builder.toString();
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public static int compararPersonas(Persona o1, Persona o2) {
		return Integer.compare(o1.getId(), o2.getId());

	}

	@Override
	public int compareTo(Persona o) {
		return Integer.compare(this.id, o.id);
	}

	public static Comparator<Persona> getByNombreComparator() {
		return new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}

		};
	}

}
