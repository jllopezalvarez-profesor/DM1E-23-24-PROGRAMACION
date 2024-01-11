package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo02override;

import java.time.LocalDate;

public class Subclase extends Superclase {


	
	@Override
	public void muestraDiaActual() {
		System.out.printf("%s (en Subclase)\n", LocalDate.now());
	}

	@Override
	public void muestraDiaYHoraActual() {
		System.out.println("Añadido en subclase (antes)");
		super.muestraDiaYHoraActual();
		System.out.println("Añadido en subclase (después)");
	}
}
