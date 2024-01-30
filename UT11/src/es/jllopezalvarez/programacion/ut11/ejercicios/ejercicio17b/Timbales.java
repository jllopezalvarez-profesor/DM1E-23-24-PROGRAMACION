package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Timbales extends Percusion {
	private static final int DIFICULTAD = 6;
	private static final String NOMBRE_INSTRUMENTO = "timbales";

	public Timbales(String propietario) {
		super(propietario, DIFICULTAD);
	}

	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}

}
