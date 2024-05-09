package es.jllopezalvarez.programacion.extra.funcional.ejemplos.ejemplo01;

import java.util.List;
import java.util.Optional;

public class Programa {

    public static void main(String[] args) {
        List<Mascota> mascotas = Mascota.crearMascotasAleatorias(20);

        System.out.println(mascotas);

        Mascota m1 = findMascotaByName(mascotas, "Sandra");
        System.out.printf("Nombre de la mascota encontrada: %s\n", m1.getNombre());

        Mascota m2 = findMascotaByName(mascotas, "Pepe");
        if (m2 != null) {
            System.out.printf("Nombre de la mascota encontrada: %s\n", m2.getNombre());
        }

        Optional<Mascota> m3 = findOptionaMascotaByName(mascotas, "Sandra");
        if (m3.isPresent()) {
            System.out.printf("Nombre de la mascota encontrada: %s\n", m3.get().getNombre());
        }

    }

    private static Mascota findMascotaByName(List<Mascota> mascotas, String name) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(name)) {
                return mascota;
            }
        }
        return null;
    }

    private static Optional<Mascota> findOptionaMascotaByName(List<Mascota> mascotas, String name) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(name)) {
                return Optional.of( mascota);
            }
        }
        return Optional.empty();
    }

}
