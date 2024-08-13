package main.java.br.com.danielsantdev.dao;

import java.util.List;

import main.java.br.com.danielsantdev.domain.Produto;

public interface IProdutoDao {

    public Produto cadastrar(Produto produto);

    public void excluir(Produto produto);

    public List<Produto> buscarTodos();

}
