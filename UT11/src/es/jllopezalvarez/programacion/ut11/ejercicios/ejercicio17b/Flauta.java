package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Flauta extends Viento {

	private static final int DIFICULTAD = 10;
	private static final Material MATERIAL = Material.MADERA;
	private static final String NOMBRE_INSTRUMENTO = "flauta";

	public Flauta(String propietario) {
		super(propietario, DIFICULTAD, MATERIAL);
	}

	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}

}
