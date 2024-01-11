package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio04;

public class Tecnico extends Operario {

	public Tecnico() {
		super();
	}

	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return String.format("%s -> %s", super.toString(), "Técnico");
		// return String.format("%s -> %s", super.toString(), this.getClass().getSimpleName());
	}

}
