package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio10;

import java.util.Random;

public class Rectangulo {
	private final int base;
	private final int altura;

	private static Random rnd = new Random();

	public Rectangulo(int lado) {
		this(lado, lado);
	}

	public Rectangulo(int base, int altura) {
		if (base < 1) {
			System.err.println("La base del rectángulo no puede ser menor que 1");
			base = 1;
		}
		this.base = base;
		if (altura < 1) {
			System.err.println("La altura del rectángulo no puede ser menor que 1");
			altura = 1;
		}
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	public int getPerimetro() {
		return (this.base + this.altura) * 2;
	}

	public int getArea() {
		return this.base * this.altura;
	}

	public boolean esMasAlto(Rectangulo other) {
//		if (this.altura > other.altura) {
//			return true;
//		} else {
//			return false;
//		}
		return this.altura > other.altura;
	}

	public boolean esMasAncho(Rectangulo other) {
		return this.base > other.base;
	}

	public int compararArea(Rectangulo other) {
		// V1
//		if (this.getArea() > other.getArea()) {
//			return 1;
//		} else if (this.getArea() < other.getArea()) {
//			return -1;
//		} else {
//			return 0;
//		}

		// V2
//		if (this.getArea() > other.getArea()) {
//			return 1;
//		}
//		if (this.getArea() < other.getArea()) {
//			return -1;
//		}
//		return 0;
		
		return Integer.compare(this.getArea(), other.getArea());

	}

	public static Rectangulo nuevoRectanguloAleatorio() {
		int base = rnd.nextInt(1, 10);
		int altura = rnd.nextInt(1, 10);
		return new Rectangulo(base, altura);
	}

}
