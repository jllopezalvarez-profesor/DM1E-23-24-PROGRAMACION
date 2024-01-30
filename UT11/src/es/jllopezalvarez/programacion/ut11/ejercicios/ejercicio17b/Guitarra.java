package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Guitarra extends Pulsada {

	private static final int DIFICULTAD = 7;
	private static final int NUM_CUERDAS = 6;
	private static final String NOMBRE_INSTRUMENTO = "guitarra";

	public Guitarra(String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}


}
