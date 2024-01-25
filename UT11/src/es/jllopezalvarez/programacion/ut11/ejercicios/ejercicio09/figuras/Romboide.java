package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras;

public class Romboide extends Paralelogramo {

	private double ladoOblicuo;

	public Romboide(double base, double altura, double ladoOblicuo) {
		super(base, altura);
		this.ladoOblicuo = ladoOblicuo;
	}

	@Override
	public double perimetro() {
		return (this.getBase() + this.ladoOblicuo) * 2;
	}

}
