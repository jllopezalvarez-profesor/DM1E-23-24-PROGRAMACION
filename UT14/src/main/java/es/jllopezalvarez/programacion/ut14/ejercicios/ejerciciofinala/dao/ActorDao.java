package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao;

import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Actor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActorDao {
    private static final String SQL_GET_ALL = "select actor_id, first_name, last_name from actor";
    private final String connectionString;
    private final String username;
    private final String password;

    public ActorDao(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public List<Actor> getAll(){
        List<Actor> actors = new ArrayList<>();

        // 1.- Abrir conexión
        // 2.- Crear prepared statement
        // 3.- Obtener datos en Resultset
        // 4.- Recorrer resultset y usar los datos para crear objetos

        try(Connection connection = DriverManager.getConnection(this.connectionString, this.username, this.password);
            PreparedStatement ps = connection.prepareStatement(SQL_GET_ALL);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                int actorId = rs.getInt("actor_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                actors.add(new Actor(actorId, firstName, lastName));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener los actores", e);
        }


        return actors;
    }

    
}
