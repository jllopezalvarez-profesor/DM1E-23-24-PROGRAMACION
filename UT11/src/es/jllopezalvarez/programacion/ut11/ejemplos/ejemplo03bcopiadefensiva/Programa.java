package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo03bcopiadefensiva;

public class Programa {
	public static void main(String[] args) {
		// Creamos una dirección
		Direccion dirEmpleado1 = new Direccion("Calasparra", "Murcia", "España");

		// Y un empleado con esta dirección
		Empleado empleado1 = new Empleado(1, "Marisa", dirEmpleado1);

		// También creamos un empleado con el constructor que "delega" la construcción
		// de la dirección al constructor del empleado
		Empleado empleado2 = new Empleado(2, "Juan", "Alcossebre", "Castelló", "España");

		// Mostramos los empleados
		System.out.println(empleado1);
		System.out.println(empleado2);

		// Usamos el getter de la direccion
		Direccion dirEmpleado2 = empleado2.getDireccion();

		// Como tenemos referencias a los objetos dirección, podemos modificar
		// directamente las direcciones, lo que modifica los empleados:
		dirEmpleado1.setCiudad("Mérida");
		dirEmpleado1.setProvincia("Badajoz");
		dirEmpleado1.setPais("España");
		String nombreEmpleado1 = empleado1.getNombre();
		nombreEmpleado1 = "Antonio";

		dirEmpleado2.setCiudad("Plasencia");
		dirEmpleado2.setProvincia("Cáceres");
		dirEmpleado2.setPais("España");
		
		// Vemos los empleados modificados
		System.out.println(empleado1);
		System.out.println(empleado2);

	}
}
