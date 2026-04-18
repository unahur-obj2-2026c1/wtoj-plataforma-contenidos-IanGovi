package ar.edu.unahur.obj2.w2j.contenidos.serie;

import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class Serie extends Contenido {

    protected List<Temporada> temporadas;

    public Serie(String titulo, Double costo, List<Temporada> temporadas) {
        super(titulo, costo);
        this.temporadas = temporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public Double getCosto() {
        return costo + temporadas.stream().mapToDouble(t -> t.costoPromedio()).average().orElse(0.0);
        //Integer cantEpisodios = temporadas:stream().mapToInt(t -> t.cantEpisodios()).sum();
        //Double costoTotal = temporadas.stream().mapToDouble(t -> t.costoTotal()).sum();
        //return costo + (costoTotal / cantEpisodios);
    }

    
    
}
