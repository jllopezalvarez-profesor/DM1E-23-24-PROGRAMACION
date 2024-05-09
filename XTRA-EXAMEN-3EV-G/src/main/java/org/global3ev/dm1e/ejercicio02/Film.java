package org.global3ev.dm1e.ejercicio02;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Film implements Serializable {
    private final int filmId;
    private final String title;
    private final String description;
    private final int releaseYear;
    private final int length;
    private final String rating;
    private final LocalDateTime lastUpdate;

    public Film(int filmId, String title, String description, int releaseYear,
                int length, String rating, LocalDateTime lastUpdate) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
        this.rating = rating;
        this.lastUpdate = lastUpdate;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getLength() {
        return length;
    }

    public String getRating() {
        return rating;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("filmId=").append(filmId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", releaseYear=").append(releaseYear);
        sb.append(", length=").append(length);
        sb.append(", rating='").append(rating).append('\'');
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }
}
