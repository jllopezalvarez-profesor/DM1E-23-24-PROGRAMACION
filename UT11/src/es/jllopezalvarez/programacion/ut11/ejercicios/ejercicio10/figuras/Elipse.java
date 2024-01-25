package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio10.figuras;

public class Elipse extends Conica {
	public Elipse(double semiejeMayor, double semiejeMenor) {
		super(semiejeMayor, semiejeMenor);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * Math.sqrt((Math.pow(getSemiejeMayor(), 2) + Math.pow(getSemiejeMenor(), 2)) / 2);
	}



}
