package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.radio;
	}

	@Override
	public double area() {
		return Math.PI * this.radio * this.radio;
	}



}
