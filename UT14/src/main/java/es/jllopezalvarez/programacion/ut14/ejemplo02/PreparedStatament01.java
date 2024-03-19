package es.jllopezalvarez.programacion.ut14.ejemplo02;

import java.sql.*;

public class PreparedStatament01 {
    private static final String CAD_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USER = "sakilauser";
    private static final String PASS = "pwdsakilauser";
    private static final String QUERY_IDIOMAS = "select * from language where language_id > ?";
    private static final String QUERY_PELICULAS = "select * from film where language_id = ?";


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(CAD_CONEXION, USER, PASS);
             PreparedStatement statementIdiomas = connection.prepareStatement(QUERY_IDIOMAS);
             PreparedStatement statementPeliculas = connection.prepareStatement(QUERY_PELICULAS)) {

            statementIdiomas.setInt(1, 3);
            statementPeliculas.setInt(1, 100);
            try (ResultSet resultSetIdiomas = statementIdiomas.executeQuery();
                 ResultSet resultSetPeliculas = statementPeliculas.executeQuery();) {
                while (resultSetIdiomas.next()) {
                    System.out.printf("%d - %s\n",
                            resultSetIdiomas.getInt("language_id"),
                            resultSetIdiomas.getString("name"));
                }
            }
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

    }



}
