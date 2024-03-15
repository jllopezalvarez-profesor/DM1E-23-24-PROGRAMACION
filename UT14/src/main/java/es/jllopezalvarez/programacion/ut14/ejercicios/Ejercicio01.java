package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.*;

public class Ejercicio01 {
    private static final String CAD_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USER = "root";
    private static final String PASS = "password";

    private static final String QUERY = """
            select title,
                   release_year,
                   language_id,
                   original_language_id,
                   rating,
                   description
            from film
            order by title;
            """;


    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(CAD_CONEXION, USER, PASS)){
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(QUERY)) {

                    while(resultSet.next()){
                        // Evitar usar índice de columna:
                        //String title =  resultSet.getString(1);
                        String title =  resultSet.getString("title");
                        int year = resultSet.getInt("release_year");
                        int languageId = resultSet.getInt("language_id");
                        int originalLanguageId = resultSet.getInt("original_language_id");
                        String rating = resultSet.getString("rating");
                        String description = resultSet.getString("description");

                        System.out.printf("%s - %d - %d - %d - %s\n%s\n", title, year, languageId, originalLanguageId, rating, description);
                        System.out.println("_".repeat(100));
                    }




                }catch (SQLException e) {
                    System.out.printf("Error al ejecutar sentencia: %s\n", e.getMessage());
                }


            }catch (SQLException e) {
                System.out.printf("Error al crear sentencia: %s\n", e.getMessage());
            }

        } catch (SQLException e) {
            System.out.printf("Error al conectar: %s\n", e.getMessage());
        }


    }
}
