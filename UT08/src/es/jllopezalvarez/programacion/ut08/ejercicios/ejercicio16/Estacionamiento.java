package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
		
		return null;
	}
	
	

}
