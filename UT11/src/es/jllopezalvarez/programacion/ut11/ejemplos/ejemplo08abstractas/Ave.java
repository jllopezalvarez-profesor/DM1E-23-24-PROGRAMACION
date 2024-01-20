package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo08abstractas;

public class Ave extends Animal {

	public Ave(int pesoKg) {
		super(pesoKg);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " - Ave";
	}

	@Override
	public void desplazarse(double metros) {
		System.out.printf("Vuelo %.2f metros\n", metros);
		
	}

}
