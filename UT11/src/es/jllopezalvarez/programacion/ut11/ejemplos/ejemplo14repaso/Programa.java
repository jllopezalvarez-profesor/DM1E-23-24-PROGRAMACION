package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo14repaso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		List<Componente> componentes = new ArrayList<>();

//		componentes.sort(null);
		componentes.add(new TarjetaGrafica("123123SewSSDq", "Tarjeta modelo A", "Desc t modelo A", 3));
		componentes.add(new TarjetaGrafica("123123SEWSSDq", "Tarjeta modelo A", "Desc t modelo A", 3));
		componentes.add(new TecladoMecanico("fdfsdq1234134", "El teclado mecánico", "Teclado mecánico"));
		componentes.add(new ProcesadorArm("asdad", "ARM", "ARM", 12));
		componentes.add(new Teclado("ewrrew", "Teclado de membrana", "Teclado de membrana"));
		componentes.add(new TarjetaGrafica("123123SewSSDq", "Tarjeta modelo A", "Desc t modelo A", 5, 6));

		componentes.sort(Comparator.reverseOrder());
		
		componentes.sort(Comparator.comparing(Componente::getDescripcion).reversed());
		
		componentes.sort(new ComponenteByNombreComparator().reversed());
		
		
		for (Componente componente : componentes) {
			if (componente instanceof TarjetaGrafica tarjeta) {
				System.out.printf("%s - %s - %s - %.2f W - %d GB\n", componente.getNumeroSerie(),
						componente.getNombre(), componente.getDescripcion(), componente.getConsumo(),
						tarjeta.getMemoriaGB());
			} else {
				System.out.printf("%s - %s - %s - %.2f W\n", componente.getNumeroSerie(), componente.getNombre(),
						componente.getDescripcion(), componente.getConsumo());
			}
		}

		Componente c1 = componentes.get(0);
		Componente c2 = componentes.get(1);
		System.out.printf("¿Son los dos primeros componentes iguales? %s\n",  c1.equals(c2));
		
	}

}
