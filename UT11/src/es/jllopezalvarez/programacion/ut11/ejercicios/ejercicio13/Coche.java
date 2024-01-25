package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio13;

public class Coche extends VehiculoMotor {


	public Coche(int numPlazas) {
		super(numPlazas);
	}

	@Override
	public void frenar(int cuanto) {
		super.frenar(cuanto);
		System.out.printf("Soy un coche y freno hasta %d km/h.\n", getVelocidad());
	}

	@Override
	public void acelerar(int cuanto) {
		super.acelerar(cuanto);
		System.out.printf("Soy un coche y acelero hasta %d km/h.\n", getVelocidad());	}



	public void aparcar() {
		System.out.println("Soy un coche y estoy aparcando.");
	}
}
