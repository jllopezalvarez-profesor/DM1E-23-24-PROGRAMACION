package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19;

import java.util.Comparator;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19.instrumentos.Instrumento;

public class ByPropietarioInstrumentoComparator implements Comparator<Instrumento> {

	@Override
	public int compare(Instrumento instrumentoA, Instrumento instrumentoB) {
		if (instrumentoA == null && instrumentoB == null) return 0; 
		if (instrumentoA == null) return -1;
		if (instrumentoB == null) return 1;
		return instrumentoA.getPropietario().compareTo(instrumentoB.getPropietario());
	}

}
