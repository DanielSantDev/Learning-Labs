package br.com.danielsantdev.dao;

import br.com.danielsantdev.dao.generic.IGenericDAO;
import br.com.danielsantdev.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	void finalizarVenda(Venda venda);

	void cancelarVenda(Venda venda);

	Venda consultarComCollection(Long id);

}
