package recursos;

import java.util.List;

import entidades.Disponibilidade;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

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

   @DELETE
    @Path("{id}") // Alterado de "codigo" para "id" para clareza
    @Transactional
    public void excluir(@PathParam("id") Integer id) {
        // Busca pela Disponibilidade usando o ID
        Disponibilidade disponibilidade = Disponibilidade.findById(id);

        if (disponibilidade != null) {
            disponibilidade.delete();
        }
    }

    @PUT
    @Transactional
    @Path("{id}") // Alterado de "codigo" para "id" para clareza
    public void editar(@PathParam("id") Integer id, Disponibilidade disponibilidade) {
        
        // Busca pela Disponibilidade existente
        Disponibilidade disponibilidadeExistente = Disponibilidade.findById(id);

        if (disponibilidadeExistente != null) {
            
            // Atualiza os campos com base nos dados enviados no corpo da requisição
            disponibilidadeExistente.dia_semana = disponibilidade.dia_semana;
            disponibilidadeExistente.hora_inicio = disponibilidade.hora_inicio;
            disponibilidadeExistente.hora_fim = disponibilidade.hora_fim;

            disponibilidadeExistente.persist();
        }
    }
}