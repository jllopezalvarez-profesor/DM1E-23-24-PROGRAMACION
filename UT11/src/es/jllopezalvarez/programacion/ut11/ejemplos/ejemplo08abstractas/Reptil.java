package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo08abstractas;

public class Reptil extends Animal{

	public Reptil(int pesoKg) {
		super(pesoKg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " - Reptil";
	}
	
	@Override
	public void desplazarse(double metros) {
		System.out.printf("Repto %.2f metros\n", metros);		
	}


}
