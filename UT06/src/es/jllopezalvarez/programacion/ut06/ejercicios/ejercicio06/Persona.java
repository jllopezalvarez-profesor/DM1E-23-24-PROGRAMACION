package es.jllopezalvarez.programacion.ut06.ejercicios.ejercicio06;

import java.util.Random;

public class Persona {
	private static final int PESO_DEFECTO = 0;
	private static final int ALTURA_DEFECTO = 0;
	private static final int EDAD_DEFECTO = 0;
	private static final Sexo SEXO_DEFECTO = Sexo.MUJER;
	private static final int EDAD_MAYORIA_EDAD = 18;

	private String nombre;
	private int edad;
	private String dni;
	private Sexo sexo;
	private double peso;
	private int altura;

	public Persona() {
		this("", generarDniAleatorio());
	}

	public Persona(String nombre, String dni) {
		this(nombre, EDAD_DEFECTO, dni, SEXO_DEFECTO);
	}

	public Persona(String nombre, int edad, String dni, Sexo sexo) {
		this(nombre, edad, dni, sexo, PESO_DEFECTO, ALTURA_DEFECTO);
	}

	public Persona(String nombre, int edad, String dni, Sexo sexo, double peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		if (sexo == null) {
			System.out.println("Error: el sexo no puede ser nulo.");
			return;
		}
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", dni=");
		builder.append(dni);
		builder.append("]");
		return builder.toString();
	}

	private static String generarDniAleatorio() {
		Random rnd = new Random();
		int numero = rnd.nextInt(100_000_000);
		// char letra = (char) rnd.nextInt(65, 90 + 1);
		char letra = (char) rnd.nextInt((int) 'A', (int) 'Z' + 1);

		// String dni = String.valueOf(numero);

		String dni = String.format("%08d", numero);
		dni = dni + letra;
		return dni;
	}

	public boolean esMayorEdad() {
		return this.edad >= EDAD_MAYORIA_EDAD;
	}

	public int calcularImc() {
		double imc = this.peso / Math.pow((double) this.altura / 100, 2);
		if (imc < 20) {
			return -1;
		}
		if (imc > 25) {
			return 1;
		}
		return 0;
	}
}
