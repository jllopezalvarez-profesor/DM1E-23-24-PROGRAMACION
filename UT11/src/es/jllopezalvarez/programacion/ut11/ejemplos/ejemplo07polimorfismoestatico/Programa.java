package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo07polimorfismoestatico;

public class Programa {
	public static void main(String[] args) {

		EjemploSobrecarga es = new EjemploSobrecarga();
		
		// El polimorfismo estático se produce cuando se sobrecargan métodos.
		// El compilador de Java sabe, antes de arrancar el programa, mientras
		// está compilando, que versión (que forma) de las que tiene el método
		// debe utilizar.
		// La distingue de las demás por el número, tipo y orden de 
		// los parámetros que recibe.
		
		es.metodo();
		es.metodo(4);
		es.metodo("hola");
	}

}
