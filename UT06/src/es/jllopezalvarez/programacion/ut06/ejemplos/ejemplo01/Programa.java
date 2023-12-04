package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo01;

import java.time.LocalDate;

public class Programa {
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		
		System.out.printf("Nombre al crear: %s\n", alumno.nombre);
		
		alumno.nombre = "José Luis";
		alumno.apellido = "López";

		System.out.printf("Nombre y apellido después de asignar: %s %s\n", alumno.nombre, alumno.apellido);
		
		
		System.out.printf("Fecha antes de asignar: %s\n", alumno.fechaNacimiento);
		alumno.fechaNacimiento = LocalDate.of(1972, 8, 13);
		System.out.printf("Fecha después de asignar: %s\n", alumno.fechaNacimiento);
		
		
		int[] numeros = new int[34];
		
		Alumno[] alumnos = new Alumno[10];
		
		
		for (int i = 0; i < alumnos.length; i++) {
			Alumno nuevoAlumno = new Alumno();
			nuevoAlumno.nombre = "Alumno " + i;
			alumnos[i] = nuevoAlumno;
		}
		
		
		
		for (Alumno alum : alumnos) {
			System.out.println(alum.nombre);
		}
		
		
	}

}
