package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras;

public class PoligonoRegular extends Figura {
	private int numLados;
	private double apotema;
	private double lado;

	public PoligonoRegular(int numLados, double apotema, double lado) {
		this.numLados = numLados;
		this.apotema = apotema;
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		return this.lado * numLados;
	}

	@Override
	public double area() {
		return this.perimetro() * this.apotema / 2;
	}

}
