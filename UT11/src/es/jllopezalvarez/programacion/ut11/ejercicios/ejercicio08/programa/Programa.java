package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.programa;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Cuadrado;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Paralelogramo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio08.figuras.Romboide;

public class Programa {
public static void main(String[] args) {
	Paralelogramo p = new Romboide(10, 20, 5);
	
	Cuadrado c = new Cuadrado(5);
	
	System.err.println(c.area());
	
	
}
	
	
}
