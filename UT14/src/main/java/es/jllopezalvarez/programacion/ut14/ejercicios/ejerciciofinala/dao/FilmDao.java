package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao;

import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Actor;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmDao {
    private static final String SQL_GET_ALL = "select film_id, title, description, release_year, length, rating from film";
    private final String connectionString;
    private final String username;
    private final String password;

    public FilmDao(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public List<Film> getAll(){
        List<Film> films = new ArrayList<>();

        // 1.- Abrir conexión
        // 2.- Crear prepared statement
        // 3.- Obtener datos en Resultset
        // 4.- Recorrer resultset y usar los datos para crear objetos

        try(Connection connection = DriverManager.getConnection(this.connectionString, this.username, this.password);
            PreparedStatement ps = connection.prepareStatement(SQL_GET_ALL);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                int filmId = rs.getInt("film_id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                int releaseYear = rs.getInt("release_year");
                int length = rs.getInt("length");
                String rating = rs.getString("rating");
                films.add(new Film(filmId, title, description, releaseYear, length, rating));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener las películas", e);
        }


        return films;
    }

    
}
