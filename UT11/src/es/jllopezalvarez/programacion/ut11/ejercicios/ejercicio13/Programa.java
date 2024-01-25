package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio13;

public class Programa {

	public static void main(String[] args) {
		Coche c = new Coche(7);
		c.acelerar(10);
		c.acelerar(30);
		c.acelerar(110);
		c.frenar(50);
		c.frenar(100);
		System.out.println(c.getNumPlazas());
		c.aparcar();
		
		System.out.println("-".repeat(100));
		
		Vehiculo v = new Coche(5);
		v.acelerar(20);
		v.acelerar(40);
		v.acelerar(90);
		v.frenar(70);
		v.frenar(100);
		System.out.println(v.getNumPlazas());
		((Coche)v).aparcar();
		
		System.out.println("-".repeat(100));
			
		Moto m = new Moto();
		m.acelerar(10);
		m.acelerar(30);
		m.acelerar(110);
		m.frenar(50);
		m.frenar(100);
		System.out.println(m.getNumPlazas());
		
		System.out.println("-".repeat(100));
		
		Vehiculo v2 = new Moto();
		v2.acelerar(20);
		v2.acelerar(40);
		v2.acelerar(90);
		v2.frenar(70);
		v2.frenar(100);
		System.out.println(v2.getNumPlazas());
		//((Coche)v2).aparcar();
	
	
	}
	
}
