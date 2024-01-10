package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo02asociacion;

public class Programa {
	public static void main(String[] args) {
		// Creamos las direcciones madrid y barcelona, que existen de forma
		// independiente a los empleados (agregación)
		Direccion madrid = new Direccion("Madrid", "Madrid", "España");
		Direccion barcelona = new Direccion("Barcelona", "Barcelona", "España");

		// Ahora creamos los empleados, asociando la dirección al empleado
		Empleado empleadoMadrid = new Empleado(1, "José Luis", madrid);
		Empleado empleadoBarcelona = new Empleado(2, "María", barcelona);

		// Y un empleado con el constructor que "delega" la construcción de la dirección
		// al constructor del empleado
		Empleado empleadoMalaga = new Empleado(3, "Marta", "Málaga", "Málaga", "España");

		// Mostramos los empleados
		System.out.println(empleadoMadrid);
		System.out.println(empleadoBarcelona);
		System.out.println(empleadoMalaga);
	}
}
