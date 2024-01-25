package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo09static;

import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Clase con atributos y métodos estáticos.
 *
 */
public class Coche {
	// Constantes: static final
	// Static se usa para que la constante sea común a todos los objetos de
	// la clase, y, si es pública, para su uso desde el resto de clases. Así no se
	// repite el valor para cada uno de los objetos, se ahorra almacenamiento.
	// Final se utiliza para que no pueda modificarse su valor.
	// Ejemplo: todos los coches, en nuesto ejemplo, tienen 4 ruedas.
	public static final int NUM_RUEDAS = 4;
	// Otro ejemplo: todos los coches son blancos inicialmente.
	private static final Color COLOR_INICIAL = Color.BLANCO;

	// Atributo de clase: static (sin final porque lo modificaremos).
	// Existe asociado a la clase, no a los objetos. Es decir, se puede acceder al
	// atributo sin crear objetos. Para modificarlo, como es private, lo podrán
	// hacer todos los objetos de la clase. Si uno lo modifica lo modifica para
	// todos.
	// Ejemplo: llevar la cuenta de cuantos coches se han creado, cuantas veces
	// hemos usado new Coche(...)
	private static int numCochesCreados = 0;
	
	static {
		System.out.println("Estoy en un bloque static");
		Coche.numCochesCreados = 4;
	}
	
	static {
		System.out.println("Estoy en otro un bloque static");
	}

	// Alternativamente este atributo estático se puede inicializar en un bloque
	// static. Ejemplo: inicializarlo con un valor aleatorio entre 1 y 100.
//	static {
//		System.out.println("En bloque de inicialización estático.");
//		Random rnd = new Random();
//		int valorInicial = rnd.nextInt(0,100);
//		numCochesCreados = valorInicial;
//	}

	// Atributos que no se pueden modificar: final
	// Se pueden inicializar al declararlos o en el constructor, pero luego no se
	// pueden modificar más.
	// Ejemplo: creamos los coches con una matrícula, que no puede modificarse
	// nunca.
	private final String matricula;

	// Es un error usar static para atributos de instancia, que tienen que mantener
	// un valor distinto para cada instancia (objeto) de una clase
	private Color color;

	public Coche(String matricula) {
		// Inicializamos en el constructor el atributo private final
		this.matricula = matricula;
		// Incrementamos el número de coches creados.
		// Aunque no es necesario, usar el nombre de la clase para acceder al atributo
		// estático ayuda a identificarlo como tal.
		// Eclipse muestra el atributo estático en cursiva para ayudar a identificarlo.
		Coche.numCochesCreados++;
		// Inicializamos el color. Aunque el atributo es estático (es un error),
		// vamos a inicicializarlo en el constructor (otro error).
		// Java nos avisa de que estamos usando this cuando deberíamos usar Coche.
		this.color = COLOR_INICIAL;
	}
	
	public Coche(String matricula, Color color) {
		this.matricula = matricula;
		this.color = color;
		Coche.numCochesCreados++;
	}

	// Métodos para acceder a atributos estáticos, también tienen que ser estáticos.
	// Java no obliga a que lo sean, pero es lo correcto.
	public static int getNumCochesCreados() {
		return Coche.numCochesCreados;
	}

	// Método para acceder a un atributo de instancia. No son estáticos.
	public String getMatricula() {
		return this.matricula;
	}

	// Método para acceder al color. Aunque el atributo es estático (es un error),
	// el método lo podemos hacer de instancia.
	public Color getColor() {
		// Java nos avisa de que estamos usando this cuando deberíamos usar Coche.
		return this.color;
	}

	// Método para cambiar el color. Otra vez, aunque el atributo es estático (es un
	// error), el método lo podemos hacer de instancia.
	public void setColor(Color color) {
		// Java nos avisa de que estamos usando this cuando deberíamos usar Coche.
		this.color = color;
	}

}
