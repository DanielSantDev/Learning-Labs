package test.br.com.danielsantdev;

import org.junit.Assert;
import org.junit.Test;

import br.com.danielsantdev.TesteCliente;

public class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Daniel");
        cli.adicionarNome1("Daniel");

        Assert.assertEquals("Daniel", cli.getNome());
    }
}