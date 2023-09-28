package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

import javax.swing.JOptionPane;

public class Ejemplo05JOptionPanePreguntarDatos {

	public static void main(String[] args) {
		// Pedir cadena de texto, y mostrarla.
//		System.out.println("¿Como te llamas?");
//		String nombre2 = sc.nextLine();
		
		String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
		JOptionPane.showMessageDialog(null, "Hola " + nombre);

		// Con valor inicial,
		String stringEdad = JOptionPane.showInputDialog(null, "¿Cuántos años tienes?", 5);
		int edad = Integer.parseInt(stringEdad);
		JOptionPane.showMessageDialog(null, "Tu edad es " + edad);

		// Sin valor inicial, leemos y convertimos sólo si ha devuelto valor
		String hermanos = JOptionPane.showInputDialog(null, "¿Cuántos hermanos tienes?");
		int numHermanos = Integer.parseInt(hermanos);
		JOptionPane.showMessageDialog(null, "Tienes " + numHermanos + " hermanos");
//		if (hermanos != null && !hermanos.isEmpty()) {
//			int numHermanos = Integer.parseInt(hermanos);
//			JOptionPane.showMessageDialog(null, "Tienes " + numHermanos + " hermanos");
//		} else {
//			JOptionPane.showMessageDialog(null, "No me has dicho cuantos hermanos tienes");
//		}
				
		
	}

}
