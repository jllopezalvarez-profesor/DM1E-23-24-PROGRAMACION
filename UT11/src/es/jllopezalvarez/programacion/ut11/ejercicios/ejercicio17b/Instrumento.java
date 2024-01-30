package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio17b;

public abstract class Instrumento {
	private final String propietario;
	private final int dificultad;

	public Instrumento(String propietario, int dificultad) {
		this.propietario = propietario;
		this.dificultad = dificultad;
	}

	public String getPropietario() {
		return propietario;
	}

	public int getDificultad() {
		return dificultad;
	}

	protected abstract String getNombreInstrumento();

	public void tocar() {
		System.out.printf("El %s de %s empieza a tocar.\n", this.getNombreInstrumento(), this.getPropietario());
	}

	public void parar() {
		System.out.printf("El %s de %s deja de tocar.\n", this.getNombreInstrumento(), this.getPropietario());
	}

	boolean esMasDificil(Instrumento other) {
		return this.dificultad > other.dificultad;
	}

}
