package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo04estaticos;

import java.util.Random;

public class Coche {

	public static final int VELOCIDAD_MAXIMA = 200;

	private static int cuentaCoches = 0;

	private String matricula;
	private String marca;
	private Color color;
	private int velocidad;

	public Coche(String matricula, String marca, Color color) {
		this(matricula, marca, color, 0);
	}

	public Coche(String matricula, String marca, Color color, int velocidad) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.velocidad = velocidad;
		cuentaCoches++;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", color=");
		builder.append(color);
		builder.append(", velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}

	public void acelerar(int cuanto) {
		this.velocidad += cuanto;
	}

	public void acelerar() {
		this.acelerar(5);
	}

	public void frenar(int cuanto) {
		this.velocidad -= cuanto;
	}

	public void frenar() {
		this.frenar(5);
	}

	public static int getCuentaCoches() {
		return cuentaCoches;
	}

	public static Coche crearCocheAleatorio() {
		Random rnd = new Random();

		Coche c = new Coche(String.valueOf(rnd.nextInt(1000000)), "Marca",
				Color.values()[rnd.nextInt(Color.values().length)]);
		return c;
	}
}
