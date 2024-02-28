package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

public class ProcesadorArm extends Procesador {

	public ProcesadorArm(String numeroSerie, String nombre, String descripcion, int numeroNucleos) {
		super(numeroSerie, nombre, descripcion, numeroNucleos);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public  double getConsumo() {
		return this.getNumeroNucleos() * 10;
	}

	public int getFactorDeRidiculez() {
		return (int) (Math.random() * 100);
	}

}
