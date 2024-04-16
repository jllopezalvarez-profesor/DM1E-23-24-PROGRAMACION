package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio05 {

    private static final Path FICHERO_SALIDA = Path.of("ejercicios", "03", "parrafo.txt");
    // Alternatica a Path:
//    private static final String FICHERO_SALIDA_STR = "ejercicios/03/parrafo.txt";

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Asegurar que existe el directorio de destino
        FICHERO_SALIDA.toFile().getParentFile().mkdirs();

        // Abrir un FileWriter y "rodearlo" con un BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_SALIDA.toFile()))){
            System.out.println("Introduce lineas de texto, una línea \"FIN\" para terminar.");
            String textoUsuario;
            do {
                textoUsuario = scanner.nextLine();
                writer.write(textoUsuario);
                writer.newLine();
            }while(!textoUsuario.equals("FIN"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
