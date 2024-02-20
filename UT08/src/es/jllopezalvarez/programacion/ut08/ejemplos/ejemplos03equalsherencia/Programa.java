package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos03equalsherencia;

public class Programa {
public static void main(String[] args) {
	Vehiculo v1 = new Vehiculo("11111A", "Opel", Color.BLANCO);
	Vehiculo v2 = new Vehiculo("11111A", "Opel", Color.BLANCO);
	
	System.out.printf("HashCode de v1: %s\n", v1.hashCode());
	System.out.printf("HashCode de v2: %s\n", v2.hashCode());
	System.out.printf("IdentityHashCode de v1: %s\n", System.identityHashCode(v1));
	System.out.printf("IdentityHashCode de v2: %s\n", System.identityHashCode(v2));
	System.out.printf("toString de v1: %s\n", v1.toString());
	System.out.printf("toString de v2: %s\n", v2.toString());
	System.out.printf("¿Son los vehículos v1 y v2 iguales? %s\n", v1.equals(v2));
	
	
	System.out.println("-".repeat(100));
	
	Vehiculo v3 = new Coche("11111A", "Opel", Color.BLANCO, true);
	System.out.printf("HashCode de v1: %s\n", v1.hashCode());
	System.out.printf("HashCode de v3: %s\n", v3.hashCode());
	System.out.printf("IdentityHashCode de v1: %s\n", System.identityHashCode(v1));
	System.out.printf("IdentityHashCode de v3: %s\n", System.identityHashCode(v3));
	System.out.printf("toString de v1: %s\n", v1.toString());
	System.out.printf("toString de v3: %s\n", v3.toString());
	System.out.printf("¿Son los vehículos v1 y v3 iguales? %s\n", v1.equals(v3));
	
	
	
	
	
}
}
