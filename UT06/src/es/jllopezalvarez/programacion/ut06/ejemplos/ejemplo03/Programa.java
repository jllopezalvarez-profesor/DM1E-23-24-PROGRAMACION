package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo03;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		System.out.printf("El valor de %s en ASCII es %d\n", 'A', (int) 'A');

		System.out.printf("El valor de %s en ASCII es %d\n", 'Z', (int) 'Z');

		Random rnd = new Random();

		String numero = "12345678";
		numero += (char) rnd.nextInt('A', 'Z' + 1);
		System.out.println(numero);
//		
//		
//
//		Alumno joseLuis = new Alumno("143582f2-0183-433e-b941-b691f85ef512", "José Luis", "López", LocalDate.of(1972, 8, 13));
//		System.out.println(joseLuis.getNombre());
//		System.out.println(joseLuis.getEdad());
//		Alumno stella = new Alumno("Stella", "Calderón", LocalDate.now());
//		System.out.println(stella.getNombre());
//		System.out.println(stella.getEdad());
//		Alumno stella2 = new Alumno( "Calderón", LocalDate.now());
//		System.out.println(stella2.getNombre());
//		System.out.println(stella2.getEdad());
//		
//		System.out.printf("ID de JL: %s\n", joseLuis.getIdentificador());
//		System.out.printf("ID de Stella: %s\n", stella.getIdentificador());		

	}

}
