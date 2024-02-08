package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio22;

public class Ultraligero extends VehiculoAereo implements Matriculable{

	private String matricula;

	public Ultraligero(String nombrePropietario, int altitudMaxima, String matricula) {
		super(nombrePropietario, altitudMaxima);
		this.matricula = matricula;
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return this.matricula;
	}

}
