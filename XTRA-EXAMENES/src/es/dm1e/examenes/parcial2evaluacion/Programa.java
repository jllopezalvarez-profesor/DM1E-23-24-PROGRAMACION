package es.dm1e.examenes.parcial2evaluacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<>();

		personas.add(new Persona("1234343D", "José Luis", "López"));
		personas.add(new Persona("4234253R", "Antonia", "Del Moral"));
		personas.add(new EmpleadoFijo("5424233E", "José Antonio", "Ruíz", Departamento.DESARROLLO));
		personas.add(new EmpleadoFijo("7853455E", "Inés", "López", Departamento.SISTEMAS, LocalDate.of(2010, 4, 17)));
		personas.add(new EmpleadoTemporal("5434233E", "Jaime", "Martínez", LocalDate.of(2024, 12, 31),
				Departamento.ADMINISTRACION));
		personas.add(new EmpleadoTemporal("7884334T", "Mónica", "López", Departamento.SISTEMAS,
				LocalDate.of(2023, 4, 17), LocalDate.of(2024, 4, 17)));

		personas.sort(null);
		// Collections.sort(personas);
		// Arrays.sort(null);
		mostrarDatosEmpleados(personas);
		System.out.println("+".repeat(100));

		// Ascendente
		personas.sort(Comparator.comparing(Persona::getApellidos));
		mostrarDatosEmpleados(personas);
		System.out.println("+".repeat(100));

		// Descendente por apellido y después ascendente por nombre
		personas.sort(Comparator.comparing(Persona::getApellidos).reversed()
				.thenComparing(Comparator.comparing(Persona::getNombre)));
		mostrarDatosEmpleados(personas);
		System.out.println("+".repeat(100));
	}

	private static void mostrarDatosEmpleados(List<Persona> personas) {
		for (Persona persona : personas) {
			System.out.printf("%s - %s %s\n", persona.getDni(), persona.getNombre(), persona.getApellidos());
			if (persona instanceof EmpleadoFijo) {
				EmpleadoFijo empleado = (EmpleadoFijo) persona;
				System.out.printf("%S - Antiguedad: %d meses - SS: %.2f - Desempleo: %.2f\n",
						empleado.getDepartamento(), empleado.getAntiguedad(), empleado.getCotizacionSeguridadSocial(),
						empleado.getCotizacionDesempleo());
			} else if (persona instanceof EmpleadoTemporal) {
				EmpleadoTemporal empleado = (EmpleadoTemporal) persona;
				System.out.printf(
						"%S - Antiguedad: %d meses - SS: %.2f - Desempleo: %.2f - Fiempo hasta fin de contrato %d dias\n",
						empleado.getDepartamento(), empleado.getAntiguedad(), empleado.getCotizacionSeguridadSocial(),
						empleado.getCotizacionDesempleo(), empleado.getTiempoRestanteContrato());
			}
			System.out.println("-".repeat(100));
		}
	}
}
