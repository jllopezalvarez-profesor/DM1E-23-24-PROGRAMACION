package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo03aproblemaasociacion;

public class Direccion {
	private String ciudad;
	private String provincia;
	private String pais;

	public Direccion(String ciudad, String provincia, String pais) {
		this.ciudad = ciudad;
		this.provincia =provincia;
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
