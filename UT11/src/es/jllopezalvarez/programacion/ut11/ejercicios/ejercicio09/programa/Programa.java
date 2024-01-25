package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.programa;

import java.util.Random;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Circulo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Cuadrado;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Figura;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.PoligonoRegular;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Rectangulo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Rombo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Romboide;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Triangulo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio09.figuras.Elipse;

public class Programa {

	private static final int NUM_FIGURAS = 15;
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
		switch (rnd.nextInt(8)) {
		case 1:
			return new Circulo(getDimensionAleatoria());
		case 2:
			return new Cuadrado(getDimensionAleatoria());
		case 3:
			return new Rectangulo(getDimensionAleatoria(), getDimensionAleatoria());
		case 4:
			return new Romboide(getDimensionAleatoria(), getDimensionAleatoria(), getDimensionAleatoria());
		case 5:
			return new Elipse(getDimensionAleatoria(), getDimensionAleatoria());
		case 6:
			return new PoligonoRegular(getDimensionAleatoria(), getDimensionAleatoria(), getDimensionAleatoria());
		case 7:
			return new Rombo(getDimensionAleatoria(), getDimensionAleatoria());
		default:
			return crearTrianguloAleatorio();
		}
	}

	private static int getDimensionAleatoria() {
		return rnd.nextInt(10) + 1;
	}

	private static Figura crearTrianguloAleatorio() {
		int ladoA = getDimensionAleatoria();
		int ladoB = getDimensionAleatoria();
		int ladoC;
		do {
			ladoC = getDimensionAleatoria();
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
		if (f instanceof Elipse) {
			return "Elipse";
		}
		if (f instanceof PoligonoRegular) {
			return "Poligono regular";
		}
		if (f instanceof Rombo) {
			return "Rombo";
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
