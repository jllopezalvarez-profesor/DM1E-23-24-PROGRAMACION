package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Xilofono extends Percusion {
	private static final int DIFICULTAD = 8;
	private static final String NOMBRE_INSTRUMENTO = "xilofono";

	public Xilofono(String propietario) {
		super(propietario, DIFICULTAD);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}

}
