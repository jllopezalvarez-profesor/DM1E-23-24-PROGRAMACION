package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

public abstract class Vegetal extends Organismo {
	private static final TipoOrganismo TIPO_ORGANISMO = TipoOrganismo.PLURICELULAR;

	public Vegetal() {
		super(TIPO_ORGANISMO);
	}
	
	public abstract void fotosintesis(int cantidadLuz);

}
