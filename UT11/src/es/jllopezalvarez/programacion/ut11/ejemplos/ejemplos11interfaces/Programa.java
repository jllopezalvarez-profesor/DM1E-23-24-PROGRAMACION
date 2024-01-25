package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos11interfaces;

public class Programa {
	public static void main(String[] args) {
		Persona p1 = new Persona("12345678A", "José Luis");
		p1.imprimir();
		Perro p2 = new Perro("Lassie");
		p2.imprimir();
		
		Imprimible[] imprimibles = new Imprimible[2];
		imprimibles[0] = p1;
		imprimibles[1] = p2;
		
		for (Imprimible imprimible : imprimibles) {
			imprimible.imprimir();
		}
		
	}
}
