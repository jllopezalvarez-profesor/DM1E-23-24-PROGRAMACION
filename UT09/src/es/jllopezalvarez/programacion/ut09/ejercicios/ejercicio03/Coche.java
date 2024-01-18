package es.jllopezalvarez.programacion.ut09.ejercicios.ejercicio03;

public class Coche {
	private boolean arrancado;
	private boolean haciaAtras;
	private final int velocidadMaxima;
	private final int velocidadMaximaAtras;
	private int velocidad;

	public Coche(boolean arrancado, boolean haciaAtras, int velocidadMaxima, int velocidadMaximaAtras, int velocidad) {
		this.arrancado = arrancado;
		this.haciaAtras = haciaAtras;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadMaximaAtras = -velocidadMaximaAtras;
		this.velocidad = velocidad;
	}

	public Coche(int velocidadMaxima, int velocidadMaximaAtras) {
		this(false, false, velocidadMaxima, velocidadMaximaAtras, 0);
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public boolean isHaciaAtras() {
		return haciaAtras;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public int getVelocidadMaximaAtras() {
		return velocidadMaximaAtras;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void arrancar() {
		if (this.arrancado) {
			throw new IllegalStateException("No se puede arrancar el coche porque ya está arrancado");
		}
		this.arrancado = true;
	}

	public void detener() {
		if (!this.arrancado) {
			throw new IllegalStateException("No se puede detener el coche porque no está arrancado");
		}
		this.arrancado = false;
	}

	public void ponerMarchaAtras() {
		if (this.velocidad != 0) {
			throw new IllegalStateException("No puedes poner marcha atrás si el coche está en movimiento.");
		}
		if (this.haciaAtras) {
			throw new IllegalStateException("No puedes poner marcha atrás si el ya está puesta la marcha atrás.");
		}
		this.haciaAtras = true;
	}

	public void quitarMarchaAtras() {
		if (this.velocidad != 0) {
			throw new IllegalStateException("No puedes quitar la marcha atrás si el coche está en movimiento.");
		}
		if (!this.haciaAtras) {
			throw new IllegalStateException("No puedes quitar la marcha atrás si el no está puesta.");
		}
		this.haciaAtras = false;
	}

	public void acelerar(int cuanto) {
		if (cuanto <= 0) {
			throw new IllegalArgumentException("El incremento de velocidad no puede ser menor o igual a cero.");
		}
		if (!haciaAtras) {
//			int nuevaVelocidad = this.velocidad + cuanto;
//			if (nuevaVelocidad > this.velocidadMaxima) {
//				nuevaVelocidad = this.velocidadMaxima;
//			}
//			this.velocidad = nuevaVelocidad;

			this.velocidad = Math.min(this.velocidad + cuanto, this.velocidadMaxima);
		} else {
			this.velocidad = Math.max(this.velocidad - cuanto, this.velocidadMaximaAtras);

		}
	}

	public void frenar(int cuanto) {
		if (cuanto <= 0) {
			throw new IllegalArgumentException("El incremento de velocidad no puede ser menor o igual a cero.");
		}
		if (!haciaAtras) {
			this.velocidad = Math.max(this.velocidad - cuanto, 0);
		} else {
			this.velocidad = Math.max(this.velocidad + cuanto, 0);

		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [arrancado=");
		builder.append(arrancado);
		builder.append(", haciaAtras=");
		builder.append(haciaAtras);
		builder.append(", velocidadMaxima=");
		builder.append(velocidadMaxima);
		builder.append(", velocidadMaximaAtras=");
		builder.append(velocidadMaximaAtras);
		builder.append(", velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}

}
