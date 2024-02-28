package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

public class Cocodrilo extends Animal implements Reptil{
	private static final String NOMBRE_ESPECIE = "COCODRILO";


	
	@Override
	public void comer(String alimento) {
		System.out.printf("Soy un %S y estoy comiendo %s\n", NOMBRE_ESPECIE, alimento);
	}



	@Override
	public void reptar(int metros) {
		System.out.printf("Soy un %S y estoy reptando %s metros\n", NOMBRE_ESPECIE, metros);
	}

}
