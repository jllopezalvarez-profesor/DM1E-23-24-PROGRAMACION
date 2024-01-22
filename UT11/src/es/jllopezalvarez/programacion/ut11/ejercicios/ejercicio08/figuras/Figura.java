package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras;

public abstract class Figura {

	private int numLados;
	
	public Figura(int numLados) {
		this.numLados = numLados;
	}

	public abstract double perimetro();

	public abstract double area();

	public int getNumLados() {
		return this.numLados;
	}

}
