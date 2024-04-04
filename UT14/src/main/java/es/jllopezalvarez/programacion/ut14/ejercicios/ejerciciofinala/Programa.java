package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala;

import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.ActorDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Actor;

import java.util.List;

public class Programa {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    public static void main(String[] args) {
        ActorDao actorDao = new ActorDao(CONNECTION_STRING, USR, PWD);

        List<Actor> actores = actorDao.getAll();

        System.out.printf("Se han leído %d actores\n", actores.size());
    }
}
