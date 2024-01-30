package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Violin extends Frotada {

	private static final int DIFICULTAD = 9;
	private static final int NUM_CUERDAS = 4;
	private static final String NOMBRE_INSTRUMENTO = "violín";

	public Violin(String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}


}
