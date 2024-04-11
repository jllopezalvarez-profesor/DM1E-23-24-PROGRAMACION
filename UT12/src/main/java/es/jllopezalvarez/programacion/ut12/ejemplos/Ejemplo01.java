package es.jllopezalvarez.programacion.ut12.ejemplos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

public class Ejemplo01 {

    private static final String RUTA_FICHERO = "/home/jllopezalvarez/PruebasFicheros/fichero01.txt";
    private static final Path PATH_FICHERO = Path.of("/", "home", "jllopezalvarez", "PruebasFicheros", "fichero01.txt");
    private static final String RUTA_DIRECTORIO = "/home/jllopezalvarez/PruebasFicheros/directorio/directorio-interior";

    private static final String RUTA_RELATIVA = "fichero.dat";
    public static void main(String[] args) throws IOException {
        System.out.println("Inicio del programa");

        File fichero01 = new File(RUTA_FICHERO);

        if (!fichero01.exists()){
            System.out.printf("El fichero %s no existe\n", RUTA_FICHERO);
            System.out.println("Creo el fichero vacío...");
            fichero01.createNewFile();
        } else{
            System.out.printf("El fichero %s existe y su tamaño es %d\n", RUTA_FICHERO, fichero01.length());
            File dirPadre = fichero01.getParentFile();
            System.out.println("Ficheros en el mismo directorio");
            for (File f :dirPadre.listFiles()) {
                System.out.printf("%s\n", f.getName());

            }
        }

        File ficheroConPath = PATH_FICHERO.toFile();

        File directorio = new File(RUTA_DIRECTORIO);
        if (!directorio.exists()){
            System.out.println("El directorio no existe, lo creo...");
            boolean dirCreado = directorio.mkdirs();
            if (!dirCreado){
                System.out.println("No se ha podido crear el directorio");
            }
        }

        if (directorio.isDirectory()){
        System.out.println("Es un directorio");
        }

        File ficheroRelativo = new File(RUTA_RELATIVA);
        ficheroRelativo.createNewFile();


        System.out.println("Fin del programa");
    }

    private static void generarFactura(UUID idFactura){



    }
}
