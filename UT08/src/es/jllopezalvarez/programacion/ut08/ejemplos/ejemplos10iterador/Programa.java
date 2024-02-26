package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos10iterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Programa {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(2, 4, 2, 6, 7, 5, 3, 6, 4, 2, 5, 7);

		List<Integer> numerosModificable = new ArrayList<>(numeros);

		numerosModificable.add(10);
		
		System.out.println(numerosModificable);

		Iterator<Integer> iterador = numerosModificable.iterator();
		while (iterador.hasNext()) {
			Integer numero = iterador.next();
			if (numero%2 == 0) {
				// Puedo eliminar (iterador.remove)
				// No puedo añadir (add)
				// No puedo cambiar (set)
			}
		}
		System.out.println(numerosModificable);
		
		ListIterator<Integer> iteradorLista = numerosModificable.listIterator();
		while (iteradorLista.hasNext()) {
			Integer numero = iteradorLista.next();
			if (numero%2 == 0) {
				// Cambiar el valor
				// iteradorLista.set(0);
				// Insertar un cero
				iteradorLista.add(0);
				// Puedo eliminar (iterador.remove)
				// No puedo añadir (add)
				// No puedo cambiar (set)
			}
		}
		System.out.println(numerosModificable);
		
		ListIterator<Integer> iteradorInverso = numerosModificable.listIterator(numerosModificable.size());
		while (iteradorLista.hasPrevious()) {
			Integer numero = iteradorLista.previous();
			System.out.print("-" + numero);
		}
		System.out.println();
		System.out.println(numerosModificable);
		
		
		
		
		
		

	}
}
