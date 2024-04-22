package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio10;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    private static final Path PATH_FICHERO_OBJETOS = Path.of("ejercicios", "10", "fichero-objetos.txt");
    private static final Path PATH_FICHERO_INFORME = Path.of("ejercicios", "10", "fichero-informe.txt");

    public static void main(String[] args) throws IOException {
        var media = MediaUtilities.newRandomMedia(10);

//        media.forEach(System.out::println);

        escribirListaEnFichero(media, PATH_FICHERO_OBJETOS);

        List<Media> mediaLeida = leerMediaDeFichero(PATH_FICHERO_OBJETOS);

        mediaLeida.forEach(System.out::println);

        generarInforme(mediaLeida, PATH_FICHERO_INFORME);


//        System.out.println(media.size());



//        System.out.printf("%f\n", 123.45);
//        System.out.printf(new Locale("ES"), "%f\n", 123.45);
//        System.out.printf(new Locale("US"), "%f\n", 123.45);
//        System.out.printf(new Locale("UK"), "%f\n", 123.45);
//        System.out.printf(new Locale("ES"), "%s\n", LocalDate.now());
//        System.out.printf(new Locale("US"), "%s\n", LocalDate.now());













        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.printf("Fecha con formato: %s\n", formatter.format(LocalDate.now()));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern( "dd/MM/yyyy");
        System.out.printf("Fecha con formato en español corto: %s\n", formatter1.format(LocalDate.now()));

    }

    private static void generarInforme(List<Media> mediaList, Path filePath) throws IOException {
        filePath.toFile().getParentFile().mkdirs();





        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath.toFile()))) {


            Locale locale = new Locale("ES");
            writer.printf(locale, "%2s %-30s %-15.15s %-50.50s %9s %s\n","ID", "Título", "Actor", "Productor", "Fecha", "tipo");

            for (Media media: mediaList) {
                writer.printf(locale, "%2d %-30s %-15.15s %-50.50s %s %s\n",
                        media.getId(),
                        media.getTitulo(),
                        media.getArtistaPrincipal(),
                        media.getProductora(),
                        media.getFechaPublicacion(),
                        media.getTipo());
            }
        }
    }

    private static List<Media> leerMediaDeFichero(Path pathFicheroObjetos) throws FileNotFoundException {
        List<Media> media = new ArrayList<>();

        try (Scanner sc = new Scanner(pathFicheroObjetos.toFile())) {
            sc.useDelimiter("\\||\n");
            sc.useLocale(Locale.US);

            while (sc.hasNext()){
                int id = sc.nextInt();
                String title = sc.next();
                String actor = sc.next();
                String productora = sc.next();
                String fecha = sc.next();
                String tipo = sc.next();
                Media mediaItem = new Media(id, title, actor, productora,
                        LocalDate.parse( fecha), TipoMedio.valueOf(tipo));
                media.add(mediaItem);
            }

        }


        return media;
    }

    private static void escribirListaEnFichero(List<Media> mediaList, Path filePath) throws IOException {
        // Asegurarme de que existe el directorio donde voy a escribir el fichero
        // Ojo, que esto puede fallar si usamos un path que no tiene directorios.
        filePath.toFile().getParentFile().mkdirs();

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath.toFile()))) {
            for (Media media: mediaList) {
                writer.printf(Locale.US, "%d|%s|%s|%s|%s|%s\n",
                        media.getId(),
                        media.getTitulo(),
                        media.getArtistaPrincipal(),
                        media.getProductora(),
                        media.getFechaPublicacion(),
                        media.getTipo());
            }
        }
    }
}
