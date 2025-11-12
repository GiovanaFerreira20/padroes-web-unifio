package recursos;

import java.util.List;

import entidades.Disponibilidade;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("disponibilidade")
public class DisponibilidadeRecurso {
    @GET
    public List <Disponibilidade> listar () {
        return Disponibilidade.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Disponibilidade disponibilidade) {
        disponibilidade.persist();

    }
}
