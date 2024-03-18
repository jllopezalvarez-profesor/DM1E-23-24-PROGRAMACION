package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.*;

public class Ejercicio02 {
    private static final String CAD_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USER = "sakilauser";
    private static final String PASS = "pwdsakilauser";

    private static final String QUERY = """
            select title,
                   release_year,
                   l.name as language,
                   ol.name as original_language,
                   original_language_id,
                   rating,
                   description
            from film
            inner join sakila.language l on film.language_id = l.language_id
            left join sakila.language ol on film.original_language_id = ol.language_id
            order by title
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
                        String language = resultSet.getString("language");
                        String originalLanguage= resultSet.getString("original_language");
                        String rating = resultSet.getString("rating");
                        String description = resultSet.getString("description");

                        if (originalLanguage == null){
                            originalLanguage = "Desconocido";
                        }

                        System.out.printf("%s - %d - %s - %s - %s\n%s\n", title, year, language, originalLanguage, rating, description);
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
