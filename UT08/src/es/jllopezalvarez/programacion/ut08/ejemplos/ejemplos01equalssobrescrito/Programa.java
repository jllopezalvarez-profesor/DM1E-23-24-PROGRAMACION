package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos01equalssobrescrito;

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
	System.out.printf("¿Son los vehículos iguales? %s\n", v1.equals(v2));
	
	
	
	
}
}
