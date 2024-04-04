package es.jllopezalvarez.programacion.ut14.ejercicios.ejerciciofinala.entities;

import java.util.Objects;

public class ActorInFilm implements Comparable<ActorInFilm>{
    private final int actorId;
    private final int filmId;

    public ActorInFilm(int actorId, int filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public int getActorId() {
        return actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorInFilm that = (ActorInFilm) o;
        return actorId == that.actorId && filmId == that.filmId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, filmId);
    }

    @Override
    public int compareTo(ActorInFilm other) {
        // Ordeno primero por actorId.
        // Si dos objetos tienen el mismo actorId, ordeno por filmId
        int result = Integer.compare(this.actorId, other.actorId);
        if (result == 0){
            result = Integer.compare(this.filmId, other.filmId);
        }
        return result;
    }
}
