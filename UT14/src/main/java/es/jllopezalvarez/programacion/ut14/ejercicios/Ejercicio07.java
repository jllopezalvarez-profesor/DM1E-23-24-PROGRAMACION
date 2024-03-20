package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio07 {

    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USER = "sakilauser";
    private static final String PASS = "pwdsakilauser";
    private static final String QUERY_CLIENTE = """
            select first_name, last_name, email, active,
                   a.address, a.address2, a.district, a.postal_code, a.phone,
                   c2.city, c3.country
            from customer c
                     inner join sakila.address a on c.address_id = a.address_id
                     inner join sakila.city c2 on a.city_id = c2.city_id
                     inner join sakila.country c3 on c2.country_id = c3.country_id
            where customer_id = ?;
            """;

    private static final String QUERY_ALQUILERES = """
            select rental_date, return_date, f.title
            from rental r
                     inner join sakila.inventory i on r.inventory_id = i.inventory_id
                     inner join sakila.film f on i.film_id = f.film_id
            where r.customer_id = ?
            order by rental_date desc;
            """;
    private static final String QUERY_ALQUILERES_CON_NVL = """
            select rental_date, nvl(return_date, 'Pendiente') return_date, f.title
            from rental r
                     inner join sakila.inventory i on r.inventory_id = i.inventory_id
                     inner join sakila.film f on i.film_id = f.film_id
            where r.customer_id = ?
            order by rental_date desc;
            """;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el id del cliente: ");
        int idCliente = Integer.parseInt(sc.nextLine());

        // 1.- Obtener conexión. Hay que poner el catch porque lanza checked exception
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASS)) {


            // 2.- Preparar sentencia SQL. Recibe la query con las interrogaciones
            try (PreparedStatement ps = connection.prepareStatement(QUERY_CLIENTE)) {
                // 3.- Parametrizar sentencia (cambiar las ? por valores)
                ps.setInt(1, idCliente);

                // 4.- Obtener resultados
                try (ResultSet datos = ps.executeQuery()) {
                    // 5.- Recorrer resultados
                    // 5.1.- Mirar si hay resultados. next() devuelve true si hay datos.
                    if (!datos.next()) {
                        System.out.printf("No se ha encontrado el cliente con id %d \n", idCliente);
                    } else {
                        // 5.2. - Mostrar datos
                        System.out.printf("Nombre: %s %s\n", datos.getString("first_name"), datos.getString("last_name"));
                    }
                    // 5.1.B Otra forma de ver si hay datos
//                    if (datos.isBeforeFirst()){
//                        // True si hay datos.isBeforeFirst
//                    }
                }

            }

            try (PreparedStatement ps = connection.prepareStatement(QUERY_ALQUILERES)) {
                ps.setInt(1, idCliente);
                ResultSet resultSet = ps.executeQuery();

                // Comprobar si hay filas
                if (!resultSet.isBeforeFirst()) {
                    // No hay filas
                    System.out.println("El cliente no tiene alquileres");
                } else {
                    while(resultSet.next()){
                        LocalDate fechaAlquiler = resultSet.getTimestamp("rental_date").toLocalDateTime().toLocalDate();
                        Timestamp fechaDevolucion = resultSet.getTimestamp("return_date");
                        // String fechaDevolucion = resultSet.getString("return_date");
                        String tituloPelicula = resultSet.getString("title");

                        String fechaDevolucionStr = fechaDevolucion == null ? "Pendiente" : fechaDevolucion.toLocalDateTime().toLocalDate().toString();

                        System.out.printf("%10.10s %-10.10s %s \n", fechaAlquiler, fechaDevolucionStr, tituloPelicula);

                    }

                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Fin del programa");

    }
}
