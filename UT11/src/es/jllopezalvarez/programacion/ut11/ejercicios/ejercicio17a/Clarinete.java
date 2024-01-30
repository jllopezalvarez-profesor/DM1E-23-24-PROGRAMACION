package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17a;

public class Clarinete extends Viento {

	private static final int DIFICULTAD = 8;
	private static final Material MATERIAL = Material.MADERA;
	private static final String NOMBRE_INSTRUMENTO = "clarinete";

	public Clarinete(String propietario) {
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

}
