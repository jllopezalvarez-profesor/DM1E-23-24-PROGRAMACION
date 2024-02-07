package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public class Camion extends VehiculoTerrestre{

	public Camion(String nombrePropietario, int numRuedas) {
		super(nombrePropietario, numRuedas);
		if (numRuedas < 4 || numRuedas > 16) {
			throw new IllegalArgumentException("El número de ruedas es incorrecto");
		}
	}

}
