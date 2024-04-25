package es.jllopezalvarez.programacion.ut12.ejercicios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Ejercicio15 {
    private static final Path FICHERO_DATOS = Path.of("ejercicios", "ejercicio14", "datos-becas.dat");
    private static final int INGRESOS_MEDIOS = 12000;

    private static final int EDAD_LIMITE = 23;

    public static void main(String[] args) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO_DATOS.toFile()))) {

            while (true) {
                String nombreApellidos = dis.readUTF();
                int edad = dis.readByte();
                int numSuspensos = dis.readByte();
                boolean viveConFamilia = dis.readBoolean();
                double ingresos = dis.readDouble();

                if (numSuspensos < 2) {
                    double beca = 1500;
                    if (ingresos <= INGRESOS_MEDIOS) {
                        beca += 500;
                    }
                    if (edad < EDAD_LIMITE) {
                        beca += 200;
                    }

                    if (numSuspensos == 0) {
                        beca += 500;
                    } else if (numSuspensos == 1) {
                        beca += 200;
                    }
                    if (!viveConFamilia) {
                        beca += 1000;
                    }
                    System.out.printf("%s - Beca: %.0f", nombreApellidos, beca);
                }
            }
        } catch (EOFException e) {
            // EOFException es de las pocas que podemos dejar vacías (si no única)
        }

    }

}
