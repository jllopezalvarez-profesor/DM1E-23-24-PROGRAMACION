package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

public class ProcesadorAmd extends Procesador{
	private final int versionJuegoInstrucciones;

	public ProcesadorAmd(String numeroSerie, String nombre, String descripcion, int numeroNucleos,
			int versionJuegoInstrucciones) {
		super(numeroSerie, nombre, descripcion, numeroNucleos);
		this.versionJuegoInstrucciones = versionJuegoInstrucciones;
	}


	
	

}
