package es.jllopezalvarez.programacion.ut14.ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio10 {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";
    private static final String SQL_CHECK_PAIS = "select count(1) num_encontrados from country where country = ?";
    private static final String SQL_SELECT_PAISES = "select * from country";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD)) {
            String nombreNuevoPais = pedirNombrePais();

            if (existePais(nombreNuevoPais, connection)) {
                System.out.printf("El país %s ya existe en la base de datos\n", nombreNuevoPais);
                return;
            }

            crearPais(nombreNuevoPais, connection);


        } catch (SQLException e) {
            throw new RuntimeException("Error al abrir la conexión", e);
        }
    }

    private static void crearPais(String nombreNuevoPais, Connection connection) {
        try (PreparedStatement ps = connection.prepareStatement(SQL_SELECT_PAISES, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.printf("Avanzo al registro en posición %d\n", rs.getRow());
            }

            rs.previous();

            rs.beforeFirst();

            while (rs.next()) {
                System.out.printf("Avanzo (2ª vez) al registro en posición %d\n", rs.getRow());
            }

            rs.moveToInsertRow();
            rs.updateString("country", nombreNuevoPais);
            rs.insertRow();
        } catch (SQLException e) {
            throw new RuntimeException("Error al crear país", e);
        }
    }

    private static boolean existePais(String nombreNuevoPais, Connection connection) {
        try (PreparedStatement ps = connection.prepareStatement(SQL_CHECK_PAIS)) {
            ps.setString(1, nombreNuevoPais);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                return rs.getInt("num_encontrados") > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al comprobar si existe el país", e);
        }
    }

    private static String pedirNombrePais() {
        System.out.println("Introduce el nombre del país");
        String pais = scanner.nextLine();
        while (pais == null || pais.isBlank()) {
            System.out.println("El nombre del país no puede estar vacío. Vuelve a intentarlo.");
            pais = scanner.nextLine();
        }
        return pais;
    }
}
