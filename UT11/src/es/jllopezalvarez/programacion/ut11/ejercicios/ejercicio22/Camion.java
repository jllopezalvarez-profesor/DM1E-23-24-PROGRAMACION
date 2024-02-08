package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public class Camion extends VehiculoTerrestre implements Matriculable {

	private int cargaMaxima;
	private String matricula;

	public Camion(String nombrePropietario, int numRuedas, int cargaMaxima, String matricula) {
		super(nombrePropietario, numRuedas);
		if (numRuedas < 4 || numRuedas > 16) {
			throw new IllegalArgumentException("El número de ruedas es incorrecto");
		}
		if (cargaMaxima < 0 || cargaMaxima > 40000) {
			throw new IllegalArgumentException("La carga es incorrecta");
		}

		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return this.matricula;
	}

}
