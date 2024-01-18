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

//		this.precioBase = PRECIO_BASE_DEFECTO;
//		this.color = COLOR_DEFECTO;
//		this.consumo = CONSUMO_DEFECTO;
//		this.pesoKg = PESO_DEFFECTO;
	}

	public Electrodomestico(double precioBase, double pesoKg) {
		this(precioBase, COLOR_DEFECTO, CONSUMO_DEFECTO, pesoKg);

//		this.precioBase = precioBase;
//		this.color = COLOR_DEFECTO;
//		this.consumo = CONSUMO_DEFECTO;
//		this.pesoKg = pesoKg;
	}

	public Electrodomestico(double precioBase, Color color, Consumo consumo, double pesoKg) {
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
			return 100;
		}
		if (this.pesoKg >= 50) {
			return 80;
		}
		if (this.pesoKg >= 20) {
			return 50;
		}
		return 10;
	}

	private double calcularIncrementoPorConsumo() {
		switch (this.consumo) {
		case A:
			return 100;
		case B:
			return 80;
		case C:
			return 60;
		case D:
			return 50;
		case E:
			return 30;
		case F:
			return 10;
		default:
			throw new RuntimeException("Valor no válido en enumerado de consumo");
		}
	}



}
