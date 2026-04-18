package ar.edu.unahur.obj2.w2j.contenidos.serie;

import java.util.List;

public class Temporada {
    private Integer numero;
    private List<Episodio> episodios;

    public Temporada(Integer numero, List<Episodio> episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public Double costoPromedio() {
        return episodios.stream().mapToDouble(e -> e.getCosto()).average().orElse(0.0);
    }

    public Double costoTotal() {
        return episodios.stream().mapToDouble(e -> e.getCosto()).sum();
    }

    public Integer cantEpisodios(){
        return episodios.size();
    }
    
}
