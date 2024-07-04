package java.main.br.com.danielsantdev.dao;

import java.main.br.com.danielsantdev.domain.Cliente;

public interface IClienteDAO {

	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;
}
