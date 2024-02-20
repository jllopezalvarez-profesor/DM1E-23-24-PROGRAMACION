package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos04comparable;

public class Coche extends Vehiculo {
	private boolean electric;
	
	
	
	public Coche(String matricula, String marca, Color color, boolean isElectric) {
		super(matricula, marca, color);
		this.electric = isElectric;
	}



	public boolean isElectric() {
		return electric;
	}
	
}
