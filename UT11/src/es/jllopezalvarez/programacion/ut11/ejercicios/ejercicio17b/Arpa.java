package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Arpa extends Pulsada {

	private static final int DIFICULTAD = 10;
	private static final int NUM_CUERDAS = 47;
	private static final String NOMBRE_INSTRUMENTO = "arpa";

	public Arpa(String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
	}
	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}
}
