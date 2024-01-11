package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo01;

public class SuperClase {
	private int numero;

	public SuperClase(int numero) {
		this.setNumero(numero); // this.numero = numero;
		System.out.println("En el constructor con 1 parámetro de la superclase.");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}