package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio09;

import java.util.Random;

public class CuentaBancaria {

	private static final int SALDO_INICIAL_POR_DEFECTO = 0;
	private static final int MIN_NUM_CUENTA = 1000000;
	private static final int MAX_NUM_CUENTA = 9999999;
	private static final boolean ADMITE_DESCUBIERTO_DEFECTO = false;

	private final int numeroCuenta;
	private final String nifCliente;
	private final String nombreCliente;
	private final String apellidoCliente;
	private double saldo;
	private final boolean admiteDescubierto;

//	public CuentaBancaria(String nifCliente, String nombreCliente, String apellidoCliente) {
//		this.numeroCuenta = generarCuentaAleatoria();
//		this.nifCliente = nifCliente;
//		this.nombreCliente = nombreCliente;
//		this.apellidoCliente = apellidoCliente;
//		this.saldo = SALDO_INICIAL_POR_DEFECTO;
//	}

	public CuentaBancaria(String nifCliente, String nombreCliente, String apellidoCliente) {
		this(nifCliente, nombreCliente, apellidoCliente, SALDO_INICIAL_POR_DEFECTO, ADMITE_DESCUBIERTO_DEFECTO);
	}

	public CuentaBancaria(String nifCliente, String nombreCliente, String apellidoCliente, double saldo,
			boolean admiteDescubierto) {
		this.numeroCuenta = generarCuentaAleatoria();
		this.nifCliente = nifCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.saldo = saldo;
		this.admiteDescubierto = admiteDescubierto;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	private int generarCuentaAleatoria() {
		return new Random().nextInt(MIN_NUM_CUENTA, MAX_NUM_CUENTA + 1);
	}

	public void ingresar(double cantidad) {
		if (cantidad <= 0) {
			System.err.println("La cantidad a ingresar tiene que ser mayor que cero.");
		} else {
			this.saldo += cantidad;
		}
	}

	public void reembolsar(double cantidad) {
		if (cantidad <= 0) {
			System.err.println("La cantidad a reembolsar tiene que ser mayor que cero.");
			return;
		}

		double nuevoSaldo = this.saldo - cantidad;
		if (nuevoSaldo < 0 && !this.admiteDescubierto) {
			System.err.println("No se puede realizar la operación porque la cuenta no admite descubiertos.");
			return;
		}

		this.saldo -= cantidad;
	}

	public boolean estaEnNumerosRojos() {
		return this.saldo < 0;
	}

	public String toString() {
		return String.format("Cuenta: %d. Saldo: %.2f.\nTitular: %s - %s %s.\n", this.numeroCuenta, this.saldo,
				this.nifCliente, this.nombreCliente, this.apellidoCliente);
	}
}
