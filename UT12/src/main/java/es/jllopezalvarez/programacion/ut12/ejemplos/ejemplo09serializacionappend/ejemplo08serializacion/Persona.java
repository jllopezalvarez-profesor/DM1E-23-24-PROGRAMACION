package es.jllopezalvarez.programacion.ut12.ejemplos.ejemplo09serializacionappend.ejemplo08serializacion;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable {
    private final int id;
    private final String nombre;
    private final String apellidos;
    private final LocalDate fechaNacimiento;

    public Persona(int id, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
