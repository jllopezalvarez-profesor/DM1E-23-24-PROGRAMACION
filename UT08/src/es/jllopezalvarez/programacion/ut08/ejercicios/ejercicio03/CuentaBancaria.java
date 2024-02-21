package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CuentaBancaria {
	private static long contadorCuentas = 100_000_000_000L;

	private long numeroCuenta;
	private Cliente cliente;
	private List<Movimiento> movimientos;

	public CuentaBancaria(Cliente cliente) {
		this(cliente, 0);
	}

	public CuentaBancaria(Cliente cliente, double saldoInicial) {
		// Copia defensiva - Opción uno - Usar el constructor "estándar" de cliente
		this.cliente = new Cliente(cliente.getId(), cliente.getNombre(), cliente.getApellidos(),
				cliente.getFechaNacimiento(), cliente.getEmail());

		// Copia defensiva - Opción dos - Usar un constructor "de copia" en cliente
		// this.cliente = new Cliente(cliente);

		this.movimientos = new ArrayList<Movimiento>();

		// Creamos el primer movimiento, sólo si el saldo inicial es mayor que cero
		// TODO: ¿Y si es negativo?
		if (saldoInicial != 0) {
			movimientos.add(new Movimiento(TipoMovimiento.INGRESO, 0, saldoInicial, "Apertura de cuenta"));
		}

		// Asignar ID de cuenta. No lo he hecho antes para evitar que incrementáramos el
		// valor si algo sale mal
		this.numeroCuenta = CuentaBancaria.contadorCuentas;
		CuentaBancaria.contadorCuentas++;
	}

	public double getSaldo() {
		// Si la lista de movimientos está vacía el saldo es cero
		if (movimientos.isEmpty()) {
			return 0;
		}
		// Si no, el saldo será el saldo final del último elemento de la lista
		return movimientos.get(movimientos.size() - 1).getSaldoFinal();
	}

	public void ingresar(double importe, String concepto) {
		double saldoInicial = this.getSaldo();
		// Asumo que el importe es positivo. Como me sirve para el constructor de
		// movimiento no hago nada
		movimientos.add(new Movimiento(TipoMovimiento.INGRESO, saldoInicial, importe, concepto));
	}

	public void reembolsar(double importe, String concepto) {
		double saldoInicial = this.getSaldo();
		// Asumo que el importe es positivo. Como el constructor de movimiento en este
		// caso debe recibir menor que cero, cambio el signo al pasar el parámetro
		movimientos.add(new Movimiento(TipoMovimiento.REINTEGRO, saldoInicial, -importe, concepto));
	}

	public void recibirTransferencia(double importe, String concepto) {
		double saldoInicial = this.getSaldo();
		// Asumo que el importe es positivo. Como me sirve para el constructor de
		// movimiento no hago nada
		movimientos.add(new Movimiento(TipoMovimiento.TRANSFERENCIA_FAVOR, saldoInicial, importe, concepto));
	}

	public void transferir(double importe, String concepto) {
		double saldoInicial = this.getSaldo();
		// Asumo que el importe es positivo. Como el constructor de movimiento en este
		// caso debe recibir menor que cero, cambio el signo al pasar el parámetro
		movimientos.add(new Movimiento(TipoMovimiento.TRANSFERENCIA_CONTRA, saldoInicial, -importe, concepto));
	}

	public List<Movimiento> getMovimientos() {
		List<Movimiento> copia = new ArrayList<>(this.movimientos);
		copia.sort(Comparator.comparing(Movimiento::getFechaHoraMovimiento).reversed());
		return List.copyOf(copia);
	}

	@Override
	public String toString() {
		return String.format("Cuenta nº %s", this.numeroCuenta);
	}

}
