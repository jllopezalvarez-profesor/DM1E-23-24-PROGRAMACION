package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio01;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
		this(1, 1, 1970);
	}

	public Fecha(int dia, int mes, int anio) {
		if (anio == 0) {
			throw new IllegalArgumentException("El año no puede ser cero.");
		}

		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("El mes tiene que ser un número entre 1 y 12 ambos incluidos.");
		}

		if (dia < 1) {
			throw new IllegalArgumentException("El día no puede ser menor que uno.");
		}

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 31) {
				throw new IllegalArgumentException("El día no puede ser menor mayor que 31.");
			}
			break;
		case 4, 6, 9, 11:
			if (dia > 30) {
				throw new IllegalArgumentException("El día no puede ser menor mayor que 30.");
			}
			break;
		default: // Será el 2 obligatoriamente

			// Opción 1: if/else que llama a esBisiesto
//			if (esBisiesto(anio)) {
//				if (dia > 29) {
//					throw new IllegalArgumentException("El día no puede ser menor mayor que 29.");
//				}
//			} else {
//				if (dia > 28) {
//					throw new IllegalArgumentException("El día no puede ser menor mayor que 28.");
//				}
//			}

			// Opción 2: variable con el número de días, que inicializamos según el
			// resultado de "esBisiesto"
//			int numDias;
//			if (esBisiesto(anio)) {
//				numDias = 29;
//			} else {
//				numDias = 28;
//			}
//			if (dia > numDias) {
//				throw new IllegalArgumentException(String.format("El día no puede ser menor mayor que %d.", numDias));
//			}

			// Opción 3: igual que la 2, pero usamos el operador ternario para abreviar.
			int ultimoDiaFebrero = esBisiesto(anio) ? 29 : 28;
			if (dia > ultimoDiaFebrero) {
				throw new IllegalArgumentException(
						String.format("El día no puede ser menor mayor que %d.", ultimoDiaFebrero));
			}
			break;
		}

		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1) {
			throw new IllegalArgumentException("El día no puede ser menor que uno.");
		}

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 31) {
				throw new IllegalArgumentException("El día no puede ser menor mayor que 31.");
			}
			break;
		case 4, 6, 9, 11:
			if (dia > 30) {
				throw new IllegalArgumentException("El día no puede ser menor mayor que 30.");
			}
			break;
		default: // Será el 2 obligatoriamente
			int ultimoDiaFebrero = esBisiesto(anio) ? 29 : 28;
			if (dia > ultimoDiaFebrero) {
				throw new IllegalArgumentException(
						String.format("El día no puede ser menor mayor que %d.", ultimoDiaFebrero));
			}
			break;
		}

		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("El mes tiene que ser un número entre 1 y 12 ambos incluidos.");
		}
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if (anio == 0) {
			throw new IllegalArgumentException("El año no puede ser cero.");
		}
		// Cambio de año bisiesto a no bisiesto y el día es el último de febrero
		if (mes == 2 && dia == 29 && !esBisiesto(anio)) {
			throw new IllegalArgumentException(
					"El año no es válido porque el día y el mes son 29/02 y el año no es bisiesto.");
		}
		this.anio = anio;
	}

	private boolean esBisiesto(int anioAComprobar) {
		return (((anioAComprobar % 4 == 0) && (anioAComprobar % 100 != 0)) || (anioAComprobar % 400 == 0));
	}

	public void diaSiguiente() {
		if (enUltimoDiaAnio()) {
			this.dia = 1;
			this.mes = 1;
			if (this.anio == -1) {
				this.anio = 1;
			} else {
				this.anio++;
			}
		} else if (enUltimoDiaMes()) {
			this.dia = 1;
			this.mes++;
		} else {
			dia += 1;
		}
	}

	private boolean enUltimoDiaMes() {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return this.dia == 31;
		case 4, 6, 9, 11:
			return this.dia == 30;
		default: // Será el 2 obligatoriamente
			int ultimoDiaFebrero = esBisiesto(anio) ? 29 : 28;
			return this.dia == ultimoDiaFebrero;
		}
	}

	private boolean enUltimoDiaAnio() {
		return this.mes == 12 && this.dia == 31;
	}

	public String toString() {
		return String.format("%02d-%02d-%02d", dia, mes, anio);
	}

	public boolean esMayorQue(Fecha other) {
		if (other == null) {
			return true;
		}
		if (this.anio > other.anio) {
			return true;
		}
		if (this.anio < other.anio) {
			return false;
		}
		if (this.mes > other.mes) {
			return true;
		}
		if (this.mes < other.mes) {
			return false;
		}
		if (this.dia > other.dia) {
			return true;
		}
		if (this.dia < other.dia) {
			return false;
		}
		return false;

	}
}
