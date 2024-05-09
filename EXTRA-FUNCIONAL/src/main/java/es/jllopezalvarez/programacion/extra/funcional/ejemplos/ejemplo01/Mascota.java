package es.jllopezalvarez.programacion.extra.funcional.ejemplos.ejemplo01;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mascota {

    private static Faker faker = new Faker(new Random(1));

    private final int id;
    private final String nombre;

    public Mascota(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static Mascota crearMascotaAleatoria(){
        return new Mascota(faker.number().positive(), faker.name().firstName());
    }

    public static List<Mascota> crearMascotasAleatorias(int cuantas){
        List<Mascota> mascotas = new ArrayList<>();
        while (cuantas-- > 0){
            mascotas.add(crearMascotaAleatoria());
        }
        return mascotas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("es.jllopezalvarez.programacion.extra.funcional.ejemplos.ejemplo01.Mascota{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
