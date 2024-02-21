package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio03;

import java.time.LocalDateTime;

public class Movimiento {
	private TipoMovimiento tipoMovimiento;
	private LocalDateTime fechaHoraMovimiento;
	private double saldoInicial;
	private double importe;
	private double saldoFinal;
	private String concepto;

	public Movimiento(TipoMovimiento tipoMovimiento, double saldoInicial, double importe, String concepto) {
		
//		switch (tipoMovimiento) {
//		case INGRESO, TRANSFERENCIA_FAVOR:
//			if (importe <= 0) {
//				throw new IllegalArgumentException(
//						"El importe para ingresos o transferencias favor de la cuenta debe ser mayor que cero");
//			}
//			break;
//		case REINTEGRO, TRANSFERENCIA_CONTRA:
//			if (importe >= 0) {
//				throw new IllegalArgumentException(
//						"El importe para reintegros o transferencias en contra de la cuenta debe ser menor que cero");
//			}
//			break;
//		}

		if ((tipoMovimiento == TipoMovimiento.INGRESO || tipoMovimiento == TipoMovimiento.TRANSFERENCIA_FAVOR)
				&& importe <= 0) {
			throw new IllegalArgumentException(
					"El importe para ingresos o transferencias favor de la cuenta debe ser mayor que cero");
		}
		
		if ((tipoMovimiento == TipoMovimiento.REINTEGRO || tipoMovimiento == TipoMovimiento.TRANSFERENCIA_CONTRA)
				&& importe >= 0) {
			throw new IllegalArgumentException(
					"El importe para reintegros o transferencias en contra de la cuenta debe ser menor que cero");
		}
		
		
		
		this.tipoMovimiento = tipoMovimiento;
		this.fechaHoraMovimiento = LocalDateTime.now();
		this.saldoInicial = saldoInicial;
		this.importe = importe;
		this.saldoFinal = saldoInicial + importe;
		this.concepto = concepto;
	}

	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}

	public LocalDateTime getFechaHoraMovimiento() {
		return fechaHoraMovimiento;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public double getImporte() {
		return importe;
	}

	public double getSaldoFinal() {
		return saldoFinal;
	}

	public String getConcepto() {
		return concepto;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %.4f - %.4f - %.4f - %s", this.fechaHoraMovimiento, this.tipoMovimiento,
				this.saldoInicial, this.importe, this.saldoFinal, this.concepto);
	}
}
