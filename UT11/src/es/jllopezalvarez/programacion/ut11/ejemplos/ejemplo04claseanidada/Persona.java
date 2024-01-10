package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo04claseanidada;

public class Persona {
	private String nombre;
	private Fecha fechaCreacion;

	public Persona(String nombre, int diaCreacion, int mesCreacion, int anioCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = new Fecha(diaCreacion, mesCreacion, anioCreacion);
	}

	public Persona(String nombre) {
		this(nombre, 1, 1, 2020);
	}

	public String getNombre() {
		return nombre;
	}

	public Fecha getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public String toString() {
		return String.format("Persona [nombre=%s, fechaCreacion=%s]", nombre, fechaCreacion);
	}

	public class Fecha {
		private int dia, mes, anio;

		public Fecha(int dia, int mes, int anio) {
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}

		int getDia() {
			return dia;
		}

		public int getMes() {
			return mes;
		}

		public int getAnio() {
			return anio;
		}

		public String toString() {
			return dia + "-" + mes + "-" + anio;
		}
	}
}
