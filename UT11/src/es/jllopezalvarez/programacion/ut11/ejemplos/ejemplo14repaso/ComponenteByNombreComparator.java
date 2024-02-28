package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

import java.util.Comparator;

public class ComponenteByNombreComparator implements Comparator<Componente> {

	@Override
	public int compare(Componente este, Componente otro) {
		
		return este.getNombre().compareToIgnoreCase(otro.getNombre());
	}

}
