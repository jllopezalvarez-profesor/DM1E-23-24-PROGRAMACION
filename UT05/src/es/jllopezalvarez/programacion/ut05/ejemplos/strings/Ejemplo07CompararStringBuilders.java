package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo07CompararStringBuilders {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		llenarStringBuilder(sb1);
		llenarStringBuilder(sb2);
		
		System.out.printf("Resultado de comparar los StringBuilder: %b\n", sb1.equals(sb2));
		
		System.out.printf("Resultado de comparar los StringBuilder.toString(): %b\n", sb1.toString().equals(sb2.toString()));

		sb2 = sb1;
		System.out.printf("Resultado de comparar los StringBuilder: %b\n", sb1.equals(sb2));
		
	}
	
	public static void llenarStringBuilder(StringBuilder builder ) {
		for(int i=0; i<100; i++)
			builder.append(i);
	}

}
