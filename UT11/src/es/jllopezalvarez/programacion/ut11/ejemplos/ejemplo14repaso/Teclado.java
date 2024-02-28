package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

public class Teclado extends Componente implements Reparable {

	public Teclado(String numeroSerie, String nombre, String descripcion) {
		super(numeroSerie, nombre, descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getUnidadesTrabajo() {
		
		return 2;
	}

	@Override
	public int getImporteReparacion() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double getConsumo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
