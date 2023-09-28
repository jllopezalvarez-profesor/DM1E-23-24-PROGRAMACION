package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejemplo04JOptionPaneMensajes {

	public static void main(String[] args) {
		// Mensaje básico.
		JOptionPane.showMessageDialog(null, "El mensaje más básico");
		
		// Con título y con un icono de tipo de mensaje personalizado
		JOptionPane.showMessageDialog(null, "El mensaje con título", "Título de la ventana", JOptionPane.ERROR_MESSAGE);
		
		// Con título e imagen
		JOptionPane.showMessageDialog(null, "Más completo", "Título", JOptionPane.WARNING_MESSAGE, new ImageIcon(
				"images/green.gif"));
	}
}
