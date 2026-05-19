package ar.edu.unahur.obj2.w2j.contenidos.serie;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;

public class Documental extends Contenido  {

    private static Double idra = 0.5;

    public static void setIdra(Double idra) {
        Documental.idra = idra;
    }

    public Documental(String titulo, Double costo) {
        super(titulo, costo);
    }

    @Override
    public Double getCosto() {
        return costo + idra;
    }

}
