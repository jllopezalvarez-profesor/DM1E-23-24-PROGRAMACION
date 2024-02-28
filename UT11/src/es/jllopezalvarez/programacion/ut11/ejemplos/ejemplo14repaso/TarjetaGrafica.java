package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

public class TarjetaGrafica extends Componente implements Reparable {
	private static final int CANTIDAD_MEMORIA_DEFECTO = 1;
	private final int memoriaGB;
	private final int relojGhz;

	public TarjetaGrafica(String numeroSerie, String nombre, String descripcion, int memoriaGB, int relojGhz) {
		super(numeroSerie, nombre, descripcion);
		this.memoriaGB = memoriaGB;
		this.relojGhz = relojGhz;
	}

	public TarjetaGrafica(String numeroSerie, String nombre, String descripcion, int relojGhz) {
		// V1
		this(numeroSerie, nombre, descripcion, CANTIDAD_MEMORIA_DEFECTO, relojGhz);
		// V2
//		super(numeroSerie, nombre, descripcion);
//		this.memoriaGB = CANTIDAD_MEMORIA_DEFECTO;
//		this.relojGhz = relojGhz;
	}

	public int getMemoriaGB() {
		return memoriaGB;
	}

	public int getRelojGhz() {
		return relojGhz;
	}

	@Override
	public double getConsumo() {

		return this.memoriaGB * 0.05 + this.relojGhz * 10;
	}

	@Override
	public int getUnidadesTrabajo() {
		return this.memoriaGB;
	}

	@Override
	public int getImporteReparacion() {
		return this.getUnidadesTrabajo() * Reparable.PRECIO_UNIDAD_TRABAJO;
	}

}
