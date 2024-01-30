package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Pandereta extends Percusion {
	private static final int DIFICULTAD = 4;
	private static final String NOMBRE_INSTRUMENTO = "pandereta";

	public Pandereta(String propietario) {
		super(propietario, DIFICULTAD);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}

}
