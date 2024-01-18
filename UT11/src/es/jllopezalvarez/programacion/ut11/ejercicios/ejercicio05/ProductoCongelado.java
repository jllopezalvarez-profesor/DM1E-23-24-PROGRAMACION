package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductoCongelado extends Producto {
	private int temperaturaCongelacion;

	public ProductoCongelado(LocalDate fechaCaducidad, int lote, int temperaturaCongelacion) {
		super(fechaCaducidad, lote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("Lote %s, caduca %s. Congelado a %s.", this.getLote(),
				formatter.format(this.getFechaCaducidad()), this.temperaturaCongelacion);
	}

}
