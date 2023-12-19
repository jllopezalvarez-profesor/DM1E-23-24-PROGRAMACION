package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio10;

import java.util.Random;

public class Programa {

	private static final int NUM_RECTANGULOS = 10;

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(5);
		Rectangulo r2 = new Rectangulo(2, 7);

		System.out.println(r1.getPerimetro());
		System.out.println(r2.getPerimetro());

		// int[] numeros = new int[NUM_RECTANGULOS];
		Rectangulo[] rectangulos = new Rectangulo[NUM_RECTANGULOS];

		for (int i = 0; i < rectangulos.length; i++) {
			rectangulos[i] = Rectangulo.nuevoRectanguloAleatorio();
		}

		for (int i = 0; i < rectangulos.length; i++) {
			System.out.printf("El area del rectángulo en la posición %d es %d y el perímetro es %d.\n", i,
					rectangulos[i].getArea(), rectangulos[i].getPerimetro());
		}

		if (r1.esMasAlto(r2)) {
			System.out.println("el primer rectángulo es más alto que el segundo");
		}
		else{
			System.out.println("el segundo rectángulo es más alto o igual que el primero");
		}
		
	}

}
