package main.java.br.com.danielsantdev.services;

import main.java.br.com.danielsantdev.dao.IProdutoDAO;
import main.java.br.com.danielsantdev.domain.Produto;
import main.java.br.com.danielsantdev.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}