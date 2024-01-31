package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17a.instrumentos;

public class Timbales extends Percusion {
	private static final int DIFICULTAD = 6;
	private static final String NOMBRE_INSTRUMENTO = "timbales";

	public Timbales(String propietario) {
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
		return String.format("Timbales - Propietario: %s - Dificultad: %d\n", this.getPropietario(),
				this.getDificultad());
	}
}
