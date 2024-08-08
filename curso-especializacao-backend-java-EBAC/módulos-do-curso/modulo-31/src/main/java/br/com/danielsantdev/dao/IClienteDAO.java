package main.java.br.com.danielsantdev.dao;

import java.util.List;

import main.java.br.com.danielsantdev.domain.Cliente;

public interface IClienteDAO {

	public Cliente cadastrar(Cliente cliente);

	public Cliente buscarPorID(Long id);

	public void excluir(Cliente cliente);

	public Cliente alterar(Cliente cliente);

	public List<Cliente> buscarTodos();
}
