package recursos;

import java.util.List;

import entidades.Produto;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("produtos")
public class ProdutoRecurso {
    @GET
    public List<Produto> listar () {
        return Produto.listAll(Sort.ascending("nome"));
    }

    @POST
    @Transactional
    public void salvar(Produto produto) {
        produto.persist();

    }

    @DELETE
    @Path("{codigo}")
    @Transactional
    public void excluir (@PathParam("codigo") Integer codigo) {
        Produto produto = Produto.findById(codigo);

        if (produto != null) {
            produto.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{codigo}")
    public void editar (@PathParam("codigo") Integer codigo, Produto produto){
        Produto produtoexistente = Produto.findById(codigo);

        if(produtoexistente != null) {
            produtoexistente.nome = produto.nome;
            produtoexistente.quantidade = produto.quantidade;
            produtoexistente.preco = produto.preco;
            produtoexistente.categoria = produto.categoria;
            produtoexistente.fabricante = produto.fabricante;

            produtoexistente.persist();
        }
    }
}
