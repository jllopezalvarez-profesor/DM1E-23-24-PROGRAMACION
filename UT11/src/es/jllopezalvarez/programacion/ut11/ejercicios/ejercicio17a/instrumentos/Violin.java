package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17a.instrumentos;

public class Violin extends Frotada {

	private static final int DIFICULTAD = 9;
	private static final int NUM_CUERDAS = 4;
	private static final String NOMBRE_INSTRUMENTO = "violín";

	public Violin(String propietario) {
		super(propietario, DIFICULTAD, NUM_CUERDAS);
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
		return String.format("Violín - Propietario: %s - Dificultad: %d - %d cuerdas\n", this.getPropietario(),
				this.getDificultad(), this.getNumCuerdas());
	}
}
