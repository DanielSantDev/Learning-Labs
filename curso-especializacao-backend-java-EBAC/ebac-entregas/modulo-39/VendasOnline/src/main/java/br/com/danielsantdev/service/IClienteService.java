package br.com.danielsantdev.service;

import java.util.List;

import br.com.danielsantdev.domain.Cliente;
import br.com.danielsantdev.exceptions.DAOException;
import br.com.danielsantdev.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
