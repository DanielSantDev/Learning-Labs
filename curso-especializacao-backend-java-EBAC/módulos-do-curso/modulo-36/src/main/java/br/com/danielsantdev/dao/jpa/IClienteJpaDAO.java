
package br.com.danielsantdev.dao.jpa;

import br.com.danielsantdev.dao.generic.jpa.IGenericJapDAO;
import br.com.danielsantdev.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
