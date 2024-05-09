package org.global3ev.dm1e.ejercicio02;

import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    private static final String SQL_FILMS = "select film_id, title, description, release_year, length, rating, last_update from film";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, IOException {
        System.out.println("Path del fichero de exportación:");
        String pathFichero = scanner.nextLine();

        File fichero = new File(pathFichero);
        if (fichero.exists()) {
            System.out.printf("Ya existe el fichero %s\n", pathFichero);
            return;
        }

        List<Film> datosPeliculas = leerPeliculasBD();

//        datosPeliculas.forEach(System.out::println);

        int cuantasGuardadas = guardarDatosPeliculas(datosPeliculas, fichero);
        System.out.printf("Se han guardado %d registros", cuantasGuardadas);


        verificarFichero(fichero);
    }

    private static void verificarFichero(File fichero) throws FileNotFoundException {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fichero))) {

            while (true) {
                Film film = (Film) stream.readObject();
                System.out.println(film);
            }

        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static int guardarDatosPeliculas(List<Film> datosPeliculas, File fichero) throws IOException {
        try (ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fichero)))) {
            for (Film film : datosPeliculas) {
                stream.writeObject(film);
            }
        }
        return datosPeliculas.size();
    }

    private static List<Film> leerPeliculasBD() throws SQLException {
        List<Film> films = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD);
             PreparedStatement ps = connection.prepareStatement(SQL_FILMS);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {


                int filmId = rs.getInt("film_id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                int releaseYear = rs.getInt("release_year");
                int length = rs.getInt("length");
                String rating = rs.getString("rating");
                LocalDateTime lastUpdate = rs.getTimestamp("last_update").toLocalDateTime();

                films.add(new Film(filmId, title, description, releaseYear, length, rating, lastUpdate));
            }
        }
        return films;
    }

}
