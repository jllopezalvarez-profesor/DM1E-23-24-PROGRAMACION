package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio13;

public abstract class VehiculoMotor implements Vehiculo {
	private int numPlazas;
	private int velocidad;

	public VehiculoMotor(int numPlazas) {
		this.numPlazas = numPlazas;
		this.velocidad = 0;
	}

	int getVelocidad() {
		return velocidad;
	}
	
	@Override
	public void frenar(int cuanto) {
		this.velocidad -= cuanto;
		if (this.velocidad < 0) {
			this.velocidad = 0;
		}
	}

	@Override
	public void acelerar(int cuanto) {
		this.velocidad += cuanto;
		if (this.velocidad > VELOCIDAD_MAXIMA) {
			this.velocidad = VELOCIDAD_MAXIMA;
		}
	}
	
	@Override
	public int getNumPlazas() {
		return this.numPlazas;
	}
}
