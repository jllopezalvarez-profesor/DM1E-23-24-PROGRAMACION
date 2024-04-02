package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio09 {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    private static final String SQL_CHECK_CITY = "select city_id, city from city where city = ?";
    private static final String SQL_CHECK_CITY_ALT = "select count(1) as num_cities from city where city = ?";
    private static final String SQL_CHECK_COUNTRY = "select country_id, country from country where country = ?";
    private static final String DML_CREATE_COUNTRY="insert into country(country) values (?)";
    private static final String DML_CREATE_CITY = "insert into city(city, country_id) values (?, ?)";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        // Abrir conexión
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD)) {
            // Preguntar ciudad
            // Scanner

            // Comprobar si existe la ciudad
            // SELECT - resultset (count / registro de la ciudad)
            if (){
                System.out.println("Ya existe una ciudad con el nombre especificado");
                return;
            }

            // Preguntar país
            // Scanner

            // Comprobar si existe país
            // SELECT - resultet (resgistro del país)

            // Si existe país quedarme con su ID
            // Acceder al resultset y quedarme con country_id

            // Si no existe país, crear país y recuperar su ID
            // INSERT (crear el país)
            // SELECT (recuperar el id del país creado)

            // Crear ciudad con el ID del país (ya existente o el creado nuevo)
            // INSERT (en tabla city)

        }


    }
}
