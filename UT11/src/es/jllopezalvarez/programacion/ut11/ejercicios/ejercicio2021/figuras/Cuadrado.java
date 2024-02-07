package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.figuras;

public class Cuadrado extends Paralelogramo {
	private static final int NUM_LADOS = 4;

	public Cuadrado(double lado) {
		super(lado, lado);
	}

	public int getNumLados() {
		return NUM_LADOS;
	}

}
