package br.com.danielsantdev.dao.jpa;

import br.com.danielsantdev.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.danielsantdev.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
