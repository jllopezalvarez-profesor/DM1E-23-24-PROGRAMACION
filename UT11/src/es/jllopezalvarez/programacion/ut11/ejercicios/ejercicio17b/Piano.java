package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Piano extends Percutida {

	private static final int DIFICULTAD = 7;
	private static final int NUM_CUERDAS = 230;
	private static final String NOMBRE_INSTRUMENTO = "piano";

	public Piano(String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}




}
