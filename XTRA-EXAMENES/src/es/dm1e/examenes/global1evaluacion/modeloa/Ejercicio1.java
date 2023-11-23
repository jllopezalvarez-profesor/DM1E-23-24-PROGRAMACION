package es.dm1e.examenes.global1evaluacion.modeloa;

public class Ejercicio1 {
	public static void main(String[] args) {
		int suma = 0;
		int cuenta = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("fizz");
			} else if (i % 3 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
				suma += i;
				cuenta++;
			}
		}
		double media = (double) suma / cuenta;
		System.out.printf("La media de los números que no son fizz, buzz ni fizzbuzz es %.2f\n", media);
	}
}
