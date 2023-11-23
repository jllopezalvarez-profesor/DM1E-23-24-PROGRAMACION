package es.dm1e.examenes.global1evaluacion.modelob;

public class Ejercicio1 {
	public static void main(String[] args) {
		int suma = 0;
		int cuenta = 0;
		for (int i = 100; i >0; i--) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(i);
				suma += i;
				cuenta++;
			}
		}
		double media = (double) suma / cuenta;
		System.out.printf("La media de los números que no son buzz, fizz ni fizzbuzz es %.2f\n", media);
	}
}
