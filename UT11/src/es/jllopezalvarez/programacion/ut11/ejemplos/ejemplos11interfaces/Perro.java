package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos11interfaces;

public class Perro implements Imprimible {
	private String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void imprimir() {
		System.out.println(this.nombre);
	}

}
