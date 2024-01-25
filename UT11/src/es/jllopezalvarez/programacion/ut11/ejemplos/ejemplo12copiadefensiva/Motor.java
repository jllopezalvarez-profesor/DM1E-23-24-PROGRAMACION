package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo12copiadefensiva;

public class Motor {
	private final int cilindrada;
	private int revoluciones;
	
	public Motor(int cilindrada, int revoluciones) {
		this.cilindrada = cilindrada;
		this.revoluciones = revoluciones;
	}
	
	public void acelerar() {
		System.out.println("Motor acelerando");
		this.revoluciones+=10;
	}
	
	public int getRevoluciones() {
		return revoluciones;
	}

	public int getCilindrada() {
		return cilindrada;
	}
}
