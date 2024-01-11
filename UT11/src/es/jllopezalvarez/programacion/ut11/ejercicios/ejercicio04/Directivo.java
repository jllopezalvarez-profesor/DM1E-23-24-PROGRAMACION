package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio04;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
		// Aunque llamar al setter funcione no es lo más correcto. Mejor llamar al super
		// como estamos haciendo
		// this.setNombre(nombre);
	}

	@Override
	public String toString() {
		// Forma 1: accedemos al atributo privado con el getter
		return String.format("Empleado %s -> %s", this.getNombre(), "Directivo");
		// Forma 2: llamamos al método de superclase usando super.toString
		// return String.format("%s -> %s", super.toString(), "Directivo");
		// Esta forma 2 alternativa (para obtener el nombre de la clase) no funciona
		// bien por cuestiones relacionadas con el tipo dinámico, que veremos más
		// adelante
		// return String.format("Empleado %s -> %s", this.getNombre(),
		// this.getClass().getSimpleName());
	}
}
