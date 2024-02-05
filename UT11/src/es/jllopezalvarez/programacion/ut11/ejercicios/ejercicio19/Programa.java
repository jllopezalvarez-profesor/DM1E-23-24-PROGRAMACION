package es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Random;

import es.jllopezalvarez.programacion.ut11.ejercicios.ejercicio19.instrumentos.*;
import net.datafaker.Faker;

public class Programa {
	private static final int CANTIDAD_INSTRUMENTOS = 8;

	private static final int NUM_TIPOS_INSTRUMENTOS = 12;

	private static Faker faker = new Faker(new Locale("es"), new Random(5));

	public static void main(String[] args) {

		System.out.println(factorialRecursivo(10));
		
		Instrumento[] instrumentos = crearInstrumentos(CANTIDAD_INSTRUMENTOS);

		instrumentos[3] = null;

		tocarInstrumentos(instrumentos);
		Instrumento masDificil = buscarMasDificil(instrumentos);
		System.out.println("El instrumento más dificil es:");
		System.out.println(masDificil);

		afinarInstrumentos(instrumentos);

		System.out.println("Antes de ordenar:");
		mostrarInstrumentos(instrumentos);

		// Ordenar por orden natural
		Arrays.sort(instrumentos, Comparator.nullsFirst(Comparator.naturalOrder()));

		System.out.println("Después de ordenar:");
		mostrarInstrumentos(instrumentos);

		Arrays.sort(instrumentos, Comparator.nullsLast(Comparator.reverseOrder()));

		System.out.println("Después de ordenar en orden natural inverso:");
		mostrarInstrumentos(instrumentos);

		// Ordenar por nombre de propietario
		ByPropietarioInstrumentoComparator comparador = new ByPropietarioInstrumentoComparator();
		Arrays.sort(instrumentos, comparador);
		System.out.println("Después de ordenar por propietario:");
		mostrarInstrumentos(instrumentos);

		// Ordenar por nombre de propietario descendente con clase anónima
		Arrays.sort(instrumentos, new Comparator<Instrumento>() {

			@Override
			public int compare(Instrumento instrumentoA, Instrumento instrumentoB) {
				if (instrumentoA == null && instrumentoB == null)
					return 0;
				if (instrumentoA == null)
					return -1;
				if (instrumentoB == null)
					return 1;
				return -instrumentoA.getPropietario().compareTo(instrumentoB.getPropietario());
			}

		});

		System.out.println("Después de ordenar por propietario con clase anónima:");
		mostrarInstrumentos(instrumentos);

		// Ordenar dificultad descendente
		Arrays.sort(instrumentos, Comparator.comparing(Instrumento::getDificultad).reversed()
				.thenComparing(Instrumento::getPropietario).reversed());

		System.out.println("Después de ordenar con referencias a métodos:");
		mostrarInstrumentos(instrumentos);

		Arrays.sort(instrumentos, Comparator.nullsFirst(new Comparator<Instrumento>() {

			@Override
			public int compare(Instrumento arg0, Instrumento arg1) {

				return arg0.getClass().getSimpleName().compareTo(arg1.getClass().getSimpleName());
			}

		}));
		
		System.out.println("Después de ordenar con referencias a métodos:");
		mostrarInstrumentos(instrumentos);
		
		
		
//		for (Instrumento instrumento : instrumentos) {
//			System.out.println(instrumento);
//		}

	}

	private static Instrumento[] crearInstrumentos(int cuantos) {
		Instrumento[] instrumentos = new Instrumento[cuantos];
		for (int i = 0; i < instrumentos.length; i++) {
			instrumentos[i] = crearInstrumentoAleatorio();
		}
		return instrumentos;
	}

	private static void tocarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento != null) {
				instrumento.tocar();
			}
		}
		for (Instrumento instrumento : instrumentos) {
			if (instrumento != null) {
				instrumento.parar();
			}
		}
	}

	private static Instrumento buscarMasDificil(Instrumento[] instrumentos) {
		if (instrumentos.length == 0) {
			throw new IllegalArgumentException("El array de instrumentos no puede estar vacío");
		}
		// TODO: ¿comprobar nulos?
		Instrumento masDificil = instrumentos[0];
		for (Instrumento instrumento : instrumentos) {
			if (instrumento != null) {

				if (instrumento.esMasDificil(masDificil)) {
					masDificil = instrumento;
				}
			}
		}
		return masDificil;
	}

	private static void mostrarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {

			System.out.println(instrumento);
		}
	}

	private static Instrumento crearInstrumentoAleatorio() {
		switch (faker.random().nextInt(NUM_TIPOS_INSTRUMENTOS)) {
		case 0:
			return new Arpa(faker.name().fullName());
		case 1:
			return new Clarinete(faker.name().fullName());
		case 2:
			return new Flauta(faker.name().fullName());
		case 3:
			return new Guitarra(faker.name().fullName());
		case 4:
			return new Pandereta(faker.name().fullName());
		case 5:
			return new Piano(faker.name().fullName());
		case 6:
			return new Timbales(faker.name().fullName());
		case 7:
			return new Trompeta(faker.name().fullName());
		case 8:
			return new Tuba(faker.name().fullName());
		case 9:
			return new Violin(faker.name().fullName());
		case 10:
			return new Violoncelo(faker.name().fullName());
		case 11:
			return new Xilofono(faker.name().fullName());
		default:
			throw new RuntimeException("Valor en switch no válido");
		}
	}

	private static void afinarInstrumentos(Instrumento[] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Afinable) {
				((Afinable) instrumento).afinar();
			}
		}
	}

	private static long factorialIterativo(int n) {
		long resultado = 1;
		while (n > 1) {
			resultado *= n;
			n--;
		}
		return resultado;
	}
	
	
	private static long factorialRecursivo(int n) {
		if (n == 0) return 1;
		return factorialRecursivo(n-1) * n;
	}
	
	
	
}
