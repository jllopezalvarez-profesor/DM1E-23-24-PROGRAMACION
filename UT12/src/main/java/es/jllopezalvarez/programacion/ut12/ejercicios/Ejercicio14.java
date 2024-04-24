package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Scanner;

public class Ejercicio14 {
    private static  final Path FICHERO_DATOS = Path.of("ejercicios", "ejercicio14", "datos-becas.dat");

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nombre y apellidos del alumno: ");
        String nombreApellidos = scanner.nextLine();
        System.out.print("Edad (20-60): ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Nº de suspensos: ");
        int numSuspensos = Integer.parseInt(scanner.nextLine());
        System.out.print("¿Vive con la familia? (true/false): ");
        boolean viveConFamilia= Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Ingresos: ");
        double ingresos = Double.parseDouble(scanner.nextLine());

        FICHERO_DATOS.toFile().getParentFile().mkdirs();



        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO_DATOS.toFile(), true))) {
            dos.writeUTF(nombreApellidos);
            dos.writeByte(edad);
            dos.writeByte(numSuspensos);
            dos.writeBoolean(viveConFamilia);
            dos.writeDouble(ingresos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
