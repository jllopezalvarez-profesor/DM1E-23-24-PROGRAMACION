package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio06;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Persona persona = new Persona("José Luis", 51, "123456789A", Sexo.H);
		System.out.println("--------");
		System.out.println(persona);
		System.out.println("--------");
		System.out.println(persona.toString());
		
		
		persona.setSexo(Sexo.H);
		
		System.out.println(Sexo.M);
		
		
		persona.setSexo(Sexo.valueOf("M"));
		
		
		Integer.valueOf('M');
	
		
	}

}
