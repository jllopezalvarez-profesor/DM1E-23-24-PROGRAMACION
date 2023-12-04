package es.jllopezalvarez.programacion.ut06.ejemplos.ejemplo02;

import java.time.LocalDate;

public class Programa {
	public static void main(String[] args) {
		
		Alumno joseLuis = new Alumno();
		

		
		System.out.printf("Nombre al crear: %s\n", joseLuis.getNombre());
		
		joseLuis.setNombre("José Luis");
		joseLuis.setApellido("López");

		System.out.printf("Nombre y apellido después de asignar: %s %s\n", joseLuis.getNombre(), joseLuis.getApellido());
		

		
		System.out.printf("Fecha antes de asignar: %s\n", joseLuis.getFechaNacimiento());
		joseLuis.setFechaNacimiento(LocalDate.of(1972, 8, 13));
		System.out.printf("Fecha después de asignar: %s\n", joseLuis.getFechaNacimiento());
		System.out.printf("La edad de José Luis es de %d años\n", joseLuis.getEdad());
		
		Alumno stella = new Alumno();
		stella.setNombre("Stella");
		stella.setApellido("Calderón");
		stella.setFechaNacimiento(LocalDate.of(2003, 7, 13));
		
		System.out.printf("La edad de Stella es de %d años\n", stella.getEdad());
		
		
		
	
		
	}

}
