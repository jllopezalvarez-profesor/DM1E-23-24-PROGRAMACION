package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos21interfaces;

public class Factura implements Imprimible {
	private int numFactura;
	private double importe;

	public Factura(int numFactura, double importe) {
		this.numFactura = numFactura;
		this.importe = importe;
	}

	public int getNumFactura() {
		return numFactura;
	}

	public double getImporte() {
		return importe;
	}

	@Override
	public void imprimir() {
		System.out.printf("Factura %d por un importe de %.2f\n", this.numFactura, this.importe);
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
