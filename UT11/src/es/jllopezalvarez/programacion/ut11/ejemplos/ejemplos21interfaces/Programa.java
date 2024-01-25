package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos21interfaces;

public class Programa {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("123456789A", "José Luis");
		Factura f1 = new Factura(23123, 12123.434);
		Periferico pp1 = new Periferico();
		
		imprimir(f1);
		imprimir(p1);
		imprimir(pp1);
		
		Perro p  = new Perro();
		imprimir(p);
		
	}

	private static void imprimir(Imprimible objeto) {
		objeto.imprimir();
		
	}
	

	
	
	

}
