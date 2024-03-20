package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio08 {

    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USUARIO = "sakilauser";
    private static final String PASS = "pwdsakilauser";
    private static final String QUERY_COMPROBAR_CLIENTE = "select customer_id from customer where customer_id = ?";

    private static final String QUERY_UPDATE_EMAIL = "update customer set email = ? where customer_id = ?";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        System.out.print("Introduce el id del cliente: ");
        int idCliente = Integer.parseInt(scanner.nextLine());

        if (!existeCliente(idCliente)) {
            System.out.printf("No se ha encontrado un cliente con el id %d\n", idCliente);
            return;
        }

        System.out.print("Introduce el nuevo correo electrónico: ");
        String nuevoMail = scanner.nextLine();

        if (!modificarCorreoCliente(idCliente, nuevoMail)) {
            System.out.println("No se ha podido modificar el correo del cliente.");
        } else {
            System.out.println("Correo del cliente modificado con éxito.");
        }


    }

    private static boolean existeCliente(int idCliente) throws SQLException {
        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASS);
             PreparedStatement psComprobarCliente = connection.prepareStatement(QUERY_COMPROBAR_CLIENTE)) {
            psComprobarCliente.setInt(1, idCliente);
            try (ResultSet rsComprobarCliente = psComprobarCliente.executeQuery()) {
                return rsComprobarCliente.isBeforeFirst();
            }
        }
    }

    private static boolean modificarCorreoCliente(int idCliente, String nuevoMail) throws SQLException {
        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASS);
             PreparedStatement psUpdateEmail = connection.prepareStatement(QUERY_UPDATE_EMAIL)) {
            psUpdateEmail.setInt(2, idCliente);
            psUpdateEmail.setString(1, nuevoMail);

            return psUpdateEmail.executeUpdate() > 0;
        }
    }


}
