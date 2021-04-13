package br.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.jdbc.dao.ProdutoDao;
import br.com.jdbc.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("VENTILADOR", "Ventilador de teto");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			ProdutoDao produtoDao = new ProdutoDao(connection);
			produtoDao.salvar(produto);
		}
	}

}
