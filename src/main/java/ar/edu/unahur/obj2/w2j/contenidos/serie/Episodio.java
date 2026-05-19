package ar.edu.unahur.obj2.w2j.contenidos.serie;

public class Episodio {
    private Integer numero;
    private String titulo;
    private Double costo;

    public Episodio(Integer numero, String titulo, Double costo) {
        this.numero = numero;
        this.titulo = titulo;
        this.costo = costo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCosto() {
        return costo;
    }
    
}
