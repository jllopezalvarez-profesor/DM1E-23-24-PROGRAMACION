package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public abstract class VehiculoTerrestre extends Vehiculo {
	private int numRuedas;

	public VehiculoTerrestre(String nombrePropietario, int numRuedas) {
		super(nombrePropietario);
		this.numRuedas = numRuedas;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}

}
