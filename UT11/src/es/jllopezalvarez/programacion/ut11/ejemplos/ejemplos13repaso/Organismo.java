package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplos13repaso;

public abstract class Organismo {
	private TipoOrganismo tipoOrganismo;

	public Organismo(TipoOrganismo tipoOrganismo) {
		this.tipoOrganismo = tipoOrganismo;
	}
	
	public TipoOrganismo getTipoOrganismo() {
		return tipoOrganismo;
	}
}
