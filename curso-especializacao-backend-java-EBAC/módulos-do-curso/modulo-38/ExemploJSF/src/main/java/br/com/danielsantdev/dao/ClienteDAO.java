package main.java.br.com.danielsantdev.dao;

import main.java.br.com.danielsantdev.dao.generic.GenericDAO;
import br.com.danielsantdev.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
