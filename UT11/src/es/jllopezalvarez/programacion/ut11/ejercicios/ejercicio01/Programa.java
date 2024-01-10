package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio01;

public class Programa {
	public static void main(String[] args) {

		// Fecha con año erróneo
		// Fecha f = new Fecha(10, 10, 0);
		// Fecha con mes incorrecto
		// Fecha f = new Fecha(10, 16, 2002);

		// Fecha con dia incorrecto
		// Fecha f = new Fecha(32, 10, 2002);

		// Fecha f = new Fecha(29, 2, 2001);
		Fecha f = new Fecha(29, 2, 2004);
		System.out.println(f);
		f.diaSiguiente();
		System.out.println(f);

		f.setMes(4);
		f.setDia(20);
		System.out.println(f);
		f.diaSiguiente();
		System.out.println(f);
		f.setAnio(2023);
		f.setMes(12);
		f.setDia(31);
		System.out.println(f);
		f.diaSiguiente();
		System.out.println(f);

		Fecha f2 = new Fecha(10, 1, 2024);
		
		System.out.println(f.esMayorQue(f2)); // False
		System.out.println(f2.esMayorQue(f)); //True
		
	}
}
