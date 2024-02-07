package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.imagenes;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio2021.figuras.Escalable;

public class Imagen implements Escalable {

	private int ancho;
	private int alto;

	public Imagen(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public String toString() {
		String salida = "";
		for (int fila = 0; fila < alto; fila++) {
			if (fila == 0 || fila == (alto - 1)) {
				salida += "-".repeat(ancho) + "\n";

			} else {
				salida += "|";
				salida += " ".repeat(ancho-2);
				salida += "|\n";
			}
		}
		return salida;
	}

	@Override
	public void escalar(double factor) {
		this.ancho *= factor;
		this.alto *= factor;
	}

}
