package es.jllopezalvarez.programacion.ut11.ejemplos.ejemplo02asociacion;

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

	public String getProvincia() {
		return provincia;
	}

	public String getPais() {
		return pais;
	}

	
}
