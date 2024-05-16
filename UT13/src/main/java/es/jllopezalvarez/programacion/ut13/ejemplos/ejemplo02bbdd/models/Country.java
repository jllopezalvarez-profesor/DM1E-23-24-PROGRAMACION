package es.jllopezalvarez.programacion.ut13.ejemplos.ejemplo02bbdd.models;

import java.time.LocalDateTime;

public class Country {
    private int countryId;
    private String name;
    private LocalDateTime lastUpdate;

    public Country(){

    }

    public Country(int countryId, String name, LocalDateTime lastUpdate) {
        this.countryId = countryId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
