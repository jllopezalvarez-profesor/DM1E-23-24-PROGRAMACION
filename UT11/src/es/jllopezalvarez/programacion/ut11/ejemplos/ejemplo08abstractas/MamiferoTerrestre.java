package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo08abstractas;

public abstract class MamiferoTerrestre extends Animal {

	public MamiferoTerrestre(int pesoKg) {
		super(pesoKg);
	}
	
	@Override
	public void desplazarse(double metros) {
		System.out.printf("Camino %.2f metros\n", metros);

	}
	

}
