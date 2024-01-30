package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Tuba extends Viento {

	private static final int DIFICULTAD = 8;
	private static final Material MATERIAL = Material.METAL;
	private static final String NOMBRE_INSTRUMENTO = "tuba";

	public Tuba(String propietario) {
		super(propietario, DIFICULTAD, MATERIAL);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}

}
