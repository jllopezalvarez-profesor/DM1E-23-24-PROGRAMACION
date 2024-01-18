package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo05herencia.ejemplo01;

public class PruebaInstanceOf {
	public static void main(String[] args) {
		SuperClase o1 = new SuperClase(1);
		SuperClase o2 = new SubClase(1);
		SuperClase o3 = new SubClaseB(1);
		SuperClase o4 = new SubSubClase(1);
		SubSubClase o5 = new SubSubClase(1);

		o5.metodoEnSubSubClase();
		((SubSubClase) o4).metodoEnSubSubClase();

	}
}
