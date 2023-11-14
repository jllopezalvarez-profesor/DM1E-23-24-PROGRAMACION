package es.jllopezalvarez.programacion.ut05.ejemplos.ejemplos00repasometodos;

public class Ejemplo02Referencias {
	public static void main(String[] args) {

		int[] array1 = new int[10];
		System.out.println(array1);
		int[] array2 = new int[10];
		System.out.println(array2);
		int[] array3 = array1;
		System.out.println(array3);
		
		mostrarArray(array1, "array1");
		
		mostrarArray(array3, "array3");
		
		array1[4] = 10;
		
		mostrarArray(array1, "array1");
		
		mostrarArray(array3, "array3");
		
		
	}

	private static void mostrarArray(int[] array, String nombreArray) {
		System.out.println(nombreArray);
		for (int i : array) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
}
