package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo02override;

public class Programa {

	public static void main(String[] args) {
		Superclase objeto1 = new Superclase();
		Subclase objeto2 = new Subclase();
		
		System.out.println("-".repeat(40));
		objeto1.muestraDiaActual();
		objeto2.muestraDiaActual();
		
		System.out.println("-".repeat(40));

		objeto1.muestraHoraActual();
		objeto2.muestraHoraActual();
		System.out.println("-".repeat(40));


		objeto1.muestraDiaYHoraActual();
		objeto2.muestraDiaYHoraActual();
		System.out.println("-".repeat(40));

		
		
		
		
	}

}
