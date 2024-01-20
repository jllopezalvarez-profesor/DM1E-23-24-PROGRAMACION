package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases;

public class Lavadora extends Electrodomestico {
	private static final double CARGA_DEFECTO = 5;

	private double carga;

	public Lavadora() {
		// Esta llamada a super() se podría quitar porque si no ponemos nada se llama
		// automáticamente al constructor sin parámetros (si existe, si no, falla)
		super();
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double pesoKg) {
		super(precioBase, pesoKg);
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, Color color, Consumo consumo, double pesoKg, double carga) {
		super(precioBase, color, consumo, pesoKg);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double getPrecioFinal() {
		double preciofinal = super.getPrecioFinal();
		if (this.carga > 8) {
			preciofinal += IncrementosPrecio.INCREMENTO_ALTA_CARGA;
		}
		return preciofinal;
	}

}
