package ar.edu.unahur.obj2.w2j.plataformas;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class Plataforma {

    private static Plataforma instance = new Plataforma();

    private List<Usuario> usuarios = new ArrayList<>();

    public static Plataforma getInstance() {
        return instance;
    }

    public Double facturacionMensual() {
        return usuarios.stream().mapToDouble(u -> u.costoMensual()).sum();
    }

    public void limpiarContenidos() {
        usuarios.forEach(u -> u.limpiarContenidos());
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void sacarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void limpiarUsuarios() {
    usuarios.clear();
    }
}
