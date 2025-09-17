package entidades;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ProdutoTests {
    @Test
    @Transactional
    public void testBuscaUmaCategoria(){
        Produto produto = new Produto();
        produto.nome = "Fanta 2 litros";
        produto.preco = 7.00;
        produto.quantidade = 10;
        produto.validade = LocalDate.of(2025,11,15);
        produto.categoria = Categoria.findById(1);
        produto.fabricante = Fabricante.findById(8);
        produto.persist();
        Assertions.assertEquals(11, produto.codigo);
    }

}
