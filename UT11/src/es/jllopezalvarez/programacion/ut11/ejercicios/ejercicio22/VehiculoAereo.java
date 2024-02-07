package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public abstract class VehiculoAereo extends Vehiculo {
	private static final int MIN_ALTITUD_MAXIMA = 100;
	private static final int MAX_ALTITUD_MAXIMA = 10000;
	private final int altitudMaxima;

	public VehiculoAereo(String nombrePropietario, int altitudMaxima) {
		super(nombrePropietario);
		if (altitudMaxima < MIN_ALTITUD_MAXIMA || altitudMaxima > MAX_ALTITUD_MAXIMA) {
			throw new IllegalArgumentException("La altitud máxima no puede ser menor que tal y tal");
		}
		this.altitudMaxima = altitudMaxima;
	}

	public int getAltitudMaxima() {
		return altitudMaxima;
	}
}
