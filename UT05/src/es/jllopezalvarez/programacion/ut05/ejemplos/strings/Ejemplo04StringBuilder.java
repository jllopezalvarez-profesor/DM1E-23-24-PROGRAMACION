package es.jllopezalvarez.programacion.ut05.ejemplos.strings;

public class Ejemplo04StringBuilder {

	public static void main(String[] args) {

		// Crear el StringBuilder
		StringBuilder sb = new StringBuilder();
		
		System.out.printf("Contenido del StringBuilder: '%s'.\n", sb.toString());
		
		
		// Añadir texto al final del la cadena de texto.
		// Múltiples sobrecargas permiten añadir cualquier tipo de datos
		String sabor = "fresa";
		int tamanioEnMl = 750;
		double precioEnEuros = 10.75;
//		sb.append("He comprado un batido de ");
//		sb.append(sabor);
//		sb.append(" de ");
//		sb.append(tamanioEnMl);
//		sb.append(" ml ");
//		sb.append("y me ha costado ");
//		sb.append(precioEnEuros);
//		sb.append(" €.");
		sb.append("He comprado un batido de ")
			.append(sabor).append(" de ")
			.append(tamanioEnMl)
			.append(" ml ")
			.append("y me ha costado ").append(precioEnEuros).append(" €.");


		// Para obtener la cadena de texto completa, se usa el método toString
		String cadenaCompleta = sb.toString();

		System.out.println(cadenaCompleta);

		System.out.println("Esto" + "Es " + " una " + "frase" + tamanioEnMl);
		
		// Otros métodos - delete - indexOf - insert - substring - reverse

		StringBuilder sb2 = new StringBuilder("esto quiero invertirlo");
		sb2.reverse();
		System.out.println(sb2.toString());
		
		sb2.insert(3, "AAA");
		System.out.println(sb2.toString());
		
		for(int posicion = sb2.length()-1; posicion > 0; posicion--) {
			sb2.insert(posicion, "-");
		}
		
		System.out.println(sb2.toString());
		
		
			
		
		
		
	}

}
