package es.jllopezalvarez.programacion.ut12.ejercicios.ejercicio10;

import java.time.LocalDate;

public class Media {
    private int id;
    private String titulo;
    private String artistaPrincipal;
    private String productora;
    private LocalDate fechaPublicacion;
    private TipoMedio tipo;

    public Media(int id, String titulo, String artistaPrincipal, String productora, LocalDate fechaPublicacion, TipoMedio tipo) {
        this.id = id;
        this.titulo = titulo;
        this.artistaPrincipal = artistaPrincipal;
        this.productora = productora;
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public String getProductora() {
        return productora;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public TipoMedio getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Media{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", artistaPrincipal='").append(artistaPrincipal).append('\'');
        sb.append(", productora='").append(productora).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
