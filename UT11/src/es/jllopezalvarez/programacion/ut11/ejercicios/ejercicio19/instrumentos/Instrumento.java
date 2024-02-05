package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19.instrumentos;

public abstract class Instrumento implements Comparable<Instrumento> {
	private final String propietario;
	private final int dificultad;

	public Instrumento(String propietario, int dificultad) {
		this.propietario = propietario;
		this.dificultad = dificultad;
	}

	public String getPropietario() {
		return propietario;
	}

	public int getDificultad() {
		return dificultad;
	}

	public abstract void tocar();

	public abstract void parar();

	public boolean esMasDificil(Instrumento other) {
		return this.dificultad > other.dificultad;
	}
	
	@Override
	public int compareTo(Instrumento other) {
		// Si this < other --> Devolver negativo
		// Si this == other --> Devolver 0
		// Si this > other --> devolver > 0
		
		// De menor a mayor (sólo dificultad): 
		// return Integer.compare(this.dificultad, other.dificultad);
		
		// De mayor a menor (sólo dificultad) (1) invertimos el resultado de compare
		// return -Integer.compare(this.dificultad, other.dificultad);
		
		// De mayor a menor (sólo dificultad) (2) invertimos parámetros
		// return Integer.compare(other.dificultad, this.dificultad);
		
		// Difucultas de mayor a menor, y si son de la misma dificultad, por propietario alfabético
		int resultado = -Integer.compare(this.dificultad, other.dificultad);
		if (resultado == 0) {
			resultado = this.propietario.compareTo(other.propietario);
		}
		// Se podrían añadir más if(resultado == 0)
		return resultado;
	}
	
}
