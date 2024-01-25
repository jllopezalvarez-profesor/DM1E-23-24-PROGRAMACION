package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio13;

public class Moto extends VehiculoMotor {

	private static final int NUM_PLAZAS = 2;

	public Moto() {
		super(NUM_PLAZAS);
	}

	@Override
	public void frenar(int cuanto) {
		super.frenar(cuanto);
		System.out.printf("Soy una moto y freno hasta %d km/h.\n", getVelocidad());
	}

	@Override
	public void acelerar(int cuanto) {
		super.acelerar(cuanto);
		System.out.printf("Soy una moto y acelero hasta %d km/h.\n", getVelocidad());
	}

}
