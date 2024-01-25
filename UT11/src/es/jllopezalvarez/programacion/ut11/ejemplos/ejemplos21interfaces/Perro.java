package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos21interfaces;

public class Perro implements ImprimiblePantalla {

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		 ImprimiblePantalla.super.imprimir();
		 System.out.println("Ya ahora añado esto");
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
