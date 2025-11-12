package recursos;

import java.util.List;
import entidades.Venda;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("vendas")
public class VendaRecurso {
    @GET
    public List<Venda> listar () {
        // Você pode querer ordenar por "data" em vez de "id"
        return Venda.listAll(Sort.ascending("id")); 
    }
}