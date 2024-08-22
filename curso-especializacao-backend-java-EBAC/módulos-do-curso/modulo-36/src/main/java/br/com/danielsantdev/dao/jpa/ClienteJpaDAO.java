package br.com.danielsantdev.dao.jpa;

import br.com.danielsantdev.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.danielsantdev.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
