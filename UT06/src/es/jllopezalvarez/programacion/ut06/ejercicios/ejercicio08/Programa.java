package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio08;

public class Programa {

	public static void main(String[] args) {

		CuentaBancaria cuentaA = new CuentaBancaria("323123D", "José Luis", "López");
		System.out.println(cuentaA);
		
		cuentaA.reembolsar(100);
		System.out.println(cuentaA);
		System.out.printf("¿La cuenta A está en números rojos? %S\n", cuentaA.estaEnNumerosRojos());
		
		
		
		System.out.println();
		CuentaBancaria cuentaB = new CuentaBancaria("2431123D", "Martina", "Martín", 300);
		System.out.println(cuentaB);
		cuentaB.ingresar(20);
		System.out.println(cuentaB);
		System.out.printf("¿La cuenta B está en números rojos? %S\n", cuentaB.estaEnNumerosRojos());
		
		
		
		
	}

}
