package es.jllopezalvarez.programacion.ut14.ejemplos.ejemplo01;

import java.sql.*;
import java.time.LocalDateTime;

public class PrimeraConexionConGetString {
    // URL de conexión: "jdbc:tipo_de_servidor://maquina[:puerto]/base_de_datos
    private static final String CADENA_CONEXION = "jdbc:mariadb://localhost/sakila";
    private static final String USUARIO = "root";
    public static final String PASSWORD = "password";

    private static final String SQL_QUERY_01 = "select country_id, country, last_update from country";

    public static void main(String[] args) throws SQLException {
        System.out.printf("Son las %s y este es el primer programa en IntelliJ Idea", LocalDateTime.now());

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
                // Accedemos a las columnas usando siempre getString, que no suele fallar
                // Usamos el índice de las columnas (en este caso la primera es la 1, no la 0)
                String countryId = resultados.getString(1);
                String countryName = resultados.getString(2);
                String lastUpdate = resultados.getString(3);
                System.out.printf("%s - %s - %s\n", countryId, countryName, lastUpdate);
                System.out.println("-".repeat(100));
            }



        }

        System.out.println("Fin del programa");


    }

}
