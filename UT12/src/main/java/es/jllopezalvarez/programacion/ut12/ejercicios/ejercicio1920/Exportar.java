package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio1920;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exportar {
    private static final String CONNECTION_STRING = "jdbc:mariadb://localhost/sakila";
    private static final String USR = "sakilauser";
    private static final String PWD = "pwdsakilauser";

    private static final String PATH_FICHERO_DATOS = "ejercicios/ejercicio1920/customers.dat";

    private static final String SQL_CUSTOMERS = """
            select customer.customer_id,
            customer.store_id,
            customer.first_name,
            customer.last_name,
            customer.email,
            customer.address_id,
            customer.active,
            create_date,
            customer.last_update
            from customer
            where customer_id > ? and customer_id < ?""";

    public static void main(String[] args) throws SQLException {
        List<Customer> customers = leerCustomersBd(20, 40);
        Collections.sort(customers, Comparator
                .comparing(Customer::getFirstName)
                .thenComparing(Customer::getLastName));

        guardarCustomersEnFichero(customers, PATH_FICHERO_DATOS);


//        customers.forEach(System.out::println);
    }

    private static void guardarCustomersEnFichero(List<Customer> customers, String pathFicheroDatos) {

        File ficheroDatos = new File(pathFicheroDatos);
        if (ficheroDatos.exists()) {
            throw new RuntimeException("El fichero de clientes ya existe.");
        }

        // Fuerzo creación de carpetas para el fichero
        ficheroDatos.getParentFile().mkdirs();

        try (ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(ficheroDatos)))) {
            for (Customer customer : customers) {
                stream.writeObject(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static List<Customer> leerCustomersBd(int minId, int maxId) throws SQLException {
        List<Customer> customers = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USR, PWD);
             PreparedStatement ps = connection.prepareStatement(SQL_CUSTOMERS)) {
            ps.setInt(1, minId);
            ps.setInt(2, maxId);

            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.isBeforeFirst()) {
                    // No tiene datos. Si hubiera que indicar algo se haría aquí.
                } else {
                    // Tiene datos. Llenamos la lista
                    while (rs.next()) {
                        int customerId = rs.getInt("customer_id");
                        int storeId = rs.getInt("store_id");
                        String firstName = rs.getString("first_name");
                        String lastName = rs.getString("last_name");
                        String email = rs.getString("email");
                        int addressId = rs.getInt("address_id");
                        boolean active = rs.getBoolean("active");
                        LocalDate fechaCreacion = rs.getTimestamp("create_date")
                                .toLocalDateTime()
                                .toLocalDate();
                        LocalDate fechaActualizacion = rs.getTimestamp("last_update")
                                .toLocalDateTime()
                                .toLocalDate();

                        customers.add(new Customer(
                                customerId,
                                storeId,
                                firstName,
                                lastName,
                                email,
                                addressId,
                                active,
                                fechaCreacion,
                                fechaActualizacion));

                    }
                }
            }

        }

        return customers;
    }


}
