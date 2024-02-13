package es.dm1e.examenes.parcial2evaluacion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Empleado extends Persona implements Cotizable {
	private static final double SALARIO_DEFECTO = 24000;
	// Esto no porque al ser estático no cambia aunque el programa siga ejecutándose
	// durante días
	// private static final LocalDate FECHA_DEFECTO = LocalDate.now();

	private final Departamento departamento;
	private final LocalDate fechaIncorporacion;
	private final double sueldoAnualEuros;

	public Empleado(String dni, String nombre, String apellidos, Departamento departamento) {
		super(dni, nombre, apellidos);
		this.departamento = departamento;
		this.fechaIncorporacion = LocalDate.now();
		this.sueldoAnualEuros = SALARIO_DEFECTO;

	}

	public Empleado(String dni, String nombre, String apellidos, Departamento departamento, double sueldoAnualEuros) {
		this(dni, nombre, apellidos, departamento, LocalDate.now(), sueldoAnualEuros);
	}

	public Empleado(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion) {
		this(dni, nombre, apellidos, departamento, fechaIncorporacion, SALARIO_DEFECTO);

	}

	public Empleado(String dni, String nombre, String apellidos, Departamento departamento,
			LocalDate fechaIncorporacion, double sueldoAnualEuros) {
		super(dni, nombre, apellidos);
		this.departamento = departamento;
		this.fechaIncorporacion = fechaIncorporacion;
		this.sueldoAnualEuros = sueldoAnualEuros;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}
	
	public double getSueldoAnualEuros() {
		return sueldoAnualEuros;
	}

	public long getAntiguedad() {
		return ChronoUnit.MONTHS.between(fechaIncorporacion, LocalDate.now());
		// return Period.between(this.fechaIncorporacion, LocalDate.now()).getMonths();
	}

	public double getIrpfMensual() {
		return this.sueldoAnualEuros / 12 * 0.2;
	}

	@Override
	public double getCotizacionSeguridadSocial() {
		return this.sueldoAnualEuros / 12 * 0.05;
	}

}
