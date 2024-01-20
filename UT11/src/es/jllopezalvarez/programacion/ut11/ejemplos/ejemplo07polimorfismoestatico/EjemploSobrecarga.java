package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo07polimorfismoestatico;

public class EjemploSobrecarga {

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
