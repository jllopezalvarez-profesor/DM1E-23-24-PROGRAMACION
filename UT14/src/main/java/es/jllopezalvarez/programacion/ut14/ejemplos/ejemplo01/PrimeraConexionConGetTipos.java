package es.jllopezalvarez.programacion.ut14.ejemplos.ejemplo01;

import java.sql.*;
import java.time.LocalDateTime;

public class PrimeraConexionConGetTipos {
    // URL de conexión: "jdbc:tipo_de_servidor://maquina[:puerto]/base_de_datos
    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USUARIO = "sakilauser";
    public static final String PASSWORD = "pwdsakilauser";

    private static final String SQL_QUERY_01 = "select country, last_update, country_id from country";

    public static void main(String[] args) throws SQLException {
        System.out.printf("Son las %s y este es el primer programa en IntelliJ Idea\n", LocalDateTime.now());

        try (Connection connection = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultados = statement.executeQuery(SQL_QUERY_01)) {
            System.out.printf("El tipo dinámico de la conexión es %s\n", connection.getClass().getName());
            System.out.printf("El tipo dinámico de la statement es %s\n", statement.getClass().getName());
            System.out.printf("El tipo dinámico del resultset es %s\n", resultados.getClass().getName());

//            if (resultados.isBeforeFirst()){
//                System.out.println("No se han encontrado resultados");
//            }

//            int numFila = 1;
            while(resultados.next()){
//                System.out.printf("En registro %d\n", numFila++);
                int countryId = resultados.getInt("country_id");
                String countryName = resultados.getString("country");
                Timestamp lastUpdate = resultados.getTimestamp("last_update");
                System.out.printf("%d - %s - %s\n", countryId, countryName, lastUpdate);
                System.out.println("-".repeat(100));
            }



        }

        System.out.println("Fin del programa");


    }

}
