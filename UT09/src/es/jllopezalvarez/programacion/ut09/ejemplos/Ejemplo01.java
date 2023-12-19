package es.jllopezalvarez.programacion.ut09.ejemplos;

import java.io.EOFException;

public class Ejemplo01 {

	public static void main(String[] args) {

		int numero = Integer.valueOf("5");
		System.out.println(numero);

		try {
			System.out.println("En el try, antes del error...");
			int numero2 = Integer.parseInt("diez");
			int numero3 = Integer.parseInt("once");
			System.out.println("En el try, después del error...");
			System.out.println(numero2);
		} catch (NumberFormatException e) {
			System.out.println("En el catch de NumberFormatException ...");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("En el catch de IndexOutOfBoundsException ...");

		} catch(Exception e) {
		
		}

		System.out.println("Fin del programa");
	}

}
