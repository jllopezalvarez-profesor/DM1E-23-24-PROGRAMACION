package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Clarinete extends Viento {

	private static final int DIFICULTAD = 8;
	private static final Material MATERIAL = Material.MADERA;
	private static final String NOMBRE_INSTRUMENTO = "clarinete";

	public Clarinete(String propietario) {
		super(propietario, DIFICULTAD, MATERIAL);
	}
	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}

}
