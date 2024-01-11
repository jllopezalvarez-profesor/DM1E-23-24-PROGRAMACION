package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio04;

public class Oficial extends Operario{

	public Oficial() {
		super();
	}

	public Oficial(String nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		 return String.format("%s -> %s", super.toString(), "Oficial");

//		return String.format("%s -> %s", super.toString(), this.getClass().getSimpleName());
	}

}
