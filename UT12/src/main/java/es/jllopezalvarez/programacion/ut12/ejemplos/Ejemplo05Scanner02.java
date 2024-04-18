package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejemplo05Scanner02 {

    // Tenemos un String que queremos procesar (tokenizar)
    private static String TEXTO = "adipisicing elit. Itaque nostrum perferendis nisi aliquid ratione similique, pariatur voluptates, facere repudiandae debitis repellendus recusandae officia enim reprehenderit odit provident ipsum unde laboriosam.";

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileReader(Path.of("ejercicios", "03", "parrafo.txt").toFile()))) {
//            scanner.useDelimiter("[.,]");
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }


        }

        try (Scanner scanner = new Scanner(new FileReader(Path.of("ejercicios", "03", "parrafo.txt").toFile()))) {
//            scanner.useDelimiter("[.,]");
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }



        }
    }

}
