package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17a.instrumentos;

public abstract class Cuerda extends Instrumento{
	private final int numCuerdas;

	public Cuerda(String propietario, int dificultad, int numCuerdas) {
		super(propietario, dificultad);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}
	
}

