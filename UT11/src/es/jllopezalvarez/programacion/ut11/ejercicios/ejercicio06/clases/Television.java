package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases;

public class Television extends Electrodomestico {
	private static final int RESOLUCION_DEFECTO = 42;
	private static final boolean SINTONIZADOR_DEFECTO = true;

	private int resolucionPulgadas;
	private boolean sintonizadorTdt;

	public Television() {
		super();
		this.resolucionPulgadas = RESOLUCION_DEFECTO;
		this.sintonizadorTdt = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, double pesoKg) {
		super(precioBase, pesoKg);
		this.resolucionPulgadas = RESOLUCION_DEFECTO;
		this.sintonizadorTdt = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, Color color, Consumo consumo, double pesoKg, int resolucionPulgadas,
			boolean sintonizadorTdt) {
		super(precioBase, color, consumo, pesoKg);
		this.resolucionPulgadas = resolucionPulgadas;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public int getResolucionPulgadas() {
		return resolucionPulgadas;
	}
	
	@Override
	public double getPrecioFinal() {
		double precioFinal = super.getPrecioFinal();
		precioFinal += calcularIncrementoPorPulgadas();
		precioFinal += calcularIncrementoPorSintonizador();
		// TODO: añadir lo que corresponda al precio final
		return precioFinal;
	}

	private double calcularIncrementoPorPulgadas() {
		if (this.resolucionPulgadas > 65) {
			return this.getPrecioBase() * IncrementosPrecio.FACTOR_INCREMENTO_PULGADAS;
		}
		return 0;
	}

	private double calcularIncrementoPorSintonizador() {
		return this.sintonizadorTdt ? IncrementosPrecio.INCREMENTO_TDT2 : 0;
	}
}
