package es.jllopezalvarez.programacion.ut09.ejemplos;

public class Ejemplo05Jerarquia {
	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt("cinco");
			System.out.println(numero);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch(IllegalStateException e) {
			
		}
		catch(IllegalArgumentException e) {
			
		}	
		catch (RuntimeException e) {
			
		}

		
		
		
	}
}
