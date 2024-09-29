package br.com.danielsantdev.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.danielsantdev.dao.IProdutoDAO;
import br.com.danielsantdev.domain.Produto;
import br.com.danielsantdev.services.generic.GenericService;

@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
