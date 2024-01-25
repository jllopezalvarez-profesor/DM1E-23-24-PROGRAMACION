package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos11interfaces.ejemplo05anonimas;

import java.util.Comparator;

public class ByIdPersonaComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// MAL:
//		String id1 = String.valueOf(o1.getId());
//		String id2 = String.valueOf(o2.getId());
//		return id1.compareTo(id2);
		return Integer.compare(o1.getId(), o2.getId());

	}

}
