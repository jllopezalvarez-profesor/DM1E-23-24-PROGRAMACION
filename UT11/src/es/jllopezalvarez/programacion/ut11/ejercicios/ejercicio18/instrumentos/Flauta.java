package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio18.instrumentos;

public class Flauta extends Viento {

	private static final int DIFICULTAD = 10;
	private static final Material MATERIAL = Material.MADERA;
	private static final String NOMBRE_INSTRUMENTO = "flauta";

	public Flauta(String propietario) {
		super(propietario, DIFICULTAD, MATERIAL);
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
		return String.format("Flauta - Propietario: %s - Dificultad: %d - Material: %s\n", this.getPropietario(),
				this.getDificultad(), this.getMaterial());
	}
}
