package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {
    private String titulo;
    protected Double costo;

    public Contenido(String titulo, Double costo) {
        this.titulo = titulo;
        this.costo = costo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCosto() {
        return costo;
    }

    /* 
    public Contenido(String titulo) {
        this.titulo = titulo;
        this.costo = 0;
    }

    public Contenido(Integer costo) {
        this.titulo = "desconocido";
        this.costo = costo;
    }

    public Contenido() {
        this.titulo = "desconocido";
        this.costo = 0;
    }
    */
}
