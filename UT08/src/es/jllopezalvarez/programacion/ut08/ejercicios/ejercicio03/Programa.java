package es.jllopezalvarez.programacion.ut08.ejercicios.ejercicio03;

import java.time.LocalDate;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("12345678A", "José Luis", "López Álvarez", LocalDate.parse("1972-08-13"),
				"jllopezalvarez@educa.madrid.org");

		CuentaBancaria cuenta1 = new CuentaBancaria(cliente);

		CuentaBancaria cuenta2 = new CuentaBancaria(cliente, 1000);

		CuentaBancaria cuenta3 = new CuentaBancaria(cliente);

		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);

		System.out.println("-".repeat(100));

		System.out.printf("Saldo de la cuenta 1: %.2f\n", cuenta1.getSaldo());
		System.out.println("Ingreso 350,56");
		cuenta1.ingresar(350.56, "Ingreso A");
		System.out.printf("Saldo de la cuenta 1: %.2f\n", cuenta1.getSaldo());
		System.out.println("Retiro 120,88");
		cuenta1.reembolsar(120.88, "Retirada A");
		System.out.printf("Saldo de la cuenta 1: %.2f\n", cuenta1.getSaldo());
		System.out.println("Ingreso 1120,22");
		cuenta1.ingresar(1120.22, "Ingreso B");
		System.out.printf("Saldo de la cuenta 1: %.2f\n", cuenta1.getSaldo());
		List<Movimiento> movimientos = cuenta1.getMovimientos();
		movimientos.forEach(System.out::println);
//		movimientos.clear();
		System.out.printf("Saldo de la cuenta 1: %.2f\n", cuenta1.getSaldo());
		

	}

}
