package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos21interfaces;

public interface ImprimiblePantalla extends Imprimible {

	public default void imprimir() {
		System.out.println("Estoy en imprimir de imprimible pantalla");
	}
	
}
