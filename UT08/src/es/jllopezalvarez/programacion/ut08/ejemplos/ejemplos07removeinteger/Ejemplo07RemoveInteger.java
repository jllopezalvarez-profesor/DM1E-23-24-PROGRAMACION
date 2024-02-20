package es.jllopezalvarez.programacion.ut08.ejemplos.ejemplos07removeinteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo07RemoveInteger {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>(List.of( 3, 4, 5, 6, 7, 8, 9));
		
		System.out.println(numeros);
		
		numeros.remove(5);
		
		System.out.println(numeros);
		
		numeros.remove(Integer.valueOf(5));
		
		System.out.println(numeros);
		
		List<Integer> numeros2 =  Arrays.asList(1,2,3,4,5,6);
		System.out.println(numeros2.getClass().getSimpleName());
		System.out.println(numeros2);
		numeros2.remove(3);
		System.out.println(numeros2);
		
		
	}

}
