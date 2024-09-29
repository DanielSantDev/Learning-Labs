package br.com.danielsantdev.dao;

import java.util.List;

import br.com.danielsantdev.dao.generic.IGenericDAO;
import br.com.danielsantdev.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
