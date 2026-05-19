package ar.edu.unahur.obj2.w2j.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.PlanInterface;
import ar.edu.unahur.obj2.w2j.planes.PlanPremium;

public class Usuario {
    private PlanInterface plan = new PlanPremium(12.0);
    private List<Contenido> listaContenidos = new ArrayList<>();

    public PlanInterface getPlan() {
        return plan;
    }

    public void setPlan(PlanInterface plan) {
        this.plan = plan;
    }

    public void verContenido(Contenido contenido) {
        listaContenidos.add(contenido);
    }

    public Double costoMensual() {
        return plan.costoPlan(this);
    }

    public List<Contenido> getListaContenidos() {
        return listaContenidos;
    }

    public void limpiarContenidos() {
        listaContenidos.clear();
    }

}
