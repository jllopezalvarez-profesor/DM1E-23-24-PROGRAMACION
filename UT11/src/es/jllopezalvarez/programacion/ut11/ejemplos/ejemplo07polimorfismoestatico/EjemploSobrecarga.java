package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo07polimorfismoestatico;

public class EjemploSobrecarga {

	// El polimorfismo estático se produce cuando se sobrecargan métodos.
	// El compilador de Java sabe, antes de arrancar el programa, mientras
	// está compilando, que versión (que forma) de las que tiene el método
	// debe utilizar.
	
	public void metodo() {
		System.out.println("En sobrecarga 1");
	}
	public void metodo(int i) {
		System.out.println("En sobrecarga 1. El parámetro vale: " + i);
	}
	public void metodo(String s) {
		System.out.println("En sobrecarga 1. El parámetro vale: " + s);
	}
	
	
}
