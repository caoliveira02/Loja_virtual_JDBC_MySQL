package br.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.jdbc.dao.ProdutoDao;
import br.com.jdbc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("VENTILADOR", "Ventilador de teto");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			ProdutoDao produtoDao = new ProdutoDao(connection);
			produtoDao.salvar(produto);
			
			List<Produto> listaDeProdutos = produtoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
	}

}
