package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

public abstract class Animal extends Organismo {
	private static final TipoOrganismo TIPO_ORGANISMO = TipoOrganismo.PLURICELULAR;

	public Animal() {
		super(TIPO_ORGANISMO);
	}
	
	public abstract void comer(String alimento);

}
