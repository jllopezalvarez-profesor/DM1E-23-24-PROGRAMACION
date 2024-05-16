package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.dataaccess;

import es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.models.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CountryDataAccess {

    private static final String SQL_FIND_BY_ID = "select country_id, country, last_update from country where country_id = ?";
    private static final String SQL_FIND_ALL = "select country_id, country, last_update from country order by country";
    private static final String SQL_DELETE_BY_ID = "delete from country where country_id = ?";
    private static final String SQL_CREATE = "insert into country(country) values (?)";

    public static Optional<Country> findById(int countryId) {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(SQL_FIND_BY_ID)) {
            ps.setInt(1, countryId);
            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.isBeforeFirst()) {
                    return Optional.empty();
                }
                int id = rs.getInt("country_id");
                String name = rs.getString("country");
                LocalDateTime lastUpdate = rs.getTimestamp("country_id").toLocalDateTime();
                return Optional.of(new Country(id, name, lastUpdate));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar un país", e);
        }
    }

    public static List<Country> findAll() {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(SQL_FIND_ALL);
             ResultSet rs = ps.executeQuery()) {
            List<Country> results = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("country_id");
                String name = rs.getString("country");
                LocalDateTime lastUpdate = rs.getTimestamp("last_update").toLocalDateTime();
                results.add(new Country(id, name, lastUpdate));
            }
            return results;
        } catch (
                SQLException e) {
            throw new RuntimeException("Error al recuperar todos los países", e);
        }
    }

    public static void deleteById(int countryId) {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(SQL_DELETE_BY_ID)) {
            ps.setInt(1, countryId);
            int numRows = ps.executeUpdate();
            if (numRows != 1) {
                throw new SQLException(String.format("El número de filas eliminado es distinto de uno. Se eliminaron %d filas", numRows));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar un país", e);
        }
    }


    public static void save(String countryName) {
        try (Connection connection = DataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(SQL_CREATE)) {
            ps.setString(1, countryName);
            int numRows = ps.executeUpdate();
            if (numRows != 1) {
                throw new SQLException(String.format("El número de filas creado es distinto de uno. Se crearon %d filas", numRows));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al crear un país", e);
        }
    }
}
