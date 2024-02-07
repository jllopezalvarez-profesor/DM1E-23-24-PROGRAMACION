package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.programa;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.imagenes.Imagen;

public class ProgramaImg {
	public static void main(String[] args) {
		Imagen img = new Imagen(10, 4);
		System.out.println(img);
		img.escalar(4);
		System.out.println(img);
		img.escalar(0.5);
		System.out.println(img);

	}
}
