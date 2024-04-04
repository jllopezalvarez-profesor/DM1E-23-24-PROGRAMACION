package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala;

import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.ActorDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.ActorInFilmDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.dao.FilmDao;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Actor;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.ActorInFilm;
import es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities.Film;

import java.util.*;

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

        var report = createFilmActorReport(films, actores, actorsInFilms);
        System.out.printf("En el mapa hay %d entradas\n", report.size());

        for (Map.Entry<Film, Set<Actor>> filmSetEntry : report.entrySet()) {
            Film key = filmSetEntry.getKey();
            Set<Actor> value = filmSetEntry.getValue();
            System.out.println(key.getTitle());
            value.forEach(a -> System.out.printf("%s %s, ", a.getFirstName(), a.getLastName()));
            System.out.println();
        }

    }

    private static Map<Film, Set<Actor>> createFilmActorReport(List<Film> films,
                                                               List<Actor> actors,
                                                               List<ActorInFilm> actorsInFilms) {
        Map<Film, Set<Actor>> report = new HashMap<>();

        for (Film film: films) {
            Set <Actor> actorSet = createActorsSet(film.getFilmId(), actors, actorsInFilms);
            report.put(film, actorSet);
        }

        return  report;
    }

    private static Set<Actor> createActorsSet(int filmId, List<Actor> actors, List<ActorInFilm> actorsInFilms) {
        Set<Actor> results = new TreeSet<>(Comparator.comparing(Actor::getFirstName).thenComparing(Actor::getLastName));

        for (ActorInFilm actorInFilm: actorsInFilms) {
            if (actorInFilm.getFilmId() == filmId){
                results.add(findActor(actorInFilm.getActorId(), actors));
            }

        }

        return results;
    }

    private static Actor findActor(int actorId, List<Actor> actors) {
        int position = actors.indexOf(new Actor(actorId));
        if (position >= 0){
            return actors.get(position);
        }
        throw new RuntimeException("No se ha encontrado el actor");
    }
}
