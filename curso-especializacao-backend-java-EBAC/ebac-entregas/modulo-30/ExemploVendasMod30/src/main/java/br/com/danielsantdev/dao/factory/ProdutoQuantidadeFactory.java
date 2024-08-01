package main.java.br.com.danielsantdev.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.br.com.danielsantdev.domain.Produto;
import main.java.br.com.danielsantdev.domain.ProdutoQuantidade;

public class ProdutoQuantidadeFactory {

	public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
		Produto prod = ProdutoFactory.convert(rs);
		ProdutoQuantidade prodQ = new ProdutoQuantidade();
		prodQ.setProduto(prod);
		prodQ.setId(rs.getLong("ID"));
		prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
		prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		return prodQ;
	}
}
