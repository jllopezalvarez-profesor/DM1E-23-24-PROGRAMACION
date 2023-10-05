package es.jllopezalvarez.programacion.ut03.ejemplos.ejemplos02string;

import java.util.Scanner;

public class Ejemplo04StringsComparacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Comparaciones de cadenas definidas con literales...
		String a = "ABCD";
		String b = "ABCD";
		System.out.printf("Resultado de a == b: '%b'.\n", a == b);
		System.out.printf("Resultado de a.equals(b): '%b'.\n", a.equals(b));
		// Java nos dice que son iguales, con == o con equals.

//		// Comparación de cadenas solicitadas al usuario...
//		System.out.print("Introduce una cadena: ");
//		String x = sc.nextLine();
//		System.out.print("Introduce la misma cadena: ");
//		String y = sc.nextLine();
//		System.out.printf("Resultado de x == y: '%b'.\n", x == y);
//		System.out.printf("Resultado de x.equals(y): '%b'.\n", x.equals(y));
//		// Ahora Java nos dice que no son iguales, si usamos ==, pero que sí lo son si
//		// usamos equals.

		// De momento, dogma de fe: para saber si dos Strings son iguales:
		// - SIEMPRE usar .equals, o .equalsIgnoreCase
		// - NUNCA usar ==
		// Veremos por qué pasa esto cuando estudiemos más a fondo objetos
		
		System.out.print("Introduce una cadena: ");
		String x = sc.nextLine();
		System.out.print("Introduce otra cadena: ");
		String y = sc.nextLine();
		int resultado = x.compareTo(y);
		System.out.printf("Resultado de x.compareTo(y) %d\n", resultado);
		
		
		
	}

}
