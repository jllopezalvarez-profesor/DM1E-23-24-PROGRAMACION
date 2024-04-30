package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio1920;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Informe {
    private static final String PATH_FICHERO_DATOS = "ejercicios/ejercicio1920/customers.dat";
    private static final String PATH_FICHERO_INFORME = "ejercicios/ejercicio1920/customers.txt";



    public static void main(String[] args) throws SQLException {
        List<Customer> customers = leerCustomersFichero(PATH_FICHERO_DATOS);

        Collections.sort(customers, Comparator.comparing(Customer::getLastName).thenComparing(Customer::getFirstName));

        generarInformeTexto(customers, PATH_FICHERO_INFORME);


//        customers.forEach(System.out::println);

    }

    private static void generarInformeTexto(List<Customer> customers, String pathFicheroInforme) {

        try (PrintWriter pw = new PrintWriter(new File(pathFicheroInforme))) {
            pw.printf("| %5.5s | %-20.20s | %-20.20s | %-10.10s |   %s   | %s | %s |\n",
            "ID", "APELLIDOS", "NOMBRE", "EMAIL", "ACT", "CREADO", "ACTUALIZADO");

            for (Customer customer: customers) {
//                pw.println(customer);
                pw.println("-".repeat(104));
                pw.printf("| %5d | %-20.20s | %-20.20s | %-10.10s |   %s   | %s | %s |\n",
                        customer.getCustomerId(),
                        customer.getLastName(),
                        customer.getFirstName(),
                        customer.getEmail(),
                        customer.isActive()?"SI": "NO",
                        customer.getFechaCreacion(),
                        customer.getFechaActualizacion());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Customer> leerCustomersFichero(String pathFicheroDatos) {
        List<Customer> customers = new ArrayList<>();

        File ficheroDatos = new File(pathFicheroDatos);
        if (!ficheroDatos.exists()) {
            throw new RuntimeException("No existe el fichero de datos");
        }
        try (ObjectInputStream stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(ficheroDatos)))) {

            while (true) {
                Customer customer = (Customer) stream.readObject();
                customers.add(customer);
            }


        } catch (EOFException e) {
            // Alcanzado final de fichero
            // El programa salta al catch y hace que se salga del bucle infinito
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return customers;
    }


}
