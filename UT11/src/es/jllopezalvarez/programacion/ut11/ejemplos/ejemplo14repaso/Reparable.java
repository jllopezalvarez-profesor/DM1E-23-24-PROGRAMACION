package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

public interface Reparable {
	public final static int PRECIO_UNIDAD_TRABAJO = 10;
	
	int getUnidadesTrabajo();
	
	int getImporteReparacion();
	

	
	default void metodoDefault() {
		System.out.println("Estoy en el método default");
	}

}
