package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio16;

import net.datafaker.Faker;

import java.io.*;
import java.nio.file.Path;
import java.util.Locale;

public class Programa {
    private static Faker faker = new Faker(new Locale("ES"));
    private static final Path PATH_FICHERO_ALUMNOS = Path.of("ejercicios", "ejercicio16", "fichero-alumnos.dat");

    public static void main(String[] args) {
        Alumno alumno = createAlumnoAleatorio();

        crearDirectorioSiNoExiste(PATH_FICHERO_ALUMNOS);

       // aniadirAlumnoCopiando(alumno, PATH_FICHERO_ALUMNOS);

        alumno = createAlumnoAleatorio();

        System.out.println(alumno);

        aniadirAlumnoConHerenciaDeObjectStream(alumno, PATH_FICHERO_ALUMNOS);

        mostrarAlumnos(PATH_FICHERO_ALUMNOS);

    }

    private static void aniadirAlumnoConHerenciaDeObjectStream(Alumno alumno, Path pathFicheroAlumnos) {
        try (ObjectOutputStream oos = abrirFicheroParaEscribir(pathFicheroAlumnos)) {
            // Escribo el nuevo alumno
            oos.writeObject(alumno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ObjectOutputStream abrirFicheroParaEscribir(Path pathFicheroAlumnos) throws IOException {
        File ficheroAlumnos = pathFicheroAlumnos.toFile();
        if (ficheroAlumnos.exists()){
            return new AppendOnlyObjectOutputStream(new BufferedOutputStream(new FileOutputStream(pathFicheroAlumnos.toFile())));
        } else {
            return  new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(pathFicheroAlumnos.toFile())));
        }
    }


    private static void crearDirectorioSiNoExiste(Path pathFicheroAlumnos) {
        File directorioPadre = pathFicheroAlumnos.toFile().getParentFile();
        if (directorioPadre != null) {
            directorioPadre.mkdirs();
        }
    }

    private static void aniadirAlumnoCopiando(Alumno alumno, Path pathFicheroAlumnos) {

        File ficheroAlumnos = pathFicheroAlumnos.toFile();

        // Crear el nuevo fichero que estará siempre vacío
        File nuevoFicheroAlumnos;
        try {
            nuevoFicheroAlumnos = File.createTempFile("alumnos", null, ficheroAlumnos.getParentFile());
        } catch (IOException e) {
            throw new RuntimeException("No se ha podido crear el fichero temporal", e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nuevoFicheroAlumnos)))) {
            copiarAlumnosExistentes(ficheroAlumnos, oos);
            // Escribo el nuevo alumno
            oos.writeObject(alumno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Borro el original
        ficheroAlumnos.delete();

        // Renombro el nuevo
        nuevoFicheroAlumnos.renameTo(ficheroAlumnos);


    }

    private static void copiarAlumnosExistentes(File ficheroAlumnos, ObjectOutputStream streamAlumnos) {
        if (ficheroAlumnos.exists() && ficheroAlumnos.isFile()) {
            try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(ficheroAlumnos)))) {
                while (true) {
                    Alumno alumno = (Alumno) ois.readObject();
                    streamAlumnos.writeObject(alumno);
                }
            } catch (EOFException e) {
                // Fin de fichero
            } catch (FileNotFoundException e) {
                throw new RuntimeException("No existe el fichero de alumnos o no tenemos acceso a él.", e);
            } catch (IOException e) {
                throw new RuntimeException("Error de entrada / salida al copiar alumnos", e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Se ha encontrado una clase desconocida en el fichero al copiar alumnos", e);
            }
        }
    }

    private static void mostrarAlumnos(Path pathFicheroAlumnos) {
        File ficheroAlumnos = pathFicheroAlumnos.toFile();
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(ficheroAlumnos)))) {
            boolean esFinFichero = false;
            while (!esFinFichero) {
                try {
                    Alumno alumno = (Alumno) ois.readObject();
                    System.out.println(alumno);
                } catch (EOFException e) {
                    // Hemos llegado al final
                    esFinFichero = true;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("No existe el fichero de alumnos o no tenemos acceso a él.", e);
        } catch (IOException e) {
            throw new RuntimeException("Error de entrada / salida", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Se ha encontrado una clase desconocida en el fichero", e);
        }
    }


    private static Alumno createAlumnoAleatorio() {
        return new Alumno(
                faker.idNumber().valid(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.date().birthday(17, 65).toLocalDateTime().toLocalDate()
        );
    }

    private static class AppendOnlyObjectOutputStream extends ObjectOutputStream {

        public AppendOnlyObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        protected AppendOnlyObjectOutputStream() throws IOException, SecurityException {
        }

        @Override
        protected void writeStreamHeader() throws IOException {
        }
    }
}
