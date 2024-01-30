package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17a;

public class Arpa extends Pulsada {

	private static final int DIFICULTAD = 10;
	private static final int NUM_CUERDAS = 47;
	private static final String NOMBRE_INSTRUMENTO = "arpa";

	public Arpa(String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
	}

	@Override
	public void tocar() {
		System.out.printf("El %s de %s empieza a tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());
	}

	@Override
	public void parar() {
		System.out.printf("El %s de %s deja de tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());
	}

}
