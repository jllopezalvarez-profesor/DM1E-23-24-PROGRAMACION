package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases;

public class Electrodomestico {
	private static final double PRECIO_BASE_DEFECTO = 100;
	private static final Color COLOR_DEFECTO = Color.BLANCO;
	private static final Consumo CONSUMO_DEFECTO = Consumo.F;
	private static final double PESO_DEFECTO = 5;

	private double precioBase;
	private Color color;
	private Consumo consumo;
	private double pesoKg;

	public Electrodomestico() {
		this(PRECIO_BASE_DEFECTO, COLOR_DEFECTO, CONSUMO_DEFECTO, PESO_DEFECTO);

		// Alternativa al uso de this, válida pero menos concisa
		// this.precioBase = PRECIO_BASE_DEFECTO;
		// this.color = COLOR_DEFECTO;
		// this.consumo = CONSUMO_DEFECTO;
		// this.pesoKg = PESO_DEFECTO;
	}

	public Electrodomestico(double precioBase, double pesoKg) {
		this(precioBase, COLOR_DEFECTO, CONSUMO_DEFECTO, pesoKg);

		// Alternativa al uso de this, válida pero menos concisa
		// this.precioBase = precioBase;
		// this.color = COLOR_DEFECTO;
		// this.consumo = CONSUMO_DEFECTO;
		// this.pesoKg = pesoKg;
	}

	public Electrodomestico(double precioBase, Color color, Consumo consumo, double pesoKg) {
		// A este constructor es al que llaman el resto de constructores de la clase
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.pesoKg = pesoKg;
	}

	double getPrecioBase() {
		return precioBase;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public double getPrecioFinal() {
		double precioFinal = this.precioBase;
		precioFinal += calcularIncrementoPorConsumo();
		precioFinal += calcularIncrementoPorPeso();
		return precioFinal;
	}

	private double calcularIncrementoPorPeso() {
		if (this.pesoKg >= 80) {
			return IncrementosPrecio.INCREMENTO_PESO_80_MAS;
		}
		if (this.pesoKg >= 50) {
			return IncrementosPrecio.INCREMENTO_PESO_50_80;
		}
		if (this.pesoKg >= 20) {
			return IncrementosPrecio.INCREMENTO_PESO_20_50;
		}
		return IncrementosPrecio.INCREMENTO_PESO_0_20;
	}

	private double calcularIncrementoPorConsumo() {
		switch (this.consumo) {
		case A:
			return IncrementosPrecio.INCREMENTO_CONSUMO_A;
		case B:
			return IncrementosPrecio.INCREMENTO_CONSUMO_B;
		case C:
			return IncrementosPrecio.INCREMENTO_CONSUMO_C;
		case D:
			return IncrementosPrecio.INCREMENTO_CONSUMO_D;
		case E:
			return IncrementosPrecio.INCREMENTO_CONSUMO_E;
		case F:
			return IncrementosPrecio.INCREMENTO_CONSUMO_F;
		default:
			throw new RuntimeException("Valor no válido en enumerado de consumo");
		}
	}

}
