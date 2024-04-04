package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala;

import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.ActorDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.ActorInFilmDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.FilmDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Actor;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.ActorInFilm;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Film;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FilmActorReport {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    public static void main(String[] args) {
        ActorDao actorDao = new ActorDao(CONNECTION_STRING, USR, PWD);
        FilmDao filmDao = new FilmDao(CONNECTION_STRING, USR, PWD);
        ActorInFilmDao actorInFilmDao = new ActorInFilmDao(CONNECTION_STRING, USR, PWD);

        List<Actor> actores = actorDao.getAll();
        System.out.printf("Se han leído %d actores\n", actores.size());
        List<Film> films = filmDao.getAll();
        System.out.printf("Se han leído %d películas\n", films.size());
        List<ActorInFilm> actorsInFilms = actorInFilmDao.getAll();
        System.out.printf("Se han leído %d actores en películas\n", actorsInFilms.size());


    }

    private static Map<Film, Set<Actor>> createFilmActorReport(List<Film> films,
                                                               List<Actor> actors,
                                                               List<ActorInFilm> actorsInFilms) {
        Map<Film, Set<Actor>> mapa = new HashMap<>();

        

        return  mapa;
    }
}
