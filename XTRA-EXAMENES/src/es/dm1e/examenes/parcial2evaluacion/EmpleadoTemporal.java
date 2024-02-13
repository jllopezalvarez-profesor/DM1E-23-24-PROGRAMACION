package es.dm1e.examenes.parcial2evaluacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoTemporal extends Empleado {

	private static final long DURACION_CONTRATO_DEFECTO = 6;
	private final LocalDate fechaFinalizacion;

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento,
			double sueldoAnualEuros) {
		super(dni, nombre, apellidos, departamento, sueldoAnualEuros);
		this.fechaFinalizacion = LocalDate.now().plusMonths(DURACION_CONTRATO_DEFECTO);
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento,
			double sueldoAnualEuros, LocalDate fechaFinalizacion) {
		super(dni, nombre, apellidos, departamento, sueldoAnualEuros);
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion, double sueldoAnualEuros) {
		super(dni, nombre, apellidos, departamento, fechaIncorporacion, sueldoAnualEuros);
		this.fechaFinalizacion = LocalDate.now().plusMonths(DURACION_CONTRATO_DEFECTO);
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion, double sueldoAnualEuros, LocalDate fechaFinalizacion) {
		super(dni, nombre, apellidos, departamento, fechaIncorporacion, sueldoAnualEuros);
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion) {
		super(dni, nombre, apellidos, departamento, fechaIncorporacion);
		this.fechaFinalizacion = LocalDate.now().plusMonths(DURACION_CONTRATO_DEFECTO);
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion, LocalDate fechaFinalizacion) {
		super(dni, nombre, apellidos, departamento, fechaIncorporacion);
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, Departamento departamento) {
		super(dni, nombre, apellidos, departamento);
		this.fechaFinalizacion = LocalDate.now().plusMonths(DURACION_CONTRATO_DEFECTO);
	}

	public EmpleadoTemporal(String dni, String nombre, String apellidos, LocalDate fechaFinalizacion,
			Departamento departamento) {
		super(dni, nombre, apellidos, departamento);
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public long getTiempoRestanteContrato() {
		return ChronoUnit.DAYS.between(LocalDate.now(), fechaFinalizacion);
	}

	@Override
	public double getCotizacionDesempleo() {
		return this.getSueldoAnualEuros() / 12 * 0.0075;
	}

}
