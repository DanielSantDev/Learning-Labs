package test.java.br.com.danielsantdev;

import org.junit.Test;

import main.java.br.com.danielsantdev.domain.Pessoa;

public class PessoaTest {

	@Test
	public void cadastrar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Daniel");
		pessoa.addApelido("Daniel San");
		//pessoaDao.cadastrar(pessoa);
	}
}
