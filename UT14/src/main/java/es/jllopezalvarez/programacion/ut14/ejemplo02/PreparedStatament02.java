package es.jllopezalvarez.programacion.ut14.ejemplo02;

import java.sql.*;

public class PreparedStatament02 {
    private static final String CAD_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USER = "sakilauser";
    private static final String PASS = "pwdsakilauser";
    private static final String QUERY_IDIOMAS = "select language_id, name from language where language_id = ?";
    private static final String QUERY_IDIOMAS_2 = "select language_id, name from language where language_id > ? and language_id < ?";


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(CAD_CONEXION, USER, PASS);
             PreparedStatement statementIdiomas = connection.prepareStatement(QUERY_IDIOMAS);
             PreparedStatement statementIdiomas2 = connection.prepareStatement(QUERY_IDIOMAS_2)) {

            statementIdiomas.setInt(1, 3);


            try (ResultSet resultSetIdiomas = statementIdiomas.executeQuery()) {
                while (resultSetIdiomas.next()) {
                    System.out.printf("%d - %s\n",
                            resultSetIdiomas.getInt("language_id"),
                            resultSetIdiomas.getString("name"));
                }
            }

            System.out.println("_".repeat(100));

            statementIdiomas2.setInt(1, 2);
            statementIdiomas2.setInt(2, 5);


            try (ResultSet resultSetIdiomas = statementIdiomas2.executeQuery()) {
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
