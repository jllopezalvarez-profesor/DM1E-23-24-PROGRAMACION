package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.*;
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
            System.out.println("Introduce el nombre de la nueva ciudad");
            String nuevaCiudad = scanner.nextLine();

            // Comprobar si existe la ciudad
            if (existeCiudad(nuevaCiudad, connection)) {
                System.out.println("Ya existe una ciudad con el nombre especificado");
                return;
            }

            // Preguntar país
            System.out.println("Introduce el nombre del país de la nueva ciudad");
            String nombrePais = scanner.nextLine();

            // Comprobar si existe país
            if (!existePais(nombrePais, connection)) {
                // Crear el país
                System.out.println("Tengo que crear país");
            } else {
                System.out.println("Ya existe");
            }

            // recuperar ID del país


            // Crear ciudad con el ID del país (ya existente o el creado nuevo)
            // INSERT (en tabla city)

        }


    }

    private static boolean existePais(String nombrePais, Connection connection) throws SQLException {
        try(PreparedStatement ps = connection.prepareStatement(SQL_CHECK_COUNTRY)){
            ps.setString(1, nombrePais);
            try(ResultSet resultSet = ps.executeQuery()){
                return resultSet.isBeforeFirst();
            }
        }
    }

    private static boolean existeCiudad(String nombreCiudad, Connection connection) throws SQLException {
        try(PreparedStatement ps = connection.prepareStatement(SQL_CHECK_CITY)){
            ps.setString(1, nombreCiudad);
            try(ResultSet resultSet = ps.executeQuery()){
                return resultSet.isBeforeFirst();
            }
        }
    }
}
