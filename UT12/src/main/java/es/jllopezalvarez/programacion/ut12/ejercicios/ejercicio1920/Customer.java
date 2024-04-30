package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio1920;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {
    private final int customerId;
    private final int storeId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final int addressId;
    private final boolean active;
    private final LocalDate fechaCreacion;
    private final LocalDate fechaActualizacion;

    public Customer(int customerId, int storeId, String firstName, String lastName, String email, int addressId, boolean active, LocalDate fechaCreacion, LocalDate fechaActualizacion) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.active = active;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getStoreId() {
        return storeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAddressId() {
        return addressId;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("customerId=").append(customerId);
        sb.append(", storeId=").append(storeId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", addressId=").append(addressId);
        sb.append(", active=").append(active);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaActualizacion=").append(fechaActualizacion);
        sb.append('}');
        return sb.toString();
    }
}
