/**
 * 
 */
package test.java.br.com.danielsantdev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import main.java.br.com.danielsantdev.dao.AlunoDao;
import main.java.br.com.danielsantdev.dao.ComputadorDao;
import main.java.br.com.danielsantdev.dao.CursoDao;
import main.java.br.com.danielsantdev.dao.IAlunoDao;
import main.java.br.com.danielsantdev.dao.IComputadorDao;
import main.java.br.com.danielsantdev.dao.ICursoDao;
import main.java.br.com.danielsantdev.dao.IMatriculaDao;
import main.java.br.com.danielsantdev.dao.MatriculaDao;
import main.java.br.com.danielsantdev.domain.Aluno;
import main.java.br.com.danielsantdev.domain.Computador;
import main.java.br.com.danielsantdev.domain.Curso;
import main.java.br.com.danielsantdev.domain.Matricula;

public class MatriculaTest {
	
	private IMatriculaDao matriculaDao;
	
	private ICursoDao cursoDao;
	
	private IAlunoDao alunoDao;
	
	private IComputadorDao computadorDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
		cursoDao = new CursoDao();
		alunoDao = new AlunoDao();
		computadorDao = new ComputadorDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = criarCurso("A1");
		Aluno aluno = criarAluno("A1");
		
		Matricula mat = new Matricula();
		mat.setCodigo("A1");
		mat.setDataMatricula(Instant.now());
		mat.setStatus("ATIVA");
		mat.setValor(2000d);
		mat.setCurso(curso);
		mat.setAluno(aluno);
		
		aluno.setMatricula(mat);
		mat = matriculaDao.cadastrar(mat);
		
		assertNotNull(mat);
		assertNotNull(mat.getId());
		
		Matricula matBD = matriculaDao.buscarPorCodigoCurso(mat.getCodigo());
		assertNotNull(matBD);
		assertEquals(mat.getId(), matBD.getId());
		
		Matricula matBDObj = matriculaDao.buscarPorCurso(curso);
		assertNotNull(matBDObj);
		assertEquals(mat.getId(), matBDObj.getId());
	}
	
	private Computador criarComputador(String codigo) {
		Computador comp = new Computador();
		comp.setCodigo(codigo);
		comp.setDescricao("Comp 1");
		return comp;
		//return computadorDao.cadastrar(comp);
	}

	private Aluno criarAluno(String codigo) {
		Computador comp = criarComputador("A1");
		Computador comp2 = criarComputador("A2");
		Aluno aluno = new Aluno();
		aluno.setCodigo(codigo);
		aluno.setNome("Daniel");
		aluno.add(comp);
		aluno.add(comp2);
		//comp.add(aluno);
		//comp2.add(aluno);
		return alunoDao.cadastrar(aluno);
	}

	private Curso criarCurso(String codigo) {
		Curso curso = new Curso();
		curso.setCodigo(codigo);
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		return cursoDao.cadastrar(curso);
	}
}
