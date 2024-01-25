package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio10.figuras;

public abstract class Conica extends Figura {
	private static final int NUM_LADOS = 0;
	
	private double semiejeMayor;
	private double semiejeMenor;
	

	public Conica(double semiejeMayor, double semiejeMenor) {
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;
	}
	
	double getSemiejeMenor() {
		return semiejeMenor;
	}
	
	double getSemiejeMayor() {
		return semiejeMayor;
	}
	
	@Override
	public double area() {
		return Math.PI * this.semiejeMayor * this.semiejeMenor;
	}
	
	@Override
	public int getNumLados() {
		return NUM_LADOS;
	}

}
