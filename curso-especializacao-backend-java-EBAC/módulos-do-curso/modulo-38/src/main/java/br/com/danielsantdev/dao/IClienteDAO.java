package br.com.danielsantdev.dao;

import java.util.List;

import br.com.danielsantdev.dao.generic.IGenericDAO;
import br.com.danielsantdev.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
