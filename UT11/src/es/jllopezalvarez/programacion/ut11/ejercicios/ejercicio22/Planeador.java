package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public class Planeador extends VehiculoAereo implements Matriculable{

	private String matricula;

	public Planeador(String nombrePropietario, int altitudMaxima, String matricula) {
		super(nombrePropietario, altitudMaxima);
		this.matricula = matricula;
	}

	@Override
	public String getMatricula() {
		
		return this.matricula;
	}

}
