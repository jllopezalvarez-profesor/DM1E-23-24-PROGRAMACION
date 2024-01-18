package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.programa;

import java.util.Scanner;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases.Color;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases.Consumo;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases.Electrodomestico;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases.Lavadora;
import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio06.clases.Television;

public class Programa {
	public static void main(String[] args) {

//		Electrodomestico e1 = new Electrodomestico(20, 0.5);
//		mostrarPesoElectrodomestico(e1);
//		Lavadora l1 = new Lavadora(100, 40);
//		System.out.println(l1.getCarga());
//		Electrodomestico e2 = l1;
//		
//		Lavadora l2 = (Lavadora) e2;
//		System.out.println("Carga de la lavadora l2: " + l2.getCarga());
//		
//		Television t1 = new Television();
//		Electrodomestico e3 = t1;
//		Lavadora l3 = (Lavadora) e3;
//		Object o1 = l3;
//		
//		Scanner s = (Scanner)o1;
//		
//		System.out.printf("Referencias de l1 y e2: %s y %s\n", l1, e2);
////		System.out.println(e2.getCarga());
//		mostrarPesoElectrodomestico(l1);

		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		electrodomesticos[0] = new Lavadora(230, Color.INOX, Consumo.C, 40, 7);
		electrodomesticos[1] = new Television(280, Color.NEGRO, Consumo.A, 17, 55, true);
		electrodomesticos[2] = new Electrodomestico(110, 12);
		electrodomesticos[3] = new Lavadora(280, 70);
		electrodomesticos[4] = new Television(199, Color.NEGRO, Consumo.C, 12, 36, false);
		electrodomesticos[5] = new Electrodomestico();
		electrodomesticos[6] = new Lavadora();
		electrodomesticos[7] = new Television(880, Color.NEGRO, Consumo.A, 40, 70, true);
		electrodomesticos[8] = new Electrodomestico();
		electrodomesticos[9] = new Lavadora();

		System.out.println("-".repeat(50));

		mostrarTodosLosPrecios(electrodomesticos);

		System.out.println("-".repeat(50));

		mostrarPreciosLavadoras(electrodomesticos);

		System.out.println("-".repeat(50));

		mostrarPreciosTelevisiones(electrodomesticos);

	}

	private static void mostrarTodosLosPrecios(Electrodomestico[] electrodomesticos) {
		for (Electrodomestico electrodomestico : electrodomesticos) {
			System.out.println(electrodomestico.getPrecioFinal());
		}

	}

	private static void mostrarPreciosLavadoras(Electrodomestico[] electrodomesticos) {
		double suma = 0;
		int cuenta = 0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Lavadora) {
				Lavadora lavadora = (Lavadora) electrodomestico;
				System.out.printf("Precio de la lavadora con carga %f kg: %.2f \n", lavadora.getCarga(),
						electrodomestico.getPrecioFinal());
				suma += electrodomestico.getPrecioFinal();
				cuenta++;
			}
		}
		double precioMedio = suma / cuenta;
		System.out.printf("El precio medio de las lavadoras es de %.2f euros\n", precioMedio);
	}

	private static void mostrarPreciosTelevisiones(Electrodomestico[] electrodomesticos) {
		double suma = 0;
		int cuenta = 0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Television) {
				Television television = (Television) electrodomestico;
				System.out.printf("Precio de la televisión con %d pulgadas es: %.2f \n",
						television.getResolucionPulgadas(), electrodomestico.getPrecioFinal());
				suma += electrodomestico.getPrecioFinal();
				cuenta++;
			}
		}
		double precioMedio = suma / cuenta;
		System.out.printf("El precio medio de las televisiones es de %.2f euros\n", precioMedio);
	}

	private static void mostrarPreciosLavadorasYTv(Electrodomestico[] electrodomesticos) {
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Lavadora) {
				Lavadora lavadora = (Lavadora) electrodomestico;
				System.out.printf("Precio de la lavadora con carga %f kg: %.2f \n", lavadora.getCarga(),
						electrodomestico.getPrecioFinal());
			}
			if (electrodomestico instanceof Television) {
				Television tv = (Television) electrodomestico;
				System.out.printf("Precio de la tv con %d pulgadas: %.2f \n", tv.getResolucionPulgadas(),
						electrodomestico.getPrecioFinal());
			}
//			if (Electrodomestico.class.isInstance(electrodomestico)) {
//				System.out.println("No es lavadora ni television");
//			}

			if (electrodomestico.getClass().equals(Electrodomestico.class)) {
				System.out.println("No es lavadora ni television");
			}
		}
	}

	private static void mostrarPesoElectrodomestico(Electrodomestico e) {

		System.out.printf("El peso del electrodomestico es %.2f\n", e.getPesoKg());
	}

}
