package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductoRefrigerado extends Producto {
	private String codigoSupervisor;

	public ProductoRefrigerado(LocalDate fechaCaducidad, int lote, String codigoSupervisor) {
		super(fechaCaducidad, lote);
		this.codigoSupervisor = codigoSupervisor;
	}
	
	public String getCodigoSupervisor() {
		return codigoSupervisor;
	}
	
	public void setCodigoSupervisor(String codigoSupervisor) {
		this.codigoSupervisor = codigoSupervisor;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		return String.format("Lote %s, caduca %s. Regulado por %s.", this.getLote(),
				formatter.format(this.getFechaCaducidad()), this.codigoSupervisor);
	
	}
}
