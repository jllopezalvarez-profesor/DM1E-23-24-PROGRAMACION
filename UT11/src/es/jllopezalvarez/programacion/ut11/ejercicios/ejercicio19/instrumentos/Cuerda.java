package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19.instrumentos;

public abstract class Cuerda extends Instrumento implements Afinable{
	private final int numCuerdas;

	public Cuerda(String propietario, int dificultad, int numCuerdas) {
		super(propietario, dificultad);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}
	
}

