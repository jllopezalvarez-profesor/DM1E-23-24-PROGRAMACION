package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.dataaccess;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    private static HikariDataSource connectionPoolDataSource;

    static {
        configureDatasource();
    }

    private static void configureDatasource() {
        HikariConfig hikariConfig = new HikariConfig("/datasource.properties");
        connectionPoolDataSource = new HikariDataSource(hikariConfig);
    }

    private DataSource() {
    }

    public static Connection getConnection() throws SQLException {
        return connectionPoolDataSource.getConnection();
    }
}
