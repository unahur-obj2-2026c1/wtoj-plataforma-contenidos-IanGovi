package contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.contenidos.serie.Documental;
import ar.edu.unahur.obj2.w2j.contenidos.serie.Episodio;
import ar.edu.unahur.obj2.w2j.contenidos.serie.Serie;
import ar.edu.unahur.obj2.w2j.contenidos.serie.Temporada;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;
import ar.edu.unahur.obj2.w2j.plataformas.Plataforma;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlataformaTest {

    @Test
    void testFacturacionMensual() {
        var u1 = new Usuario();
        var u2 = new Usuario();

        Contenido docu = new Documental("docu1", 12.0);

        Temporada t1 = new Temporada(1,
                        Arrays.asList(
                                        new Episodio(1, "t1E1", 6.0),
                                        new Episodio(2, "t1E2", 5.0),
                                        new Episodio(3, "t1E3", 10.0)
                        )
        );

        Contenido serie = new Serie("Maul", 10.0, Arrays.asList(t1));

        u1.verContenido(docu);
        u1.verContenido(serie);
        u1.setPlan(new PlanBasico(1));

        Plataforma.getInstance().agregarUsuario(u1);
        Plataforma.getInstance().agregarUsuario(u2);

        assertEquals(34.0, Plataforma.getInstance().facturacionMensual());
    }
    
}
