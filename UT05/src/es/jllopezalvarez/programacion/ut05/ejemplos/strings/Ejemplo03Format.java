package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

import javax.swing.JOptionPane;

public class Ejemplo03Format {
	public static void main(String[] args) {

		int numeroEntero = 4;
		double numeroReal = 25.334841;
		String s = "otoño";

		// Usando el método estático format se puede conseguir lo mismo que con printf,
		// pero sin mostrarlo en la salida estándar. Por ejemplo, para usarlo con JOptionPane
		String mensaje = String.format("Entero: %d, doble %.2f, texto: '%s'", numeroEntero,
				numeroReal, s);

		// Mostramos el mensaje que se ha formado previamente.
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		
		
		
		
		
	}
}
