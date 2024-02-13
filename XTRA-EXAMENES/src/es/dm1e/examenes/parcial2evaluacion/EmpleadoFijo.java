package es.dm1e.examenes.parcial2evaluacion;

import java.time.LocalDate;

public class EmpleadoFijo extends Empleado {

	public EmpleadoFijo(String dni, String nombre, String apellidos, Departamento departamento,
			double sueldoAnualEuros) {
		super(dni, nombre, apellidos, departamento, sueldoAnualEuros);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoFijo(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion, double sueldoAnualEuros) {
		super(dni, nombre, apellidos, departamento, fechaIncorporacion, sueldoAnualEuros);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoFijo(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion) {
		super(dni, nombre, apellidos, departamento, fechaIncorporacion);
		// TODO Auto-generated constructor stub
	}

	public EmpleadoFijo(String dni, String nombre, String apellidos, Departamento departamento) {
		super(dni, nombre, apellidos, departamento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCotizacionDesempleo() {
		return this.getSueldoAnualEuros() / 12 * 0.0095;
	}

}
