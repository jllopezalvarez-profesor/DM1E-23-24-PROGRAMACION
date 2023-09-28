package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos03entradasalida;

import javax.swing.JOptionPane;

public class Ejemplo06JOptionPaneConfirmar {

	public static void main(String[] args) {
		// El más básico (muestra tres botones, si, no cancelar)
		int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
		// Para saber qué botón se ha pulsado, se compara con atributos constantes de
		// JOptionPane
		if (opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'Sí'");
		}
		if (opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'No'");
		}
		if (opcion == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'Cancelar'");
		}

		// Con menos botones, sólo con si y no. Es obligatorio poner título:
		opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?", "Una pregunta...", JOptionPane.YES_NO_OPTION);
		if (opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'Sí'");
		}
		if (opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'No'");
		}

		// Añadimos tipo de mensaje.
		opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?", "Una pregunta...", JOptionPane.YES_NO_OPTION,
				JOptionPane.ERROR_MESSAGE);
		if (opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'Sí'");
		}
		if (opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has seleccionado 'No'");
		}

	}

}
