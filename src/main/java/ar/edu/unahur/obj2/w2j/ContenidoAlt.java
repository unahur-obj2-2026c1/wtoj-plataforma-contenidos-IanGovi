package ar.edu.unahur.obj2.w2j;

public abstract class ContenidoAlt {
    protected String titulo;
    protected Double costoBase;
    public ContenidoAlt(String titulo, Double costoBase){
        this.titulo=titulo
        this.costoBase=costoBase
    }
    public abstract Double calcularCostoLicencia(){
        return costoBase;
    }


}


