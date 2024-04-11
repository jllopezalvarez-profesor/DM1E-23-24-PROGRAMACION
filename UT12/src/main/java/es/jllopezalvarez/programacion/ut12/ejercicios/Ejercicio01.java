package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ejercicio01 {

    private static final Path PATH_ESCRITORIO = Path.of(System.getProperty("user.home"), "Desktop");

    public static void main(String[] args) {
        // Crear la ubicación como String
        // Si queremos que sea multiplataforma (linux / windows) usar File.separator
        String stringPathEscritorio = System.getProperty("user.home") + File.separator + "Desktop";
        System.out.println(stringPathEscritorio);

        // Crear la ubicación como Path
        Path pathEscritorio = Path.of(System.getProperty("user.home"), "Desktop");
        System.out.println(pathEscritorio);

        // Creo un path para el fichero
        Path pathDirectorio01 = Path.of(pathEscritorio.toString(), "ficheros-de-prueba-borrar");
        // Forma 1: crear el File con el path.toString
        File directorio01 = new File(pathDirectorio01.toString());
        // Forma 2 - Más habitual: usar toFile:
        directorio01 = pathDirectorio01.toFile();
        // Crear el directorio
        // Devuelve false si no se crea el directorio
        if (!directorio01.mkdir()) {
            System.out.printf("No se ha podido crear el directorio %s\n", directorio01);
        }

        // Eliminar el directorio:
        if (!directorio01.delete()) {
            System.out.printf("No se ha podido borrar el directorio %s\n", pathDirectorio01);
        }


        Path pathDirectorio02 = Path.of(pathEscritorio.toString(), "ficheros-de-prueba", "ejercicio01");
        // La siguiente llamada falla porque no existe "ficheros-de-prueba"
        if (!pathDirectorio02.toFile().mkdir()) {
            System.out.printf("No se ha podido crear el directorio %s\n", pathDirectorio02);
        }

        // La siguiente llamada no falla porque no usamos mkdirs, que crea el árbol de directorios
        if (!pathDirectorio02.toFile().mkdirs()) {
            System.out.printf("No se ha podido crear el directorio %s\n", pathDirectorio02);
        }

        Path pathFichero01 = Path.of(pathDirectorio02.toString(), "fichero1.txt");
        File fichero01 = pathFichero01.toFile();
        if (fichero01.exists()) {
            System.out.printf("El fichero %s ya existe\n", pathFichero01);
        } else {
            System.out.printf("Creando fichero %s\n", pathFichero01);
            try {
                fichero01.createNewFile();
            } catch (IOException e) {
                System.out.printf("Error al crear el fichero: %s\n", e.getMessage());
            }
        }

        // Aunque llamemos a esto cuando el fichero ya se ha creado, no falla
        // createNewfile solo crea el fichero si no existe previamente.
        try {
            fichero01.createNewFile();
        } catch (IOException e) {
            System.out.printf("Error al crear el fichero: %s\n", e.getMessage());
        }


        Path pathFichero02 = Path.of(pathDirectorio02.toString(), "fichero-para-borrar.txt");
        File fichero02 = pathFichero02.toFile();
        if (fichero02.exists()) {
            System.out.printf("El fichero %s ya existe\n", pathFichero02);
        } else {
            System.out.printf("Creando fichero %s\n", pathFichero02);
            try {
                fichero02.createNewFile();
            } catch (IOException e) {
                System.out.printf("Error al crear el fichero: %s\n", e.getMessage());
            }
        }

        // Borrar fichero 02
        if (!fichero02.delete()) {
            System.out.printf("No se ha podido borrar el fichero %s\n", pathFichero02);
        }

        // esto no borra porque el directorio no está vacío
        if (!pathDirectorio02.toFile().delete()) {
            System.out.printf("No se ha podido borrar el directorio %s\n", pathDirectorio02);
        }

        // Pendiente de borrado con método recursivo.



    }

}
