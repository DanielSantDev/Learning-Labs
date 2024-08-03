package test.java.br.com.danielsantdev;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.java.br.com.danielsantdev.dao.ClienteDaoMock;
import main.java.br.com.danielsantdev.dao.IClienteDAO;
import main.java.br.com.danielsantdev.domain.Cliente;
import main.java.br.com.danielsantdev.exceptions.DAOException;
import main.java.br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.danielsantdev.services.ClienteService;
import main.java.br.com.danielsantdev.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Daniel San");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setEmail("Danielsantdev@gmail.com");
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Daniel San");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Daniel San", cliente.getNome());
	}
}
