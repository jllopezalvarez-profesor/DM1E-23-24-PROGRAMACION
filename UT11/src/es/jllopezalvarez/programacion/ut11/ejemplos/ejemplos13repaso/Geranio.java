package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

public class Geranio extends Vegetal {

	private static final String NOMBRE_ESPECIE = "GERANIO";
	
	@Override
	public void fotosintesis(int cantidadLuz) {
		System.out.printf("Soy un %s y estoy procesando %s lux\n", NOMBRE_ESPECIE, cantidadLuz);
	}

}
