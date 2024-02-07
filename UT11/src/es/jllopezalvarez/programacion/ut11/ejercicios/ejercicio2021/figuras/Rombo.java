package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.figuras;

public class Rombo extends Figura {
	private static final int NUM_LADOS = 4;
	private double diagonalMayor;
	private double diagonalMenor;

	public Rombo(double diagonalMayor, double diagonalMenor) {
		this.diagonalMayor = diagonalMayor;
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public double perimetro() {
		return 2 * Math.sqrt(Math.pow(this.diagonalMayor, 2) + Math.pow(this.diagonalMenor, 2));
	}

	@Override
	public double area() {

		return this.diagonalMayor * this.diagonalMenor / 2;
	}

	@Override
	public int getNumLados() {
		return NUM_LADOS;
	}

	@Override
	public void escalar(double factor) {
		this.diagonalMayor *= factor;
		this.diagonalMenor *= factor;
	}

}
