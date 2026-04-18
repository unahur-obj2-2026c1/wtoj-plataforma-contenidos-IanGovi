package ar.edu.unahur.obj2.w2j.contenidos.serie;

import java.util.List;

public class Documental extends Serie  {

    private static Double idra = 0.5;

    public static void setIdra(Double idra) {
        Documental.idra = idra;
    }

    public Documental(String titulo, Double costo, List<Temporada> temporadas) {
        super(titulo, costo, temporadas);
    }

    @Override
    public Double getCosto() {
        return costo + idra;
    }

}
