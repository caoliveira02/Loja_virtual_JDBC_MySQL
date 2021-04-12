package br.com.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connectionFactory = criaConexao.recuperarConexao();

		System.out.println("Fechando a conexão");
		
		connectionFactory.close();
	}

}
