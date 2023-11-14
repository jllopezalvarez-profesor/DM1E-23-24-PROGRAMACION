package es.jllopezalvarez.programacion.ut05.ejemplos;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String contrasenia = pedirContrasenia(scanner);
		
		System.out.println(contrasenia);
		
		
		scanner.close();

	}
	
	
	public static String pedirContrasenia(Scanner sc) {
		System.out.println("Introduce la contraseña");
		
		String pwd = sc.nextLine();
		pwd = pwd.trim();
		pwd = pwd.substring(1);
		pwd = pwd.toUpperCase();
		while(pwd.length() < 10)	{
			System.out.println("La contraseña es demasiado corta, prueba otra");
			pwd = sc.nextLine().trim();
		}

		pwd = sc.nextLine().trim();
		pwd = pwd.substring(1);
		pwd = pwd.toUpperCase();
		
		
		return pwd;
	}

}
