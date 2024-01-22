package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.programa;

import java.util.Random;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Circulo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Cuadrado;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Figura;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Rectangulo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Romboide;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Triangulo;

public class Programa {

	private static final int NUM_FIGURAS = 10;
	private static Random rnd = new Random();

	public static void main(String[] args) {
		Figura[] figuras = new Figura[NUM_FIGURAS];

		for (int i = 0; i < figuras.length; i++) {
			figuras[i] = crearFiguraAleatoria();
		}
		
//		for (Figura figura : figuras) {
//			figura = crearFiguraAleatoria();
//		}

		mostrarFiguras(figuras);

	}

	private static Figura crearFiguraAleatoria() {
		switch (rnd.nextInt(5)) {
		case 1:
			return new Circulo(rnd.nextInt(10) + 1);
		case 2:
			return new Cuadrado(rnd.nextInt(10) + 1);
		case 3:
			return new Rectangulo(rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
		case 4:
			return new Romboide(rnd.nextInt(10) + 1, rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
		default:
			return crearTrianguloAleatorio();
		}
	}

	private static Figura crearTrianguloAleatorio() {
		int ladoA = rnd.nextInt(10) + 1;
		int ladoB = rnd.nextInt(10) + 1;
		int ladoC;
		do {
			ladoC = rnd.nextInt(10) + 1;
		} while ((ladoA >= (ladoB + ladoC)) || (ladoB >= (ladoA + ladoC)) || (ladoC >= (ladoA + ladoB)));
//		} while (!((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))));

		return new Triangulo(ladoA, ladoB, ladoC);
	}

	private static String getTipoFigura(Figura f) {
		if (f instanceof Circulo) {
			return "Circulo";
		}
		if (f instanceof Cuadrado) {
			return "Cuadrado";
		}
		if (f instanceof Rectangulo) {
			return "Rectángulo";
		}
		if (f instanceof Romboide) {
			return "Romboide";
		}
		return "Triángulo";
	}

	private static void mostrarFiguras(Figura[] figuras) {
		for (int i = 0; i < figuras.length; i++) {
			Figura figura = figuras[i];
			System.out.printf("La figura en la posición %d es '%s', su área es %.2f y su perímetro es %.2f\n", i+1,
					getTipoFigura(figura), figura.area(), figura.perimetro());
		}
	}

}
