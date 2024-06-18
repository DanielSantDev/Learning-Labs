package main.java.br.com.danielsantdev.dao;

import main.java.br.com.danielsantdev.dao.generic.IGenericDAO;
import main.java.br.com.danielsantdev.domain.Venda;
import main.java.br.com.danielsantdev.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}