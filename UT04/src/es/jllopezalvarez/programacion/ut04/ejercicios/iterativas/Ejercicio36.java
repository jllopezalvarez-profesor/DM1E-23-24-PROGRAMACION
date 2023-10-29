package es.jllopezalvarez.programacion.ut04.ejercicios.iterativas;

import java.util.Scanner;

public class Ejercicio36 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida el límite inferior y superior de un intervalo
		 * (números enteros). Si el límite inferior es mayor que el superior lo tiene
		 * que volver a pedir, y seguir haciéndolo hasta que el usuario lo haga
		 * correctamente. A continuación, se van introduciendo números enteros hasta que
		 * introduzcamos el 0. Entonces, el programa dará las siguientes informaciones:
		 * • La suma de los números que están dentro del intervalo. Intervalo abierto,
		 * no incluye los límites. • Cuántos números están fuera del intervalo. Como el
		 * intervalo es abierto, los números fuera del intervalo incluyen los límites. •
		 * Informa si hemos introducido algún número igual a los límites del intervalo
		 * (solo si ha habido alguno o no).
		 */

		Scanner scanner = new Scanner(System.in);

		int limiteInferior;
		int limiteSuperior;

		do {
			System.out.print("Introduce el límite inferior: ");
			limiteInferior = scanner.nextInt();
			System.out.print("Introduce el límite superior: ");
			limiteSuperior = scanner.nextInt();
			if (limiteSuperior < limiteInferior) {
				System.out.println("El límite superior no puede ser menor que el inferior.");
			}
		} while (limiteSuperior < limiteInferior);

		int sumaDentroIntervalo = 0;
		int cuentaFueraIntervalo = 0;
		boolean algunoEnLimite = false;

		int numero;
		do {
			System.out.print("Introduce un número, cero para terminar: ");
			numero = scanner.nextInt();
			if (numero > limiteInferior && numero < limiteSuperior) {
				sumaDentroIntervalo += numero;
			} else {
				cuentaFueraIntervalo++;
			}
			// if (!(numero > limiteInferior && numero < limiteSuperior)) {
			// if ((numero <= limiteInferior || numero >= limiteSuperior)) {
			// cuentaFueraIntervalo++;
			// }
			if (numero == limiteInferior || numero == limiteSuperior) {
				algunoEnLimite = true;
			}
		} while (numero != 0);

		System.out.printf("La suma de los números dentro del intervalo (%d, %d) es %d\n", limiteInferior,
				limiteSuperior, sumaDentroIntervalo);
		System.out.printf("Se han introducido %d números fuera del intervalo (%d, %d)\n", cuentaFueraIntervalo,
				limiteInferior, limiteSuperior);
		System.out.println(
				algunoEnLimite ? "Se han introducido valores en el límite" : "No se ha introducino valores del límite");
	}
}
