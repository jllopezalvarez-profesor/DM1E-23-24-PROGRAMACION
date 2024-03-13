package es.jllopezalvarez.programacion.ut14.ejemplos.ejemplo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class PrimeraConexion {
    // URL de conexión: "jdbc:tipo_de_servidor://maquina[:puerto]/base_de_datos
    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USUARIO = "root";
    public static final String PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        System.out.printf("Son las %s y este es el primer programa en IntelliJ Idea", LocalDateTime.now());

        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD)) {


        }


        System.out.println("Fin del programa");




    }

}
