package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16;

import es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio16.exceptions.VehiculoYaEstacionadoException;

public class Programa {
	public static void main(String[] args) {

		Estacionamiento estacionamiento = new Estacionamiento(20, 4, 20, 1);
		
		
		try {
			estacionamiento.estacionarVehiculo("123456A");
			estacionamiento.estacionarVehiculo("123456A");
		} catch (VehiculoYaEstacionadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
