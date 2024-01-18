package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio05;

import java.time.LocalDate;

public class Programa {
	public static void main(String[] args) {
//		Producto producto01 = new Producto(LocalDate.of(2024, 2, 18), 21312);
//		System.out.println(producto01);
//
//		ProductoFresco producto02 = new ProductoFresco(LocalDate.of(2024, 01, 30), 323322, LocalDate.of(2024, 1, 10),
//				"España");
//		System.out.println(producto02);
//
//		ProductoCongelado producto03 = new ProductoCongelado(LocalDate.of(2024, 01, 30), 3242, -30);
//		System.out.println(producto03);

		Producto[] productos = new Producto[4];
		productos[0] = new Producto(LocalDate.of(2024, 2, 18), 21312);
		productos[1] = new ProductoFresco(LocalDate.of(2024, 01, 30), 323322, LocalDate.of(2024, 1, 10), "España");
		productos[2] = new ProductoCongelado(LocalDate.of(2024, 01, 30), 3242, -30);
		productos[3] = new ProductoRefrigerado(LocalDate.of(2024, 01, 30), 323322, "OMS");
	
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		
//		int[] numeros = new int[3];
//		numeros[0] = 3;
//		numeros[1] = 5D;
		
	}
}
