package es.jllopezalvarez.programacion.ut12.ejemplos.ejemplo08serializacion;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;

public class Programa {

    private static final Path PATH_FICHERO_PERSONAS = Path.of("ejemplos", "ejemplo08", "personas.dat");

    public static void main(String[] args) throws IOException {
        Persona persona = new Persona(
                2313,
                "José Luis",
                "López Álvarez",
                LocalDate.of(1972, 8, 13));

        // Asegurarme de que existe el directorio
        File ficheroPersonas = PATH_FICHERO_PERSONAS.toFile();
        ficheroPersonas.getParentFile().mkdirs();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroPersonas))) {
            oos.writeObject(persona);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheroPersonas))) {
            Persona personaLeida = (Persona) ois.readObject();
            System.out.println("He leido a la persona: " + personaLeida.getNombre());
            System.out.printf("Fecha de nacimiento de la persona: %s\n", personaLeida.getFechaNacimiento());
        } catch (ClassNotFoundException e) {
            System.err.println("Se ha encontrado un objeto de una clase desconocida.");
            throw new RuntimeException(e);
        }
    }

}
