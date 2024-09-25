package br.com.danielsantdev.service;

import br.com.danielsantdev.dao.generic.IGenericDAO;
import br.com.danielsantdev.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda);

	public void cancelarVenda(Venda venda);

	public Venda consultarComCollection(Long id);

}
