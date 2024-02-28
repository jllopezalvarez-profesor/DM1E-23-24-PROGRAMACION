package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
	public static void main(String[] args) {
		Organismo[] organismos = new Organismo[6];
		organismos[0] = new Cocodrilo();
		organismos[1] = new Geranio();
		organismos[2] = new Perro("Lassie", 10);
		organismos[3] = new Cocodrilo();
		organismos[4] = new Geranio();
		organismos[5] = new Perro("Laika", 8);

		for (int i = 0; i < organismos.length; i++) {
			System.out.println("Organismo " + (i + 1) + ": " + organismos[i].getTipoOrganismo());
		}

		for (Organismo organismo : organismos) {
			if (organismo instanceof Vegetal) {
				((Vegetal) organismo).fotosintesis(10);
			}

			if (organismo instanceof Animal) {
				((Animal) organismo).comer("comida");
				if (organismo instanceof Mamifero) {
					((Mamifero) organismo).amamantar(5);
				}
				if (organismo instanceof Reptil) {
					((Reptil) organismo).reptar(7);
				}
			}
		}

		// Recorrer el array de organismos con un bucle for-each y:
		// - si es Vegetal, llamar al método fotosíntesis con valor de paramétro 10
		// - si es Animal, llamar al método comer con valor de paraḿetro "comida"
		// - si es Animal Mamífero llamar al método "amamanatar" con valor de parámetro
		// "5".
		// - si es Animal Reptil llamar al método "reptar" con valor de parámetro "7".

		List<Perro> perros = new ArrayList<>();

		for (Organismo organismo : organismos) {
			if (organismo instanceof Perro)
				perros.add((Perro) organismo);

		}

		System.out.println(perros);
		// Collections.sort(perros);
		perros.sort(null);
		System.out.println(perros);

		perros.sort(new PerroByNameComparator().reversed());
//		perros.sort(new Comparator<Perro>() {
//
//			@Override
//			public int compare(Perro o1, Perro o2) {
//				return Integer.compare(o1.getEdad(), o2.getEdad());
//			}
//		}.reversed());
		System.out.println(perros);

	}

	static class PerroByNameComparator implements Comparator<Perro> {
		@Override
		public int compare(Perro o1, Perro o2) {
			return Integer.compare(o1.getEdad(), o2.getEdad());
		}

	}
}
