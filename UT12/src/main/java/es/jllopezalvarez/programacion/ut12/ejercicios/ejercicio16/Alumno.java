package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio16;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class Alumno implements Serializable {
    private final String dni;
    private final String nombre;
    private final String apellidos;
    private final LocalDate fechaNacimiento;

    public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
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

    public long getEdad(){
        return ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }
}
