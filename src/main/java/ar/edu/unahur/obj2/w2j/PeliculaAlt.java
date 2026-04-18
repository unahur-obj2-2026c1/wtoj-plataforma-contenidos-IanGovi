package ar.edu.unahur.obj2.w2j;

public class PeliculaAlt extends ContenidoAlt {

    public PeliculaAlt(String titulo, Double costoBase){
        super(titulo, costoBase);
    }
    @Override
    public Double getCostoBase() {
        return costoBase;
    }
}
