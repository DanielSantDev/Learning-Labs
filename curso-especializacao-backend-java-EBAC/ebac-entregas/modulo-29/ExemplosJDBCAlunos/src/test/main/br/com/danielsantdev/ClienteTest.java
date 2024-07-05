package test.main.br.com.danielsantdev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.br.com.danielsantdev.dao.ClienteDAO;
import main.br.com.danielsantdev.dao.IClienteDAO;
import main.br.com.danielsantdev.domain.Cliente;

public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Daniel San");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}
}