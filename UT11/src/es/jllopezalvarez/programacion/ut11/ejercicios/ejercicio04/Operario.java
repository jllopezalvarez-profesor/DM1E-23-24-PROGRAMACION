package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio04;

public class Operario extends Empleado{

	public Operario() {
		super();
	}

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return String.format("%s -> %s", super.toString(), "Operario");
		//return String.format("%s -> %s", super.toString(), this.getClass().getSimpleName());
	}
}
