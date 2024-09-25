package br.com.danielsantdev.service;

import java.util.List;

import javax.inject.Inject;

import br.com.danielsantdev.dao.IProdutoDAO;
import br.com.danielsantdev.domain.Produto;
import br.com.danielsantdev.service.generic.GenericService;

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
