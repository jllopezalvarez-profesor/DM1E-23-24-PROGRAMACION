package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases;

final class IncrementosPrecio {
	// Esta clase es una clase de utilidad para tener
	// sólo constantes con incrementos de precio
	// Con el constructor privado evitamos que se
	// puedan construir un objeto de este tipo
	// Con "final class" hacemos que no pueda heredarse
	private IncrementosPrecio() {
	}

	static final double INCREMENTO_CONSUMO_A = 100;
	static final double INCREMENTO_CONSUMO_B = 80;
	static final double INCREMENTO_CONSUMO_C = 60;
	static final double INCREMENTO_CONSUMO_D = 50;
	static final double INCREMENTO_CONSUMO_E = 30;
	static final double INCREMENTO_CONSUMO_F = 10;

	
	static final double INCREMENTO_PESO_0_20 = 10;
	static final double INCREMENTO_PESO_20_50 = 50;
	static final double INCREMENTO_PESO_50_80 = 80;
	static final double INCREMENTO_PESO_80_MAS = 100;

	static final double INCREMENTO_ALTA_CARGA = 50;

	static final double FACTOR_INCREMENTO_PULGADAS = 0.3;
	static final double INCREMENTO_TDT2 = 50;
}