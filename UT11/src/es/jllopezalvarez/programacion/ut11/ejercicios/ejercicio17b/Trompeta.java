package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public class Trompeta extends Viento {

	private static final int DIFICULTAD = 7;
	private static final Material MATERIAL = Material.METAL;
	private static final String NOMBRE_INSTRUMENTO = "trompeta";

	public Trompeta(String propietario) {
		super(propietario, DIFICULTAD, MATERIAL);
	}


	@Override
	protected String getNombreInstrumento() {
		
		return NOMBRE_INSTRUMENTO;
	}


}
