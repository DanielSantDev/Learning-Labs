package test.main.br.com.danielsantdev;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import main.java.br.com.danielsantdev.dao.ProdutoDao;
import main.java.br.com.danielsantdev.dao.IProdutoDao;
import main.java.br.com.danielsantdev.domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("P1");
        produto.setDescricao("PRODUTO TESTE");
        produto.setNome("Monitor ACER 27'' ");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }

}
