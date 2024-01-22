package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras;

public class Circulo extends Figura {

	private static final int NUM_LADOS = 0;
	
	private double radio;
	
	public Circulo(double radio) {
		super(NUM_LADOS);
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
