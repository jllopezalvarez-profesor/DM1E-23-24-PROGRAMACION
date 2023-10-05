package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos02string;

public class Ejemplo01Constructores {
	// Dos formas de construir una cadena:
	// Declarándola y asignando un valor.
	String cadena1 = "Esto es una cadena";
	// Constructor que recibe otra cadena
	String cadena2 = new String(cadena1);
	String cadena3 = cadena2;
	
	// Tres formas de crear un StringBuilder (objeto para construir cadenas)
	// Por defecto
	StringBuilder sb1 = new StringBuilder();
	// Capacidad inicial para 100 caracteres
	StringBuilder sb2 = new StringBuilder(100);
	// Con un valor inicial, al que podremos añadir cosas.
	StringBuilder sb3 = new StringBuilder("Valor inicial");

}
