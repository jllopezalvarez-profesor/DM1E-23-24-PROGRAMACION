package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo02override;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Superclase {
	public void muestraDiaActual() {
		System.out.printf("%s\n", LocalDate.now());
	}

	public void muestraHoraActual() {
		System.out.printf("%s\n", LocalTime.now());
	}

	public void muestraDiaYHoraActual() {
		System.out.printf("%s\n", LocalDateTime.now());
	}

}
