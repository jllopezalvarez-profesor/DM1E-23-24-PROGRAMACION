package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio10.figuras;

public class Triangulo extends Figura {
	private static final int NUM_LADOS = 3;
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}

	@Override
	public double area() {
		double semiPerimetro = this.perimetro() / 2;
		return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
	}

	@Override
	public int getNumLados() {
		return NUM_LADOS;
	}

}
