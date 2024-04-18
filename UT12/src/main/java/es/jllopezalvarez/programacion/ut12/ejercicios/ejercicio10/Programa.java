package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio10;

public class Programa {
    public static void main(String[] args) {
        var media = MediaUtilities.newRandomMedia(10);

        System.out.println(media);
        System.out.println(media.size());
    }
}
