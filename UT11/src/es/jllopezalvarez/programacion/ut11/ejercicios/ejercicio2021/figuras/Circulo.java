package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.figuras;

public class Circulo extends Conica {

	
	public Circulo(double radio) {
		super(radio, radio);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.getSemiejeMayor();
	}



}
