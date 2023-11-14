package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo09Replace {

	public static void main(String[] args) {
		String s = "Esta es la c[a]dena original";
		
		String s2 = s.replace("[a]", "0");
		
		System.out.println(s2);
		
		String s3 = s.replaceAll("[a]", "0");

		System.out.println(s3);
		
		String s4 = s.replaceAll("[aeiou]", "0");
		
		System.out.println(s4);

		String s5 = s.replace("[aeiou]", "0");
		
		System.out.println(s5);

		
	}

}
