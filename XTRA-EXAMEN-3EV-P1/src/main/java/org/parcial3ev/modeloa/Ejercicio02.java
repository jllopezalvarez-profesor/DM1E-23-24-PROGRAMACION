package org.parcial3ev.modeloa;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio02 {

    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";


    private static final String SQL = """
            select rental_id, rental_date, return_date, title
            from rental
                     join sakila.inventory i on rental.inventory_id = i.inventory_id
                     join sakila.film f on i.film_id = f.film_id
            where rental.staff_id = ? order by rental.rental_date desc limit ?
            """;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD);
             PreparedStatement ps = connection.prepareStatement(SQL)) {

            System.out.print("Introduce el número del empleado: ");
            int idEmpleado= Integer.parseInt(scanner.nextLine());
            System.out.print("¿Cuántas filas quieres leer? ");
            int numFilas = Integer.parseInt(scanner.nextLine());

            ps.setInt(1, idEmpleado);
            ps.setInt(2, numFilas);

            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.isBeforeFirst()){
                    System.out.println("No se han encontrado alquileres del empleado");
                } else {
                    while (rs.next()){
                        int idAlquiler = rs.getInt("rental_id");
                        LocalDate fechaAlquler = rs.getTimestamp("rental_date").toLocalDateTime().toLocalDate();
                        Timestamp fechaDevolucion = rs.getTimestamp("return_date");
                        String textoFechaDevolucion = "Pendiente";
                        if (fechaDevolucion != null){
                            textoFechaDevolucion = fechaDevolucion.toLocalDateTime().toLocalDate().toString();
                        }
                        String titulo = rs.getString("title");

                        System.out.printf("%d - %s - %s - %s\n", idAlquiler, fechaAlquler, textoFechaDevolucion, titulo);
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
