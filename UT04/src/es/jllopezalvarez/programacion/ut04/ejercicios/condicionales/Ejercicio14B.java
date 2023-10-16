package es.jllopezalvarez.programacion.ut04.ejercicios.condicionales;

import java.util.Scanner;

/*
 * ################################################################################
 * Enunciado
 * ################################################################################
 * La política de cobro de una compañía telefónica es: cuando se realiza una llamada, 
 * el cobro es por el tiempo que esta dura, de tal forma que los primeros cinco 
 * minutos cuestan 1 euro cada minuto, los siguientes tres, 80 céntimos, los 
 * siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. 
 * Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno 
 * de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar 
 * cuánto debe pagar por cada concepto una persona que realiza una llamada.
 *
 * ################################################################################
 * Análisis
 * ################################################################################
 * El precio final de la llamada depende del tiempo de la llamada.
 * - El primer minuto cuesta 1 euro.
 * - Los siguientes 3 minutos, 80 céntimos.
 * - Los siguientes 2 minutos, 70 céntimos.
 * - A partir del minuto 10, 50 céntimos.
 * Además el coste depende del día u del turno, de esta manera:
 * - Si la llamada es el domingo, se suma el 3% al precio final
 * - Si la llamada es cualquier otro día por la mañana, se suma el 15% al precio final
 * - Si la llamada es cualquier otro día por la tarde, se suma el 10% al precio final
 * Datos de entrada: 
 * - Tiempo de la llamada en minutos (entero)
 * - Si la llamada es en domingo (carácter S/N), turno (carácter (M/T)
 * Información de salida: Precio de la llamada en euros (real)
 *
 * Esta versión va procesando la cantidad de minutos de cada tramo, y avanzando al siguiente 
 * tramo con los minitos restantes. Puede parecer más compleja que la versión A, peroi cuando 
 * veamos métodos veremos que se adapta mejor para evitar repetir el mismo código varias veces.  
 * 
 * ################################################################################
 * Diseño
 * ################################################################################
 * 1. Leer tiempo (duración de la llamada)
// 2. Leer si la llamada es en domingo
// 3. Si no es en domingo, leer el turno (Mañana o Tarde)
// 4. Si tiempo <5 coste=tiempo*100
// 5. Si tiempo<8 coste=(tiempo-5)*80 + 500 (el coste de los cinco primeros minutos)
// 6. Si tiempo<10 coste=(tiempo-8)*70 + 240 (el coste desde el minuto 6 al 8) + 500 
//(el coste de los cinco primeros minutos)
// 7. Si tiempo>10 coste=(tiempo-10)*50 + 140 (el coste desde el minuto 9 al 10) + 240
// (el coste desde el minuto 6 al 8) + 500 (el coste de los cinco primeros minutos)
// 8. Si la llamada es en domingo coste = coste + 3%
// 9. Si la llamada es otro día por la mañana coste = coste + 15%
// 10. Si la llamada es otro día por la mañana coste = coste + 10%
// 11. Mostrar coste final en euros
/
 * 
*  1. Leer los números
*  2. Si el número 1 es mayor que el segundo escribir "El primero es mayor"
*  3. En caso contrario escribir "El primero no es mayor que el segundo" o "El primero es menor o igual que el segundo."
 * </pre>
 * 
 * ################################################################################
 */
public class Ejercicio14B {

	private static final int DURACION_TRAMO_1 = 5;
	private static final int DURACION_TRAMO_2 = 3;
	private static final int DURACION_TRAMO_3 = 2;

	private static final int COSTE_TRAMO_1 = 100;
	private static final int COSTE_TRAMO_2 = 80;
	private static final int COSTE_TRAMO_3 = 70;
	private static final int COSTE_TRAMO_FINAL = 50;

	private static final double RECARGO_DOMINGO = 3;
	private static final double RECARGO_LABORABLE_MANIANA = 15;
	private static final double RECARGO_LABORABLE_TARDE = 10;

	private static final String VALOR_RESPUESTA_SI = "S";
	private static final String VALOR_RESPUESTA_MANIANA = "M";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Preguntamos minutos de la llamada.
		System.out.print("¿Cuál es la duración de la llamada? ");
		int duracion = scanner.nextInt();

		// Preguntamos si es en domingo
		// Usamos .next() en lugar de nextLine porque sólo queremos leer una palabra, y
		// así "saltamos" el \n que nextInt deja en el buffer.
		System.out.print("La llamada es en Domingo (S/N)?");
		String respuestaDomingo = scanner.next();
		// Por claridad, creamos una variable boolean con la respuesta del usuario.
		// Asumimos que si responde algo distinto de "S", es que no es Domingo
		boolean esDomingo = respuestaDomingo.equalsIgnoreCase(VALOR_RESPUESTA_SI);

		// Sólo si no es domingo preguntamos si es mañana o tarde.
		// Creamos una variable para guardar si es mañana.
		// Inicializamos a false porque Java no nos deja usar variables potencialmente
		// no inicializadas.
		boolean esManiana = false;
		if (!esDomingo) {
			System.out.print("La llamada es en en horario de mañana o de tarde (M/T)?");
			// Otra vez, usamos .next() en lugar de nextLine para una sóla palabra
			String respuestaTurno = scanner.next();
			// Y creamos una variable boolean
			esManiana = respuestaTurno.equalsIgnoreCase(VALOR_RESPUESTA_MANIANA);
		}

		int coste = 0;

		// Procesamos los minutos que pertenecen al tramo 1
		if (duracion > 0) {
			if (duracion > DURACION_TRAMO_1) {
				coste += DURACION_TRAMO_1 * COSTE_TRAMO_1;
			} else {
				coste += duracion * COSTE_TRAMO_1;
			}
			// Restamos a duración los minutos del tramo 1. Esto hará que duración valga 0 o
			// negativo si la llamada era de duración menor al tramo 1
			duracion -= DURACION_TRAMO_1;
		}

		// Si después de procesar el tramo 1 quedan minutos, procesamos los minutos que
		// pertenecen al tramo 2
		if (duracion > 0) {
			if (duracion > DURACION_TRAMO_2) {
				coste += DURACION_TRAMO_2 * COSTE_TRAMO_2;
			} else {
				coste += duracion * COSTE_TRAMO_2;
			}
			// Restamos a duración los minutos del tramo 1. Esto hará que duración valga 0 o
			// negativo si la llamada era de duración menor a la suma del tramo 1 y el 2
			duracion -= DURACION_TRAMO_2;
		}

		// Si después de procesar el tramo 2 quedan minutos, procesamos los minutos que
		// pertenecen al tramo 3
		if (duracion > 0) {
			if (duracion > DURACION_TRAMO_3) {
				coste += DURACION_TRAMO_3 * COSTE_TRAMO_3;
			} else {
				coste += duracion * COSTE_TRAMO_3;
			}
			// Restamos a duración los minutos del tramo 1. Esto hará que duración valga 0 o
			// negativo si la llamada era de duración menor a la suma de los tramos 1 al 3
			duracion -= DURACION_TRAMO_3; // 2
		}

		// Si después de procesar el tramo 3 quedan minutos, procesamos los minutos que
		// pertenecen al tramo final
		if (duracion > 0) {
			coste += duracion * COSTE_TRAMO_FINAL;
		}

		// Vamos a pasar a euros para hacer el cálculo final
		double costeEuros = (double) coste / 100;

		// Ahora aplicamos los incrementos en función de día de la semana y turno.
		if (esDomingo) {
			costeEuros = costeEuros + (costeEuros * RECARGO_DOMINGO / 100);
		} else {
			if (esManiana) {
				costeEuros = costeEuros + (costeEuros * RECARGO_LABORABLE_MANIANA / 100);
			} else {
				costeEuros = costeEuros + (costeEuros * RECARGO_LABORABLE_TARDE / 100);
			}
		}

		System.out.printf("El precio final de la llamada es de %.2f\n", costeEuros);		
		
	}

}
