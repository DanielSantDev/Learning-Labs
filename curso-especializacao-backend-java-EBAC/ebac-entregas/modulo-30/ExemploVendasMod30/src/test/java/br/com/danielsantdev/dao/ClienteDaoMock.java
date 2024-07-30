package test.java.br.com.danielsantdev.dao;

import test.java.util.Collection;

import main.java.br.com.danielsantdev.domain.Cliente;
import main.java.br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.danielsantdev.dao.IClienteDAO;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}


}
