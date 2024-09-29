package br.com.danielsantdev.service;

import java.util.List;

import br.com.danielsantdev.domain.Produto;
import br.com.danielsantdev.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
