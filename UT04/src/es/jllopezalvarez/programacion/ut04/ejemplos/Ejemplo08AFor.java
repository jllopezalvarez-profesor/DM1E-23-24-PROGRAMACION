package es.jllopezalvarez.programacion.ut04.ejemplos;

public class Ejemplo08AFor {

	public static void main(String[] args) {
		// Demo de for para mostrar los números del 0 al 100 ambos incluidos

		// Declaramos la variable dentro del propio for. Esto hace que la variable no
		// sea accesible desde fuera, es decir, el ámbito de la variable es sólo el for.
		// Dentro de la declaración del for está también el incremento, por lo que no
		// hace falta la sentencia numero++ dentro del bucle.
		for (int numero = 0; numero < 100; numero++) {
			// Mostramos el mensaje.
			System.out.printf("El número dentro del bucle vale ahora %d\n", numero);
		}

		// Cuando la variable "numero" supera el valor 100, se continúa.
		// La variable en este caso no es accesible desde fuera del bucle. La siguiente
		// línea mostrará un error de compilación si quitamos el comentario:
		// System.out.printf("El número tras salir del bucle vale %d\n", numero);
		System.out.println("Fin del programa...");

	}

}
