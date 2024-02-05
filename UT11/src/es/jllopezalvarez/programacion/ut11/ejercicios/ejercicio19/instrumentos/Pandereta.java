package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19.instrumentos;

public class Pandereta extends Percusion {
	private static final int DIFICULTAD = 4;
	private static final String NOMBRE_INSTRUMENTO = "pandereta";

	public Pandereta(String propietario) {
		super(propietario, DIFICULTAD);
	}

	@Override
	public void tocar() {
		System.out.printf("El %s de %s empieza a tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());
	}

	@Override
	public void parar() {
		System.out.printf("El %s de %s deja de tocar.\n", NOMBRE_INSTRUMENTO, this.getPropietario());
	}
	
	@Override
	public String toString() {
		return String.format("Pandereta - Propietario: %s - Dificultad: %d\n", this.getPropietario(),
				this.getDificultad());
	}
}
