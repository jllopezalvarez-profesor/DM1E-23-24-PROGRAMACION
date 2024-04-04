package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao;

import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Actor;

import java.util.List;

public class ActorDao {
    private final String connectionString;
    private final String username;
    private final String password;

    public ActorDao(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }

    public List<Actor> getAll(){
        return null;
    }
}
