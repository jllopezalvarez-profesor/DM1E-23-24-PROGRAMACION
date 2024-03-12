package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoEnColaNoPuedeSalirException;
import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoNoEstacionadoException;
import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoYaEnColaException;
import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoYaEstacionadoException;

public class Estacionamiento {
	private final int numPlazas;
	private final int numPlazasCola;
	private final int tiempoCortesiaSg;
	private final double costePorSgEnCentimos;

	private final Map<String, LocalDateTime> estacionados;
	private final Queue<String> esperando;

	public Estacionamiento(int numPlazas, int numPlazasCola, int tiempoCortesiaSg, double costePorSgEnCentimos) {
		this.numPlazas = numPlazas;
		this.numPlazasCola = numPlazasCola;
		this.tiempoCortesiaSg = tiempoCortesiaSg;
		this.costePorSgEnCentimos = costePorSgEnCentimos;
		estacionados = new HashMap<>();
		esperando = new LinkedList<>();
	}

	public ResultadoEstacionamiento estacionarVehiculo(String matricula) {
		// Comprobar si ya está estacionado
		if (estacionados.containsKey(matricula)) {
			throw new VehiculoYaEstacionadoException(
					String.format("El vehículo con la matrícula %s ya está estacionado", matricula));
		}

		// Comprobar si ya está esperando en la cola
		if (esperando.contains(matricula)) {
			throw new VehiculoYaEnColaException(
					String.format("El vehículo con la matrícula %s está esperando en la cola", matricula));
		}

		if (estacionados.size() < numPlazas) {
			// Estacionamos, porque hay plazas
			estacionados.put(matricula, LocalDateTime.now());
			return ResultadoEstacionamiento.ESTACIONADO;
		}

		if (esperando.size() < numPlazasCola) {
			// Se queda esperando en la cola.
			esperando.add(matricula);
			return ResultadoEstacionamiento.ESPERANDO;
		}

		// No hay sitio ni en el estacionamiento ni en la cola
		return ResultadoEstacionamiento.RECHAZADO;
	}

	public double retirarVehiculo(String matricula) {
		if (!estacionados.containsKey(matricula) && !esperando.contains(matricula)) {
			throw new VehiculoNoEstacionadoException(
					String.format("El vehículo con matrícula %s no está en el estacionamiento", matricula));
		}

		if (esperando.contains(matricula)) {
			throw new VehiculoEnColaNoPuedeSalirException(String.format(
					"No se puede retirar el vehículo con matrícula %s porque no ha accedido aún al estacionamiento",
					matricula));
		}

		// Está estacionado
		LocalDateTime fechaEstacionamiento = estacionados.get(matricula);

		// Calcular tiempo que lleva
		long tiempoEstacionadoSg = ChronoUnit.SECONDS.between(fechaEstacionamiento, LocalDateTime.now());
		double importe = 0;
		if (tiempoEstacionadoSg > tiempoCortesiaSg) {
			importe = tiempoEstacionadoSg * this.costePorSgEnCentimos;
			// Paso de cts a euros
			importe = importe / 100;
		}
		// Quitar el vehículo
		estacionados.remove(matricula);

		// ¿Hay en cola?
		if (!esperando.isEmpty()) {
			String matriculaNuevoAcceso = esperando.remove();
			estacionados.put(matriculaNuevoAcceso, LocalDateTime.now());
		}

		return importe;

	}

	public Collection<String> getMatriculasEstacionados() {

		return Collections.unmodifiableCollection(new TreeSet<>(estacionados.keySet()));
	}

	public boolean estaEstacionado(String matricula) {
		return estacionados.containsKey(matricula);
	}

}
