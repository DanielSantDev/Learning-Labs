package main.java.br.com.danielsantdev.dao;

import java.util.List;

import main.java.br.com.danielsantdev.domain.Curso;

public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}
