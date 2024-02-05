package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo09static;

import java.util.Arrays;

/**
 * 
 * Programa para demostrar el uso de atributos y métodos estáticos.
 *
 */
public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Pruebas de atributos y métodos estáticos.");
		
		// Acceso a atributos static final públicos (constantes)
		// Ejemplo: cuantas ruedas tienen los coches:
		System.out.printf("Los coches tienen %d ruedas.\n", Coche.NUM_RUEDAS);

		// Podemos acceder a un método estático sin necesidad de crear un objeto de la
		// clase. Incluso si no se ha creado ningún objeto todavía.
		System.out.printf("Nº de coches creados: %d\n", Coche.getNumCochesCreados());

		// Cada vez que creamos un coche, el contador de creados se incrementa.
		Coche c1 = new Coche("123456789A", Color.AZUL);
		System.out.printf("Nº de coches creados: %d\n", Coche.getNumCochesCreados());
		Coche c2 = new Coche("123456789B", Color.BLANCO);
		System.out.printf("Nº de coches creados: %d\n", Coche.getNumCochesCreados());
		Coche c3 = new Coche("123456789C", Color.ROJO);
		System.out.printf("Nº de coches creados: %d\n", Coche.getNumCochesCreados());

		// Aunque se puede llamar a un método de clase usando una instancia, no está
		// recomendado. Java mostrará un warning al respecto.
		Coche c4 = new Coche("123456789D", Color.VERDE);
		
		
		System.out.printf("Nº de coches creados: %d\n", c4.getNumCochesCreados());

		
		
		
		// ProductDto del atributo color, que no debería ser estático pero lo hemos hecho
		// mal intencionadamente.
		System.out.printf("El color del coche %s es %s\n", c1.getMatricula(), c1.getColor());
		System.out.printf("El color del coche %s es %s\n", c2.getMatricula(), c2.getColor());
		System.out.printf("El color del coche %s es %s\n", c3.getMatricula(), c3.getColor());
		System.out.printf("El color del coche %s es %s\n", c4.getMatricula(), c4.getColor());
		
		// Cambiamos el color, en teoría, de un coche, y volvemos a mostrar colores.
		c3.setColor(Color.AZUL);
		System.out.printf("El color del coche %s es %s\n", c1.getMatricula(), c1.getColor());
		System.out.printf("El color del coche %s es %s\n", c2.getMatricula(), c2.getColor());
		System.out.printf("El color del coche %s es %s\n", c3.getMatricula(), c3.getColor());
		System.out.printf("El color del coche %s es %s\n", c4.getMatricula(), c4.getColor());
		
		
		
		
	}

}
