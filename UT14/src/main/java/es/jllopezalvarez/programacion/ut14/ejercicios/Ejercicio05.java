package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio05 {
    // El puerto 3306 es opcional porque es el puerto por defecto de MariaDB y MySQL
    private static final String CAD_CONEXION = "jdbc:mariadb://localhost:3306/sakila";
    private static final String USER = "sakilauser";
    private static final String PASS = "pwdsakilauser";

    private static final String UPDATE = """
            update language
            set name = left(name, length(name)-1)
            where name like '%X'
            """;


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(CAD_CONEXION, USER, PASS);
             Statement statement = connection.createStatement()) {

            int numFilasAfectadas = statement.executeUpdate(UPDATE);
            System.out.printf("Se han modificado %d filas\n", numFilasAfectadas);

        } catch (SQLException e) {
            System.out.printf("Error al conectar o ejecutar sentencia: %s\n", e.getMessage());
        }


    }
}
