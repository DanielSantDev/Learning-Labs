package main.java.br.com.danielsantdev.services;

import main.java.br.com.danielsantdev.domain.Cliente;
import main.java.br.com.danielsantdev.exceptions.DAOException;
import main.java.br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.danielsantdev.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
