package main.java.br.com.danielsantdev.services;

import main.java.br.com.danielsantdev.domain.Cliente;
import main.java.br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
