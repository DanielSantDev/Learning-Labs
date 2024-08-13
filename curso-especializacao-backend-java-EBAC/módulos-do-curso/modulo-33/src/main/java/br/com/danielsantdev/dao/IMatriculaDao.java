package main.java.br.com.danielsantdev.dao;

import main.java.br.com.danielsantdev.domain.Curso;
import main.java.br.com.danielsantdev.domain.Matricula;

public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);
	
	Matricula buscarPorCodigoCurso(String codigoCurso);
	
	Matricula buscarPorCurso(Curso curso);
	
	Matricula buscarPorCodigoCursoCriteria(String codigoCurso);
	
	Matricula buscarPorCursoCriteria(Curso curso);

}
