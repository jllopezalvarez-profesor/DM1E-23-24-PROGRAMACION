package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio10;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MediaUtilities {

    private static Faker faker = new Faker();

    private static int currentId = 1;

    private MediaUtilities() {
    }

    public static Media newRandomMedia(){
        return new Media(
                currentId++,
                faker.oscarMovie().movieName(),
                faker.name().fullName(),
                faker.company().name(),
                faker.date().past(365*20, 365, TimeUnit.DAYS).toLocalDateTime().toLocalDate(),
                TipoMedio.values()[faker.random().nextInt(TipoMedio.values().length)]
        );

    }

    public static List<Media> newRandomMedia(int count){
        List<Media> media = new ArrayList<>();
        while (count-- > 0){
            media.add(newRandomMedia());
        }
        return media;
    }

}
