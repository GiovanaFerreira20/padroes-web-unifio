package recursos;

import java.util.List;

import entidades.Notificacoes;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("notificacoes")
public class NotificacoesRecurso {
    @GET
    public List <Notificacoes> listar () {
        return Notificacoes.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar(Notificacoes notificacoes) {
        notificacoes.persist();

    }
}
