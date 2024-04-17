package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.util.Scanner;

public class Ejemplo04Scanner01 {

    // Tenemos un String que queremos procesar (tokenizar)
    private static String TEXTO = "adipisicing elit. Itaque nostrum perferendis nisi aliquid ratione similique, pariatur voluptates, facere repudiandae debitis repellendus recusandae officia enim reprehenderit odit provident ipsum unde laboriosam.";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(TEXTO)) {
//            scanner.useDelimiter("[.,]");
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }

        }
    }

}
