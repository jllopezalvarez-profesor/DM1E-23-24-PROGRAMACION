package es.jllopezalvarez.programacion.ut09.ejemplos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Ejemplo06FinallyScanner {
	public static void main(String[] args) throws SQLException {

		pruebaTryCatchScanner();
		metodoConBucleYFinally();
		pruebaTryWithResourcesScanner();

	}

	private static void pruebaTryWithResourcesScanner() throws SQLException {

		try (Scanner sc = new Scanner(System.in);
				Connection connection = DriverManager.getConnection("");
				PreparedStatement s = connection.prepareStatement("")) {
			int n = sc.nextInt();
			System.out.println(n);
			System.out.println("Saliendo de try");

		} 
		
		
		
		
	}

	private static void pruebaTryCatchScanner() {
		Scanner sc = null;

		try {
			///

			sc = new Scanner(System.in);

			int n = sc.nextInt();
			System.out.println(n);
			System.out.println("Saliendo de try");

		} catch (Exception e) {
			System.out.println("Se ha producido una excepción");
			e.printStackTrace();
			System.out.println("Saliendo de catch");
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Saliendo de finally");
		}
	}

	private static void metodoConBucleYFinally() {

		for (int i = 0; i < 10; i++) {
			try {
				if (i == 7) {
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				System.err.println("En finally");
			}

		}

	}

}
