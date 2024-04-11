package org.parcial3ev.modelob.modeloa;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio01 {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    private static final String SQL_ALQUILERES = """
            select rental_id, rental_date, return_date, title
            from rental
                     inner join sakila.inventory i on rental.inventory_id = i.inventory_id
                     inner join sakila.film f on i.film_id = f.film_id
            where rental.staff_id = ?
            order by rental.rental_date desc
            limit ?
            """;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD);
             PreparedStatement ps = connection.prepareStatement(SQL_ALQUILERES)) {

            System.out.println("Informe de últimos alquileres de empleado");
            System.out.print("Introduce el número del empleado: ");
            int idEmpleado = Integer.parseInt(scanner.nextLine());
            System.out.print("¿Cuántas filas quieres leer? ");
            int numFilas = Integer.parseInt(scanner.nextLine());

            ps.setInt(1, idEmpleado);
            ps.setInt(2, numFilas);
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.isBeforeFirst()) {
                    System.out.println("No se han encontrado alquileres del empleado");
                } else {
                    while (rs.next()) {
                        int rentalId = rs.getInt("rental_id");
                        LocalDate rentalDate = rs.getTimestamp("rental_date").toLocalDateTime().toLocalDate();
                        Timestamp returnDate = rs.getTimestamp("return_date");
                        String title = rs.getString("title");
                        String returnDateString = "Pendiente";
                        if (returnDate != null){
                            returnDateString = returnDate.toLocalDateTime().toLocalDate().toString();
                        }
                        System.out.printf("%s - %s - %s -%s\n", rentalId, rentalDate, returnDateString, title);
                    }
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}


