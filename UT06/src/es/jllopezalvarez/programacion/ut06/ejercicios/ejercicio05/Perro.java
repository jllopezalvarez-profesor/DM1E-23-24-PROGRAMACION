package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio05;

public class Perro {

	public static final int TUMBADO = 1;
	public static final int SENTADO = 2;
	public static final int DE_PIE = 3;

	private static final int MAX_COMIDA_GR = 200;
	private static final int MIN_COMIDA_GR = 0;
	private static final int MAX_MINUTOS_JUEGO = 10;
	private static final int MIN_MINUTOS_JUEGO = 0;

	private String nombre;
	private String raza;
	private String propietario;
	private int edadAnios;
	private double pesoKg;
	private int posicion = SENTADO;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getEdadAnios() {
		return edadAnios;
	}

	public void setEdadAnios(int edadAnios) {
		this.edadAnios = edadAnios;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public int getPosicion() {
		return posicion;
	}

	public void comer(int cantidadComidaGr) {
		if (cantidadComidaGr > MAX_COMIDA_GR) {
			cantidadComidaGr = MAX_COMIDA_GR;
		}
		if (cantidadComidaGr < MIN_COMIDA_GR) {
			cantidadComidaGr = MIN_COMIDA_GR;
		}
		System.out.printf("Soy %s y estoy comiendo %d gr de comida.\n", this.nombre, cantidadComidaGr);
		this.pesoKg += (cantidadComidaGr / 10) / 1000D;
	}

	public void jugar(int tiempoMinutos) {
		if (tiempoMinutos > MAX_MINUTOS_JUEGO) {
			tiempoMinutos = MAX_MINUTOS_JUEGO;
		}
		if (tiempoMinutos < MIN_MINUTOS_JUEGO) {
			tiempoMinutos = MIN_MINUTOS_JUEGO;
		}
		System.out.printf("Soy %s y estoy jugando %d minutos.\n", this.nombre, tiempoMinutos);
		this.pesoKg -= (tiempoMinutos / 7) / 1000D;
	}

	public void sentarse() {
		this.posicion = SENTADO;
	}

	public void tumbarse() {
		if (this.posicion == DE_PIE) {
			System.out.println("No se puede pasar a 'TUMBADO' desde 'DE_PIE'.");
		} else {
			this.posicion = TUMBADO;
		}
	}

	public void ponerseDePie() {
		if (this.posicion == TUMBADO) {
			System.out.println("No se puede pasar a 'DE_PIE' desde 'TUMBADO'.");
		} else {
			this.posicion = DE_PIE;
		}				
	}

}
