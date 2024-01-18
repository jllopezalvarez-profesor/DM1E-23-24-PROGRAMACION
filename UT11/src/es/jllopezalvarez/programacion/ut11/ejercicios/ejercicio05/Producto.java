package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Producto {
	private LocalDate fechaCaducidad;
	private int lote;

	public Producto(LocalDate fechaCaducidad, int lote) {
		this.fechaCaducidad = fechaCaducidad;
		this.lote = lote;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return String.format("Lote %s, caduca %s", this.getLote(), formatter.format(this.getFechaCaducidad()));
	}
}
