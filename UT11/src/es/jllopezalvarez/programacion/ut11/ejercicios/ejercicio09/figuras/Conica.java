package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras;

public abstract class Conica extends Figura {
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
}
