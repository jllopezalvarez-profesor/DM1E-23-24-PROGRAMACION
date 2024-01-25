package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio12;

public class Coche implements Vehiculo {

	private int velocidad;
	private int numPlazas;

	public Coche(int numPlazas) {
		super();
		velocidad = 0;
		this.numPlazas = numPlazas;
	}

	@Override
	public void frenar(int cuanto) {
		this.velocidad -= cuanto;
		if (this.velocidad < 0) {
			this.velocidad = 0;
		}
		System.out.printf("Soy un coche y freno hasta %d km/h.\n", velocidad);
	}

	@Override
	public void acelerar(int cuanto) {
		this.velocidad += cuanto;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			this.velocidad = VELOCIDAD_MAXIMA;
		}
		System.out.printf("Soy un coche y acelero hasta %d km/h.\n", velocidad);	}

	@Override
	public int getNumPlazas() {
		return this.numPlazas;
	}

	public void aparcar() {
		System.out.println("Soy un coche y estoy aparcando.");
	}
}
